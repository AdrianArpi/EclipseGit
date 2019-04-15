package Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana4 {

	public static void main(String[] args) {
		
		
		dibujo2 str=new dibujo2();
		
		str.setVisible(true);
		str.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class dibujo2 extends JFrame{
	
	public dibujo2() {
		
		
		setTitle("Dibujo basico");
		setSize(500, 300);
		
		setLocationRelativeTo(null);
		
		//Agregamos la lamina
		laminaFigura fig= new laminaFigura();
		add(fig,BorderLayout.CENTER);
		
		fig.setBackground(SystemColor.window);
		
		laminaFigura juan=new laminaFigura();
		
		add(juan);
		
	}
	
}

class laminaFigura extends JPanel implements ActionListener{
	JButton asd= new JButton("Prueba"); 
	
	public laminaFigura() {
		//Añadimos un boton y accion
				add(asd);
				asd.addActionListener(this);
				
	} 
	
	public void actionPerformed(ActionEvent e) {
		
		setBackground(Color.BLUE);
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//Dibujo de un cuadrado
		g.drawRect(50, 50, 300, 200);
		
		//Dibujo de una linea horizontal
		g.drawLine(50, 50, 250, 250);
		
		//Dibujo de una linea horizontal
				//g.drawLine(250, 250, 50, 50);
		
		
		//Creacin de figuras en 2D
		Graphics2D g2=(Graphics2D) g;
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		
		//Añadimos color, esto afectara a las figuras que esten debajo
		g2.setPaint(Color.PINK);
		
		g2.fill(rectangulo);
		
		
		
		
		
		//Creacion de una elipse
		Ellipse2D elipse=new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		
		//Añadimos color
		Color miColor=new Color(125,240,25);
		
		g2.setPaint(miColor);
		g2.fill(elipse);
		
//		g2.draw(new Line2D.Double(100,100,300,250));
//		
//		
//		double CentroenX=rectangulo.getCenterX();
//		double CentroenY=rectangulo.getCenterY();
//		double radio=150;
//		
//		Ellipse2D circulo=new Ellipse2D.Double();
//		
//		circulo.setFrameFromCenter(CentroenX,CentroenY,CentroenX+radio,CentroenY+radio);
//		g2.draw(circulo);
		
		
		
	}
	
}