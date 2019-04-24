package Eventos;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Creacion de una calculadora
 * @author Adrian Arpi
 *
 */

public class Calculadora {

	public static void main(String[] args) {
		
		MarcoCalculadora miMarco=new MarcoCalculadora();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCalculadora extends JFrame{
	
	
	public MarcoCalculadora() {
		
		
		setTitle("Calculadora Adrian");
		
		setBounds(500, 300, 450, 300);
		
		//Añadimos la lamina
		LaminaCalculadora miLamina=new LaminaCalculadora();
		add(miLamina);
		
		//Gracias a esta opcion redimensionamos las laminas
		pack();
		
	}
	
	
}

class LaminaCalculadora extends JPanel{
	
	
	public LaminaCalculadora() {
		
		//Division de la ventana
		setLayout(new BorderLayout());
		
		JButton pantalla=new JButton("0");
		//Desabilitamos el boton
		pantalla.setEnabled(false);
		add(pantalla,BorderLayout.NORTH);
		
		
		//Creacion de una nueva lamina
		//JPanel miLamina2=new JPanel();
		miLamina2=new JPanel(); // Ahora toca iniciarla
		miLamina2.setLayout(new GridLayout(4,4));
		
		
		
		
		//Creacion de los botones
//		JButton boton1= new JButton("1");
//		miLamina2.add(boton1);
//		
//		JButton boton2= new JButton("2");
//		miLamina2.add(boton2);
//		
//		
//		JButton boton3= new JButton("3");
//		miLamina2.add(boton3);
//		
//		
//		JButton boton4= new JButton("4");
//		miLamina2.add(boton4);
		
		//Para evitar todo este codigo procedemos a lo siguiente creamos un metodo
		ponerBoton("7");
		ponerBoton("8");
		ponerBoton("9");
		ponerBoton("/");
		ponerBoton("4");
		ponerBoton("5");
		ponerBoton("6");
		ponerBoton("*");
		ponerBoton("1");
		ponerBoton("2");
		ponerBoton("3");
		ponerBoton("-");
		
		ponerBoton("0");
		ponerBoton(".");
		ponerBoton("=");
		ponerBoton("+");
		
		add(miLamina2,BorderLayout.CENTER);
		
	}
	
	public void ponerBoton(String rotulo) {
				
	JButton boton=new JButton(rotulo);
	miLamina2.add(boton);
				
	}
	
	//Para poder acceder a la lamina es necesario crear el tipo de variable fuera del constructor y con ello inicializar la del constructor
	private JPanel miLamina2; 
	
		
}