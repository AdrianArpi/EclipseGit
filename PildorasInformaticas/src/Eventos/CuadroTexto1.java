package Eventos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CuadroTexto1 {

	public static void main(String[] args) {

		MarcoTexto adr=new MarcoTexto();
		
		adr.setVisible(true);
		adr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoTexto extends JFrame{
	
	public MarcoTexto() {
		
		
		setTitle("Marco1");
		setLocationRelativeTo(null);
		setSize(500,300);
		
		
		//A�adimos el cuadro de texto
		LaminaTexto miLamina=new LaminaTexto();
		add(miLamina);
	}
}

class LaminaTexto extends JPanel{
	
	//Inicializacion externa para su posible acceso
	private JTextField campo1;
	
	//Etiqueta para la proyeccion  del resultado
	private JLabel resultado;
	
	public LaminaTexto() {
		
		//Ubicamos las laminas
		setLayout(new BorderLayout()); //Le asignamos a la lamina principal, le damos la propiedad de dividirse
		
		JPanel miLamina2=new JPanel(); //Creamos una nueva lamina y le asignamos la ubucacion
		miLamina2.setLayout(new FlowLayout());
		
		//A�adimos la etiqueta y la dejamos vacia
		resultado =new JLabel("",JLabel.CENTER); //--> IMPORTANTE.. Debemos fijarnos en el sitio donde lo vmaos a a�adir y tambien el texto
		//Mirar la API para aplicar ubicacion
		
		
		//A�adimos una peque�a etiqueta
		JLabel texto1= new JLabel("Email: ");
		miLamina2.add(texto1);
		
		//Creamos una instancia y la a�adimos, debemos fijarnos en los constructores, los parametros separados por coma
		//Lo inicializamos fuera para que pueda ser accedido por la clase interna
		campo1=new JTextField(20);
		miLamina2.add(campo1);
		add(resultado,BorderLayout.CENTER); //LO A�ADIMOS PERO EN EL CENTRO
		//Utilizamos sus metodos
//		System.out.println(campo1.getText());
		
		
		//A�adimos un  boton
		JButton miBoton= new JButton("Validar");
		miLamina2.add(miBoton); //Se lo a�adimos a la segunda lamina <--
		
		//Crearemos una clase para que sea quien escucha
		DameTexto miEvento= new DameTexto();
		
		//Le damaos al boton la funcionalidad de escucha
		miBoton.addActionListener(miEvento);
		
		
		
		//A�adimos la lamina dos en una nueva ubicacion
		add(miLamina2,BorderLayout.NORTH);
	}
	
private class DameTexto implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		int correcto=0;
		//Almacenamos el String del cuadro de texto en una variable
		String email=campo1.getText().trim();
		
		for (int i = 0; i < email.length(); i++) {
			
			if (email.charAt(i)=='@' ) {
				
				correcto++;
				
				
			}
			
			
			
		}
		
		if (correcto!=1) {
			//EN este apartado le asignamos un String a nuestra etiqueta
				resultado.setText("Incorrecto");
				
			}else {
				resultado.setText("Correcto");
			}
		
		//Con esto capturamos el texto 
		System.out.println(campo1.getText().trim());
		
	}
	
	
	
	}
}