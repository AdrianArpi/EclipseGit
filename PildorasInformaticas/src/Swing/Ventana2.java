package Swing;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Ventana2 {

	public static void main(String[] args) {

		marcoCentrado str= new marcoCentrado();
		
		
		str.setVisible(true);
		
		str.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class marcoCentrado extends JFrame{
	
	
	public marcoCentrado() {
		
		setTitle("Ventana Adrian");
		
		
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		
		//Gracias a esto obtenemos la resolucion de la pantalla
//		Dimension tamanoPantalla=mipantalla.getScreenSize();
		
		//Creacion de dos variables para obtener por separado el ancho y alto
//		int anchoPantalla=tamanoPantalla.width;
//		int altoPantalla=tamanoPantalla.height;
//		
//		setSize(anchoPantalla/2, altoPantalla/2);
//		setLocation(anchoPantalla/4, altoPantalla/4);
		
		//Ancho por alto
		setSize(535,425);
		
		setLocationRelativeTo(null);
		
		//Cambio de icono de ventana por defecto, se puede jugar con los directorios.../
		Image miIcono= mipantalla.getImage("icono.gif");
		
		setIconImage(miIcono);
		
		//Añadimos la imagen al Frame
		LaminaConImagen adr=new LaminaConImagen();
		add(adr);
	}
	
	
}


class LaminaConImagen extends JPanel{
	
	//Creacion del constructor par poder instanciar mas de una
	public LaminaConImagen() {
		
		//Creacion de una excepcion obligatoria
		try {
			
			//Tambien podemos instanciar File desde read(new File("src...."))
			imagen=ImageIO.read(new File("src/Swing/perro.jpg"));
		} catch (IOException e) {
			
			System.out.println("La imagen no se ha encontrado");
		}
		
	}
	
	
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
	
		
		//Dibujamos la imagen
		g.drawImage(imagen, 0, 0, null);
		
		//Copia de la imagen
		//*g.copyArea(0, 0, 260, 193, 260, 0);
		
		//*g.copyArea(0, 0, 260, 193, 0, 193);
		
		
		//OBtenemos la altura y la anchura
		int anchuraImagen=imagen.getWidth(this);
		int alturaImagen=imagen.getHeight(this);
		
		g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen, 0);
		
		g.copyArea(0, 0, anchuraImagen, alturaImagen, 0, alturaImagen);
		
		
		
		
		/*Bucle for para crear un mosaico
		 * for(int i=0; i<300;i++){
		 * 	for(int j=0; j<200; j++){
		 * 		g.copyArea(0,0,15,15,15*i,15*j);
		 * }
		 * 
		 * }
		 * 
		 * 
		 * */
		
	}
	
	
	private Image imagen;
	
	
}

