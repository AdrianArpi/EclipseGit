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

	JRadioButton btn1;
	JRadioButton btn2;
	JRadioButton btn3;
	JRadioButton btn4;
	JRadioButton btn5;
	
	JLabel miTexto;

	public LaminaRadio() {

		setLayout(new BorderLayout());

		miTexto = new JLabel("Esto es una prueba");
		add(miTexto,BorderLayout.CENTER);
		

		JPanel lamina2 = new JPanel();
		add(lamina2, BorderLayout.SOUTH);

		// Primero determinamos un grupo de botones y luego los creamos, el grupo sirve
		// para que solo uno se seleccione
		ButtonGroup miGrupo1 = new ButtonGroup();
		btn1 = new JRadioButton("pequeño", false); // Estado inicial sin seleccioner
		btn2 = new JRadioButton("Mediano", true); // Estado inicial seleccionado
		btn3 = new JRadioButton("Grande", false); // Estado inicial sin seleccioner

		// Le damos a boton1 la escucha
		btn1.addActionListener(new ManejoRadios());
		btn2.addActionListener(new ManejoRadios());
		btn3.addActionListener(new ManejoRadios());
//		btn4.addActionListener(new ManejoRadios()); --> Esto nos genera un error xq aun no esta creado

		// Los añadimos al grupo
		miGrupo1.add(btn1);
		miGrupo1.add(btn2);
		miGrupo1.add(btn3);

		// No se puede agregar el grupo, debemos agregar uno a uno los botones
		lamina2.add(btn1, BorderLayout.SOUTH);
		lamina2.add(btn2, BorderLayout.SOUTH);
		lamina2.add(btn3, BorderLayout.SOUTH);

		// Nuevo grupo
		ButtonGroup miGrupo2 = new ButtonGroup();
		btn4 = new JRadioButton("Muy grande", false);
		btn5 = new JRadioButton("No hago nada xd", false);

		miGrupo2.add(btn4);
		miGrupo2.add(btn5);

		lamina2.add(btn4, BorderLayout.SOUTH);
		lamina2.add(btn5, BorderLayout.SOUTH);
		
		btn4.addActionListener(new ManejoRadios());
		btn5.addActionListener(new ManejoRadios());
	}

	private class ManejoRadios implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (btn1.isSelected()) {

				miTexto.setFont(new Font("Serif", Font.PLAIN, 10));

			}else if(btn2.isSelected()){
				miTexto.setFont(new Font("Serif", Font.PLAIN, 12));
				
			}else if(btn3.isSelected()){
				miTexto.setFont(new Font("Serif", Font.PLAIN, 18));
				
			}else if(btn4.isSelected()){
				miTexto.setFont(new Font("Serif", Font.PLAIN, 30));
				
			}

		}

	}
}