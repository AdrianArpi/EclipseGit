package eventos2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Esta clase sera una prueba para un JComboBox 
 * la forma de creación sera diferente a todas las anteriores
 * @author adria
 *
 */
public class PruebaCombo extends JFrame {
	
	private JLabel texto;
	private JComboBox<String> miCombo;
	
	//Establecemos caracteristicas de la ventana flotante
	public PruebaCombo() {
		
		this.setTitle("PruebaCombo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(400, 200, 400, 400);
		this.setVisible(true);
		this.setSize(500, 300);
		
		//IMPORTANTE AÑADIR LOS ELEMENTOS DEL METODO DIBUJO XD
		this.Dibujar();
		
	}
	
	
	private void Dibujar() {
		//Establecemos la division de la ventana
		this.setLayout(new BorderLayout());
		
		//Creación de elementos
		texto= new JLabel("En un lugar de la mancha de cuyo nombre....");
		texto.setFont(new Font("Serif", Font.PLAIN, 18));
		this.add(texto, BorderLayout.CENTER); //Ubicacion del texto
		
		//Nueva division de ventana
		JPanel lamina_norte= new JPanel();
		
		//Instanciamos el combo y añadimos los Strings
		miCombo= new JComboBox<>();
		miCombo.setEditable(true); //CON ESTO LOGRAMOS QUE SE PUEDA EDITAR EL COMBO
		miCombo.addItem("Serif");
		miCombo.addItem("SansSerif");
		miCombo.addItem("MonoSpaced");
		miCombo.addItem("Dialog");
		//Instanciamos el evento y se lo añadimos
		Eventos eventoCombo= new Eventos();
		miCombo.addActionListener(eventoCombo);//IMPORTANTE SINTAXIS XD
		
		//--> Ahora añadimos le combo a la lamina norte
		lamina_norte.add(miCombo);
		
		
		//Y añadimos la lamina norte a la lamina principal en punto especifico
		this.add(lamina_norte, BorderLayout.NORTH);
	}
	
	//Manipulacion de eventos. EN una clase interna
	private class Eventos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//LE APLICAMOS AL COMBO Y POSTERIORMENTE LO PONEMOS A LA ESCUCHA ANTES DE AÑADIRLO AL PANEL
			texto.setFont(new Font((String)miCombo.getSelectedItem(),Font.PLAIN,18));
			
		}
		
		
	}


	public static void main(String[] args) {
		
		new PruebaCombo();

	}

}
