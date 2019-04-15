package Eventos;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventoFoco1 {

	public static void main(String[] args) {

		ventana2 str=new ventana2();
		str.setVisible(true);
		str.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}

}

class ventana2 extends JFrame{
	
	public ventana2() {
		
		setTitle("Adrian");
		setSize(500,500);
		setLocationRelativeTo(null);
		
		add(new foco());
	}
}

class foco extends JPanel{
	
	JTextField cuadro1;
	JTextField cuadro2;
	
	//Metodo para crear componentes de texto
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//Invalidamos Layout
		setLayout(null);
		
		//Instanciamos los cuadros
		cuadro1=new JTextField();
		cuadro2=new JTextField();
		
		//Les damos un tamaño xq invalidamos LAYOUT
		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);
		
		
		
		//Los agregamos a la lamina
		add(cuadro1);
		add(cuadro2);
		
		//Instanciamos y agregamos la nueva clase
		focos foco1=new focos();
		cuadro1.addFocusListener(foco1);
		
	}
	//Clase interna para poder acceder a los cuadros
	private class focos implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			//System.out.println("Foco1 -Tengo el poder...");
			
			//Validacion de un correo electronico
			String email=cuadro1.getText();
			
			boolean comprobacion=false;
			
			for (int i = 0; i < email.length(); i++) {
				
				if (email.charAt(i)=='@') {
					
					comprobacion=true;
					
					
				}
				
				
				
			}
			
			if (comprobacion) {
					
					System.out.println("Correcto");
					
				}else {
					System.out.println("Incorrecto");
					Toolkit.getDefaultToolkit().beep();
				}
			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			System.out.println("Foco2 -Tengo el poder...");
			
		}
		
		
		
	}
	
}

