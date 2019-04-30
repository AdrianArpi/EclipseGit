package Eventos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class CampoPassword {

	public static void main(String[] args) {
		
		
		MarcoPassword adr=new MarcoPassword();
		adr.setVisible(true);
		adr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoPassword extends JFrame{
	
	
	public MarcoPassword() {
		setTitle("Password");
		setBounds(400,300,550,400);
		
		LaminaPassword miLamina= new LaminaPassword();
		add(miLamina);
		
	}
}

class LaminaPassword extends JPanel{
	
	//Hacemos que la variable sea Local para que pueda ser accedida
	JPasswordField cContra;
	
	public LaminaPassword() {
		
		//Creamos una nueva disposicion para la lamina principal
		setLayout(new BorderLayout());
		
		//Creamos una segunda lamina
	JPanel laminaSuperior=new JPanel();
	laminaSuperior.setLayout(new GridLayout(2,2));
	
	//Agregamos la lamina Y la ubicamos bien
	add(laminaSuperior,BorderLayout.NORTH);
	
	
	//Cremaos las etiquetas y las añadimos a la correspondiente lamina
	JLabel etiqueta1= new JLabel("Usuario");
	
	
	//Cremaos las etiquetas y las añadimos a la correspondiente lamina
		JLabel etiqueta2= new JLabel("Contraseña");
		
		
		//Añadimos la clase interna
		CompruebaPass miEvento=new CompruebaPass();
		
		
	//Creacion de cuadro de texto
	JTextField cUsuario=new JTextField(15);
	cContra= new JPasswordField(15); //Esta es la forma apropiada para contraseñas
	cContra.getDocument().addDocumentListener(miEvento); //Le damos a cContra la propiedad de escuchar
		
	/*IMPORTANTE.... A continucion agregaremos las etiquetas y cuadros de texto segun el orden siguiente*/
	laminaSuperior.add(etiqueta1);
	laminaSuperior.add(cUsuario);
	laminaSuperior.add(etiqueta2);	
	laminaSuperior.add(cContra);
	
	
	
	//Creacion del boton en la lamina principal
	JButton enviar=new JButton("Enviar");
	add(enviar,BorderLayout.SOUTH);
	}
	
	
//Creacion de clase interna para gestionar eventos
private class CompruebaPass implements DocumentListener{

	@Override
	public void changedUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertUpdate(DocumentEvent arg0) {
		// Guardamos la contraseña en una variable
		char []contrasena;
		contrasena=cContra.getPassword();
		
		if (contrasena.length <8 || contrasena.length >12) {
			
			cContra.setBackground(Color.RED);
		}else {
			
			cContra.setBackground(Color.WHITE);
		}
		
	}

	@Override
	public void removeUpdate(DocumentEvent arg0) {
		// Copiamos todo el codigo del anterior metodo para que cuando borremos se quite el fondo
		char []contrasena;
		contrasena=cContra.getPassword();
		
		if (contrasena.length <8 || contrasena.length >12) {
			
			cContra.setBackground(Color.RED);
		}else {
			
			cContra.setBackground(Color.WHITE);
		}
		
	}
	
	
}
}