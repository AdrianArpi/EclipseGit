package Eventos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SintaxisRadio {

	public static void main(String[] args) {

		MarcoRadio miMarco = new MarcoRadio();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRadio extends JFrame {

	public MarcoRadio() {

		setTitle("Radio Button");
		setBounds(550, 300, 500, 300);
		setLocationRelativeTo(null);

		LaminaRadio miLamina = new LaminaRadio();
		add(miLamina);
	}
}

class LaminaRadio extends JPanel {

	private JRadioButton btn1, btn2, btn3,btn4;
	
	
	private JLabel miTexto;
	
	private ButtonGroup miGrupo;
	
	private JPanel laminaBotones;

	public LaminaRadio() {

		setLayout(new BorderLayout());

		miTexto = new JLabel("Esto es una prueba");
		
		//Le agrego caracteristicas
		miTexto.setFont(new Font("Serif", Font.PLAIN, 12));
		
		
		add(miTexto,BorderLayout.CENTER);
		
		//SIEMPRE TENEMOS QUE INICIR LAS LAMINAS O BOTONES, PARA EVITAR EXCEPCIONES
		laminaBotones= new JPanel();
		miGrupo=new ButtonGroup();

		//Tenemos que llamar al metodo... Esto supone como instanciar desde MAIN
		ColocarBotones("Pequeño", false, 10);
		ColocarBotones("Mediano", false, 12);
		ColocarBotones("Grande", false, 18);
		ColocarBotones("Muy grande", false, 26);
		
		//Agregamos la lamina a la principal
		add(laminaBotones,BorderLayout.SOUTH);
	}

	//Creacion de un metodo para crear botones y ahorrar codigo
	public void ColocarBotones (String nombre, boolean seleccionado, int tamano) {
		
		JRadioButton boton= new JRadioButton(nombre,seleccionado);
		//Se añadiran todos al grupo
		miGrupo.add(boton);
		
		//Añadimos el grupo y sus botones a una nueva lamina
		laminaBotones.add(boton);
		
		//Esto sustitiye a una clase interna
		ActionListener miEvento=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				miTexto.setFont(new Font("Serif",Font.PLAIN,tamano));
			}
		};
		
		//Ponemos todos los botones a la escucha
		boton.addActionListener(miEvento);
	}
	
}