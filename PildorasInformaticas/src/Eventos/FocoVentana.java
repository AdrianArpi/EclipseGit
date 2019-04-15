package Eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class FocoVentana extends JFrame implements WindowFocusListener{

	FocoVentana marco1;
	FocoVentana marco2;
	
	
	
	public static void main(String[] args) {

		
		FocoVentana lona=new FocoVentana();
		lona.iniciar();
		
		
		
	}
	
	
	//Metodo para instanciar
	public void iniciar() {
		
		
		marco1=new FocoVentana();
		marco1.setSize(500,500);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco1.addWindowFocusListener(this);
		marco1.setVisible(true);
		
		
		marco2=new FocoVentana();
		marco2.setSize(500,500);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.addWindowFocusListener(this);
		marco2.setVisible(true);
		marco2.setLocationRelativeTo(null);
	}
	
	
	
//Metodos creados a partir de la interfaz que se implementa
	@Override
	public void windowGainedFocus(WindowEvent e) {
		
		//Obtenemos el que ha generado el enento
		if (e.getSource()==marco1) {
			
			marco1.setTitle("Tengo el foco");
			
		}else {
			marco2.setTitle("Tengo el foco");
			
		}
		
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		//Obtenemos el que ha generado el enento
		if (e.getSource()==marco1) {
			
			marco1.setTitle("No lo tengo :'D");
			
		}else {
			marco2.setTitle("Na no lo tengo :'D");
			
		}
				
		
	}
	
	
	
	

}
