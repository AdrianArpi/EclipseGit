package Eventos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Ven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lamina str=new lamina();
				
				str.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				str.setVisible(true);
	}

}


class lamina extends JFrame{
	
	public lamina() {
		
		setTitle("Ventana Adrian");
		
		
		
		
		setSize(600,450);
		setLocationRelativeTo(null);
		
		//Añadimos icono
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		Image miIcono=miPantalla.getImage("icono.gif");
		setIconImage(miIcono);
		
		//Instanciar dibujo para agregarla a la lamina
		dibujo1 adr= new dibujo1();
		add(adr);
		
		//adr.setBackground(Color.BLUE);
		
	}
	
}

//Al momento de implementar Action, estamos obligados a crear sus metodos
class dibujo1 extends JPanel { //implements ActionListener
	

	//Añadimos un boton
	JButton botonAzul=new JButton("Azul");
	
		//Añadimos mas botones
			JButton botonAmarillo=new JButton("Amarillo");
		
			//Añadimos mas botones
					JButton botonRojo=new JButton("Rojo");
					
						//Añadimos un boton para visualizar imagen
							JButton imagen=new JButton("Imagen");
	
	public dibujo1 () {
		
		//add(botonAzul);
		
		//Le añadimos al boton el oyente, el cual sera el nombre de la propia clase (this)
		//botonAzul.addActionListener(this); //this
		
		
			//Añadimos los botones creados
			//add(botonAmarillo);
			//botonAmarillo.addActionListener(this); //this
			
			
				//Añadimos otro boton
				//add(botonRojo);
				//botonRojo.addActionListener(this); //this
		
		//Pertenece a la clase interna
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		add(imagen);
		
		
		
		//Intanciamos color de fondo
		ColorFondo Azul=new ColorFondo(Color.BLUE);
		ColorFondo Amarillo=new ColorFondo(Color.YELLOW);
		ColorFondo Rojo=new ColorFondo(Color.RED);
		
		//Añadimos el objeto oyente
		botonAzul.addActionListener(Azul);
		botonAmarillo.addActionListener(Amarillo);
		botonRojo.addActionListener(Rojo);
	}
	
	
	//Metodo de ActionListener
//	public void actionPerformed(ActionEvent e) {
//		
//		//setBackground(Color.BLUE); Esto aplicaria a un solo boton
//		
//		//Creamos un objeto de tipo object para distinguir los botones
//		Object botonPulsado=e.getSource();
//		
//		if (botonPulsado==botonAzul) {
//			
//			setBackground(Color.BLUE);
//			
//		}else if(botonPulsado==botonAmarillo) {
//			
//			setBackground(Color.YELLOW);
//			
//		}else {
//			setBackground(Color.RED);
//		}
//		
//		
//		
//	}
	


	//Añadimos una clase interna
	private class ColorFondo implements ActionListener{
		
		private Color colorDeFondo;
		
		
		public ColorFondo(Color c) {
			
			colorDeFondo=c;
			
			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			setBackground(colorDeFondo);
			
		}
		
		
		
		
	}
}

