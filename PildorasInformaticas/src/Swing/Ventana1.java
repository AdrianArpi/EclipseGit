package Swing;

import java.awt.Frame;

import javax.swing.*;

public class Ventana1 {

	public static void main(String[] args) {
		
		miMarco marco1= new miMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class miMarco extends JFrame{
	
	
	public miMarco() {
		
		//setSize(500, 300);
		
		//setLocation(500,300);
		
		//Sustituye a los dos metodos anteriores, primer elemento corresponde a Localizacion y otro a tamaño ventana
		setBounds(500, 300, 550, 250);
		
		//Metodo que permite o no la redimesion de la ventana
		setResizable(true);
		
		//Permite que la ventana se abra en pantalla completa
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
		setTitle("Ventana Adrian");
		
		elementos str=new elementos();
		add(str);
		
		
	}
	
class elementos extends JPanel{
	
	
	JScrollPane adr=new JScrollPane();
	
	public elementos() {
		
		add(adr);
		
	}
}
	
}
