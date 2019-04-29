package Eventos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		setBounds(500, 300, 350, 550);
		
		//Añadimos la lamina
		LaminaCalculadora miLamina=new LaminaCalculadora();
		add(miLamina);
		
		//Gracias a esta opcion redimensionamos las laminas y los botones, ya que estos tienen un tamaño por defecto
		//pack();
		
	}
	
	
}

class LaminaCalculadora extends JPanel{
	
	
	public LaminaCalculadora() {
		//La declaramos como true para que acceda al metodo ActionListener y asi no entrara en if de InsertarNumero
		principio=true;
		
		//Division de la ventana
		setLayout(new BorderLayout());
		
		 pantalla=new JButton("0");
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
		
		//Antes de insertar los botones...>Istanciamos Listener y posteriormente se lo aplicamos a los botones
		ActionListener insertar=new InsertaNumero();
		
		//Añadimos los oyentes para calculos matematicos
		ActionListener orden=new AccionOrden();
		
		
		//Para evitar todo este codigo procedemos a lo siguiente creamos un metodo
		ponerBoton("7",insertar);
		ponerBoton("8",insertar);
		ponerBoton("9",insertar);
		ponerBoton("/",orden);
		ponerBoton("4",insertar);
		ponerBoton("5",insertar);
		ponerBoton("6",insertar);
		ponerBoton("*",orden);
		ponerBoton("1",insertar);
		ponerBoton("2",insertar);
		ponerBoton("3",insertar);
		ponerBoton("-",orden);
		
		ponerBoton(".",orden);            
		ponerBoton("0",insertar);
		ponerBoton("=",orden);
		ponerBoton("+",orden);
		              
		add(miLamina2,BorderLayout.CENTER);
		
		ultimaOperacion="=";
		
	}
	 //Este metodo hara dos cosas, añadir los botones y ponerlos a la escucha (ActionListener)
	public void ponerBoton(String rotulo, ActionListener oyente) {
				
	JButton boton=new JButton(rotulo);
	miLamina2.add(boton);
	
	//Añadimos los oyentes
	boton.addActionListener(oyente);
	boton.setBackground(new Color(11,8,8));
	
	
	
	
	
	
				
	}
	
	//Para poder acceder a la lamina es necesario crear el tipo de variable fuera del constructor y con ello inicializar la del constructor
	private JPanel miLamina2; 
	
	//IMPORTANTE--> La instanciamos fuera para que pueda ser accedida
	private JButton pantalla;
	
	//Creacion de una variable booleana para verificar el primer numero que se introduce
	private boolean principio;
	
	//Creacion de una variable donde guardaremos todos los resultados
	private double resultado;
	
	//Creacion de una variable para identificar el boton igual
	private String ultimaOperacion;
	
//Creacion de una clase interna para que haga administre funcionalidades
private class InsertaNumero implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Capturamos el texto que esta asociado al boton en una variable
		String entrada=e.getActionCommand();
		
		
		 //Si el el primero, borra el 0 y esctibe el seleccionado
		if (principio) {
			
			pantalla.setText("");
			
			principio=false;
			
		}
		
		//Con esto logramos que se escriban todos los numeros que pulsamos CONCATENACION
		pantalla.setText(pantalla.getText() + entrada);
	}
	
	
	
	
}

//Creacion de otra clase interna para que gestione los botones de operaciones
private class AccionOrden implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		//Extraemos el String
		String operacion=e.getActionCommand();
//		System.out.println(operacion);
		
		//Cerebro de nuestro programa, trasnformamos el texto del boton a Double para poder calcular
		calcular(Double.parseDouble(pantalla.getText()));
		
		//Almacenamos las operaciones que se realicen
		ultimaOperacion=operacion;
		
		//Con esto logramos que al presinar sobre un boton de operacion, se resetee 
		principio=true;
	}
	
	//Metodo encargado (CEREBRO) de realizar las operaciones
	public void calcular(double x) {
		
		//Comparamos todas las operaciones posibles
		if (ultimaOperacion.equals("+")) {
			
			resultado+=x;
			System.out.println(resultado);

		}else if(ultimaOperacion.equals("-")) {
			
			resultado-=x;
			
			
		}else if(ultimaOperacion.equals("*")) {
			
			resultado*=x;
			
		}else if(ultimaOperacion.equals("/")) {
			
			resultado/=x;
		}
		
		
		else if(ultimaOperacion.equals("=")) {
			
			
			resultado=x;
		}
		
		//Aqui debemos retornar el resultado a String ya que ahora es double, con solo concatenarlo con textp, nos acepta todo
		pantalla.setText("" + resultado);
	}
	
}
		
}