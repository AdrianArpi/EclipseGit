package creacionMenu;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

/**
 * En esta clase se creara un menu simple (el primero)
 * @author adria
 *
 */

public class Menu1 extends JFrame{
	
	private JMenuBar miBarra;
	private JMenu archivo,edicion,herramientas;
	private JMenu opciones; //Este pertenecera a EDICIONES para crear items dentro
	private JMenuItem opcion1,opcion2; //PERTENECE A OPCIONES
	private JMenuItem guardar,guardarComo; //Pertenecena a ARCHIVO
	private JMenuItem cortar,copiar,pegar; //Pertenecen a EDICION
	private JMenuItem generales; //Pertenece a HERRAMIENTAS
	
	private JTextPane miTexto;

	public Menu1() {
			
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Primer menú");
		this.setBounds(400, 200, 400, 400);
		
		this.Dibujar();
	
		
	}
	
	private void Dibujar() {
		this.setLayout(new BorderLayout());
		
		JPanel panelMenu= new JPanel();
		this.add(panelMenu,BorderLayout.NORTH   );
		
		//Primro creamos la barra de herramientas
		miBarra= new JMenuBar();
		
		
		//Luego creamos los elementos que tendra (se crearan como botones) 
		archivo= new JMenu("Archivo");
		edicion= new JMenu("Edicion");
		herramientas= new JMenu("Herramientas");
		
		opciones= new  JMenu("Opciones"); //Pertenecera a otro menu ya existente ******
		
		
		//Despues de crear los elementos y antes de añadirlos a la barra, creamos sus items para posteriormente agregarlos a los elementos
		guardar= new JMenuItem("Guardar");
		guardarComo= new JMenuItem("Guardar Como");
		archivo.add(guardar);
		archivo.add(guardarComo);
		
		//Estas imagenes gif admiten transparencia (a ser posible mejor de este tipo)
		//Por defecto se posicionan a la derecha de la imagen
		cortar= new JMenuItem("Cortar", new ImageIcon("cortar.gif"));
		copiar= new JMenuItem("Copiar", new ImageIcon("copiar.gif"));
		pegar= new JMenuItem("Pegar", new ImageIcon("pegar.gif"));
		
		//Para cambiar la posicion de la imagen 
		cortar.setHorizontalTextPosition(SwingConstants.LEFT);
		copiar.setHorizontalTextPosition(SwingConstants.LEFT);
		pegar.setHorizontalTextPosition(SwingConstants.LEFT);
		
		opcion1= new JMenuItem("Opcion 1");
		opcion2= new JMenuItem("Opcion 2");
		opciones.add(opcion1);
		opciones.add(opcion2);
		
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		
		edicion.addSeparator(); //Esto genera una linea de separacion entre estas opciones
		
		edicion.add(opciones); //*****
		
		generales = new JMenuItem("Generales");
		herramientas.add(generales);
		
		//Añadimos los elementos a la barra
		miBarra.add(archivo);
		miBarra.add(edicion);
		miBarra.add(herramientas);
		
		//Y por ultimo añadimos la barra a la ventana
		panelMenu.add(miBarra);
		
		
		//Iniciamos el texto y lo añadimos al panel principal
		miTexto= new JTextPane();
		miTexto.setFont(new Font("Serif", Font.PLAIN, 20));
		this.add(miTexto,BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args) {
		
		new Menu1();

	}

}
