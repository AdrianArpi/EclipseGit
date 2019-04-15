package Eventos;

import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import poo.Pruebas;

public class EventoTeclado1 {

	public static void main(String[] args) {

		ventana str=new ventana();
		
		str.setVisible(true);
		str.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class ventana extends JFrame{
	
	
	public ventana() {
		
		setTitle("Adrian");
		setSize(500,500);
		setLocationRelativeTo(null);
		
		//Instanciamos la clase que escuha
		pruebas adr=new pruebas();
		addKeyListener(adr);
		
		//Añadimos el evento del raton
		pruebaRaton mar=new pruebaRaton();
		addMouseListener(mar);
		
		//Instanciamos un objeto que deriva de la interfaz
		pruebaRaton mod=new pruebaRaton();
		addMouseMotionListener(mod);

	
	}
}

class pruebas implements KeyListener{

	
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		//Con esto obtenemos el numero asociado a cualquier letra
		int codigo=e.getKeyCode();
		System.out.println(codigo);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		//char alm=e.getKeyChar();
		
		//System.out.println(alm);
		
//		int alm=KeyEvent.VK_S;
//		System.out.println(alm);
	}

}


class pruebaRaton extends MouseAdapter implements MouseMotionListener{

	@Override
	public void mouseClicked(MouseEvent e) {
	
		
		if (e.getClickCount()==2) {
			
			JOptionPane.showMessageDialog(null, "La ventana se cerrara");
			
			System.out.println("La ventana ha sido cerrada");
				
		}
		
		System.out.println("Eje X: "+ e.getX() + "Eje Y: "+ e.getY());
	}
	

//	@Override
//	public void mouseEntered(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void mouseExited(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
	@Override
	public void mousePressed(MouseEvent e) {
	
		//System.out.println(e.getModifiers());
		
		//La siguiene accion determina que tecla has utilizado
		if (e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) { //1024
			
			System.out.println("Boton izquierdo");
			
		}else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK){ //2048
			System.out.println("Boton centro");
		}else {
			System.out.println("Boton Derecho");
		}
		
	}
//
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
	
	//El siguiente metodo pertenece a la interfaz
	public void mouseDragged(MouseEvent arg0) {
		
		System.out.println("Estas seleccinando algo con el raton" );
		
	}
	
	public void mouseMoved(MouseEvent e) {
		
		
		System.out.println("Estas moviendo el raton");
	}
	
}