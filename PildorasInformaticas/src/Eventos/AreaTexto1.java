package Eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AreaTexto1 {

	public static void main(String[] args) {

		MarcoArea miMarco=new MarcoArea();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoArea extends JFrame{
	
	public MarcoArea() {
		setTitle("Adrian");
		setBounds(500,300,500,350);
		
		LaminaArea miLamina= new LaminaArea();
		add(miLamina);
		
	}
}

class LaminaArea extends JPanel{
	
	//Para poder acceder a ella
	private JTextArea miArea;
	public LaminaArea() {
		
		miArea= new JTextArea(8,20);
		
		//Creacion de una segunda lamina y ingresamos la lamina creada
		JScrollPane laminaBarras=new JScrollPane(miArea);
		
		
		//Gracias a esto no permitimos que el cudro se ensanche, mirar en la API DE JAVA
		//miArea.setLineWrap(true);
		add(laminaBarras); //Ya no hace falta agregar miArea
		
		JButton miBoton = new JButton("Dale");
		miBoton.addActionListener(new GestionaArea()); //La instanciamos directamente
		add(miBoton);
	}
	
//Creacion de una clase interna
	private class GestionaArea implements ActionListener{

		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println(miArea.getText());
		}
		
		
		
	}
}