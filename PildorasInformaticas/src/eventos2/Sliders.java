package eventos2;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class Sliders extends JFrame{
	
	private JSlider control,prueba;
	
	public Sliders() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Slider");
		this.setBounds(400, 200, 500, 300);
		this.Dibujar();
	}
	
	public void Dibujar() {
		this.setLayout(new BorderLayout());
		
		
		//Iniciación y lo añadimos (MINIMO,MAXIMO,VALOR INICIAL)
		//control= new JSlider(SwingConstants.VERTICAL,0,100,50); Por defecto viene en horizontal, esta contante en el contruc..lo cambia
		control= new JSlider(0,100,50);
		control.setMajorTickSpacing(50); //Especificamos los puntos que apareceran
		control.setMinorTickSpacing(25);
		control.setPaintTicks(true); //Aplicamos cambios
		
		control.setFont(new Font("Serif",Font.ITALIC,18)); //Siempre antes de pintarlos
		
		control.setPaintLabels(true);//He imprimimos los numeros en su respectiva posicion
		
		//Antes de añadirlo
		control.setSnapToTicks(true);//Propiedad de iman para evitar puntos intermedios
		
		this.add(control, BorderLayout.NORTH);
		
		
	}
	
	public static void main(String[] args) {
		
		new Sliders();

	}

}
