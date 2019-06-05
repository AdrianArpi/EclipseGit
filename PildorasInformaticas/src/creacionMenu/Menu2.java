package creacionMenu;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

/**
 * Creacion de un menu para editar texto (COMPLETO)
 * @author adria
 *
 */

class Menu2 extends JFrame{
	
	private JTextPane areaTexto;
	private JPanel laminaMenu;
	private JMenuBar barraMenu;
	private JMenu fuente, estilo, tamagno;
	private Font letras;
	
	public Menu2(){
			this.setVisible(true);
			this.setBounds(400,200,550,350);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("Mi procesador de texto");
			
			this.Dibujo();
		}
	
	private void Dibujo(){
		
		this.setLayout(new BorderLayout());
		laminaMenu = new JPanel();
		this.add(laminaMenu, BorderLayout.NORTH);
		areaTexto= new JTextPane();
		areaTexto.setFont(new Font("Arial", Font.PLAIN, 20));
		this.add(areaTexto, BorderLayout.CENTER);
		
		barraMenu = new JMenuBar();
		laminaMenu.add(barraMenu);
		
		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		tamagno = new JMenu("Tamaño");
		
		barraMenu.add(fuente);
		barraMenu.add(estilo);
		barraMenu.add(tamagno);
		
		configuraMenu("Arial","fuente", 10,"");
		configuraMenu("Courier","fuente", 10,"");
		configuraMenu("Verdana","fuente", 10,"");
		configuraMenu("Negrita","estilo", Font.BOLD,"pegar.gif"); //Valido como prueba
		configuraMenu("Cursiva","estilo", Font.ITALIC,"");
		configuraMenu("12","tamagno", 12,"");
		configuraMenu("16","tamagno", 16,"");
		configuraMenu("20","tamagno", 20,"");
		configuraMenu("24","tamagno", 24,"");
		
		letras = areaTexto.getFont();
	}
	
	public void configuraMenu(String rotulo, String menu, int val,String rutaIcono){
		
		JMenuItem elem_menu = new JMenuItem(rotulo, new ImageIcon(rutaIcono));
		if(menu=="fuente"){
			fuente.add(elem_menu);
		}else if(menu=="estilo"){
			estilo.add(elem_menu);
		}else if(menu=="tamagno"){
			tamagno.add(elem_menu);
		}

		elem_menu.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				areaTexto.setFont(letras); //Hacemos que letras obtenga toda la fuente del area de texto
				
				if(menu=="fuente"){
					
					letras = new Font(rotulo, letras.getStyle(), letras.getSize());
				}
				else if (menu=="estilo"){
					
						if((letras.getStyle()+val)>Font.BOLD+Font.ITALIC || (letras.getStyle()==val)){
							
							letras=letras.deriveFont(letras.getStyle()-val);
						}else{
							
							letras=letras.deriveFont(letras.getStyle()+val);
						}
					}
				 
				else if (menu=="tamagno"){ 
					
					float tam2 = val;
					letras=letras.deriveFont(tam2);
				}
				
				
			}
		});
	}
	
	public static void main(String[] args) {
		
		new Menu2();
	}
}