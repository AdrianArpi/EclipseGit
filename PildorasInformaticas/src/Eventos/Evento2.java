package Eventos;

import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Evento2 {

	public static void main(String[] args) {
		
		//Elegimos las caracteristicas por separado
		
		primerEvento str =new primerEvento();
		str.setTitle("Ventana1");
		str.setVisible(true);
		str.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Se cerraran las dos ventanas
		
		
		//Creacion de nueva ventana, que adquiere propiedades de la primera excepto una nueva accion que declaremos
		primerEvento adr=new primerEvento();
		adr.setTitle("Ventana2");
		adr.setVisible(true);
		adr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Solo se cerrara la segunda ventana
		adr.setLocationRelativeTo(null);
		
	}

}

class primerEvento extends JFrame{
	
	public primerEvento () {
		
		//setTitle("Evento con consola");
		setSize(500,500);
		//setLocationRelativeTo(null);
		
		
		//Instanciamos ventana
		M_Ventana oyente=new M_Ventana();
		
		addWindowListener(oyente);
	}
}



//Implementamos Window
class M_Ventana extends WindowAdapter{ //Con esta nueva herencia no hace falta implementar 7 metodos
	
	//De momento es obligatorio implementar sus 7 metodos
//	public void windowActivated(WindowEvent e) {
//		
//		System.out.println("Ventana activada");
//	}
	
//	public void windowClosed(WindowEvent e) {
//			
//		System.out.println("La ventana ha sido cerrada");//Aplica a DISPOSE_ON_CLOSE
//		
//		}
	
	//public void windowClosing(WindowEvent e) {
		
		//JOptionPane.showMessageDialog(null,"La ventana sera cerrada","Advertencia", JOptionPane.YES_NO_OPTION);
		//System.out.println("La ventana ha sido cerrada");
		//Toolkit.getDefaultToolkit().beep();
		
	//}
	
//	public void windowDeactivated(WindowEvent e) {
//		
//		System.out.println("Ventana desavtivada");
//	}
	
	//Metodo de minimizar a estado normal
//	public void windowDeiconified(WindowEvent e) {
//		
//		System.out.println("La ventana regresa al estado normal normal");
//		
//	}
	
	//Al momento de minimizar la ventana
	public void windowIconified(WindowEvent e) {
		System.out.println("La ventana ha sido minimizada");
		
		
	}
	
//	public void windowOpened(WindowEvent e) {
//		System.out.println("Ventana Abierta");
//		
//	}
	
	
	
	
}