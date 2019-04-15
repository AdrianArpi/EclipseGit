package Eventos;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class EventoMultiple1 {

	public static void main(String[] args) {

		
		ventana6 str=new ventana6();
		
		str.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		str.setVisible(true);
		
	}

}


class ventana6 extends JFrame{
	
	public ventana6() {
		
		setTitle("Adrian");
		setLocationRelativeTo(null);
		setSize(500,300);
		
		//Instanciamos la clase JPanel para agregar los botones
		botones adr=new botones();
		add(adr);
		
		//Las alineaciones heredan de JFrame y podemos instanciarlas directamente 
//		botones lamina=new botones();
//		FlowLayout disposicion=new FlowLayout(FlowLayout.RIGHT);
//		lamina.setLayout(disposicion);
//		add(lamina);
		
		//Para ahorrarnos todo el procedimiento de arriba, podemos instanciar todo directamente
		botones lamina=new botones();
		lamina.setLayout(new FlowLayout(FlowLayout.RIGHT));
		add(lamina);
		/*No hace falta instanciar dos veces la clase JPanel*/
	}
}

class botones extends JPanel{
	
	
	public botones() {
		
//		JButton btnAmarillo=new JButton("Amarillo");
//		JButton btnAzul=new JButton("Azul");
//		JButton btnRojo=new JButton("Rojo");
//		
//		add(btnAmarillo);
//		add(btnAzul);
//		add(btnRojo);
		
		//Añadimos las acciones de los botones
		AccionColor accionAmarillo=new AccionColor("Amarillo", new ImageIcon("src/Eventos/icono.gif"), Color.YELLOW);
		
		AccionColor accionAzul=new AccionColor("Azul", new ImageIcon("src/Eventos/icono.gif"), Color.BLUE);
		AccionColor accionRojo=new AccionColor("Rojo", new ImageIcon("src/Eventos/icono.gif"), Color.RED);
		
		//Añadir directamente
		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));
		
		
		//Creacion de un mapa de entrada
		InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		//Creacion de combinacion de teclas
		//KeyStroke teclaAmarillo=KeyStroke.getKeyStroke("ctrl A");
		
		//Asignar combinacion a objeto
		//mapaEntrada.put(teclaAmarillo, "fondo_amarillo");
		
		//Sustitucion de los dos parametros anteriores COLOR AMARILLO
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
		
		//Asignar objeto a accion
		ActionMap mapaAccion=getActionMap();
		
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		
		//COLOR AZUL
		//Sustitucion de los dos parametros anteriores COLOR AMARILLO
				mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
				mapaAccion.put("fondo_azul", accionAzul);
				
				//COLOR ROJO
				//Sustitucion de los dos parametros anteriores COLOR AMARILLO
						mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");
						mapaAccion.put("fondo_rojo", accionRojo);
		
		
	}
	
	//Hacemos que la clase sea interna
	class AccionColor extends AbstractAction{

		public AccionColor(String nombre, Icon icono, Color color_boton) {
			
			//Añadimos las funciones 
			putValue(Action.NAME,nombre);
			//Añadimos un pequeño icono
			putValue(Action.SMALL_ICON,icono);
			
			putValue(Action.SHORT_DESCRIPTION,"Poner la lamina de color " + nombre);
			
			putValue("Color_de_fondo", color_boton);
		}
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			Color c=(Color) getValue("Color_de_fondo");
			
			setBackground(c);
			
			System.out.println("Boton: " + getValue(Action.NAME));
			
			
		}
		
		
		
		
	}
	
}


