package Eventos;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts {

	public static void main(String[] args) {

		ventana8 str=new ventana8();
		str.setVisible(true);
		str.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		str.setLocationRelativeTo(null);
	}

}

class ventana8 extends JFrame{
	
	public ventana8() {
	
		setTitle("Adrian Ventana");
		setSize(500,500);
		
		//Para poder diferenciar las laminas o contenedores es necesario especificar su ubicacion al momento de añadirlo
		Panel_Layout adr=new Panel_Layout();
		add(adr,BorderLayout.NORTH);
		//Desabilitamos el boton
		adr.setEnabled(false);
		
		
			//Añadimos la segunda lamina
			Panel_Layout2 mar=new Panel_Layout2();
			add(mar,BorderLayout.SOUTH);
		
			//Añadimos la tercera lamina
					Panel_Layout3 lana=new Panel_Layout3();
					add(lana,BorderLayout.CENTER);
	}
}

class Panel_Layout extends JPanel{
	
	
	public Panel_Layout() {
		
		//Manera de implementar las direcciones de los botones
		setLayout(new BorderLayout());
		
		add(new JButton("Amarillo"));
		
		
	
	}
}

class Panel_Layout2 extends JPanel{
	
	
	public Panel_Layout2() {
		
		//Manera de implementar las direcciones de los botones
		setLayout(new BorderLayout(10,10));
		
		
		add(new JButton("Azul"),BorderLayout.CENTER);
		add(new JButton("Verde"),BorderLayout.WEST);
		add(new JButton("Negro"),BorderLayout.EAST);
	
	}
}

class Panel_Layout3 extends JPanel{
	
	
	public Panel_Layout3() {
		
		//Manera de implementar las direcciones de los botones
		setLayout(new GridLayout(3,2));
		
		
		 add(new JButton("1"));
         add(new JButton("2"));
         add(new JButton("3"));
         add(new JButton("4"));
         add(new JButton("5"));
         add(new JButton("6"));
	
	}
}