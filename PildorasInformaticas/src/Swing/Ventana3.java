package Swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana3 {

	public static void main(String[] args) {

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


class dibujo1 extends JPanel{
	
	//Construccion de un metodo par dibujar
	public void paintComponent(Graphics  g){
		
		super.paintComponent(g);
		
		
		
		Graphics2D g2=(Graphics2D) g;
		
		Font mifuente=new Font("Arial", Font.BOLD, 26);
		
		g2.setFont(mifuente);
		g2.setColor(Color.PINK);
		
		//Ecribimos y señalamos la ubucacion
		g2.drawString("Estamos aprendiendo swing", 100, 100);
		
		
		//Creacion de otra frase
		Font mifuente2=new Font("Arial", Font.BOLD, 26);
		
		g2.setFont(mifuente2);
		g2.setColor(Color.BLUE);
		g2.drawString("Adrian Arpi", 200,200);
		
	}
	
	
}