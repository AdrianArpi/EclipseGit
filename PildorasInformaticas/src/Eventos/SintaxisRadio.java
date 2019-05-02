package Eventos;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SintaxisRadio {

	public static void main(String[] args) {

		MarcoRadio miMarco=new MarcoRadio();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoRadio extends JFrame{
	
	public MarcoRadio() {
		
		setTitle("Radio Button");
		setBounds(550,300,500,300);
		setLocationRelativeTo(null);
		
		LaminaRadio miLamina=new LaminaRadio();
		add(miLamina);
	}
}

class LaminaRadio extends JPanel{
	
	JRadioButton btn1;
	JRadioButton btn2;
	JRadioButton btn3;
	JRadioButton btn4;
	JRadioButton btn5;
	
	public LaminaRadio() {
		
		//Primero determinamos un grupo de botones y luego los creamos, el grupo sirve para que solo uno se seleccione
		ButtonGroup miGrupo1=new ButtonGroup();
		btn1=new JRadioButton("Azul",false); //Estado inicial sin seleccioner
		btn2=new JRadioButton("Rojo",true); //Estado inicial  seleccionado
		btn3=new JRadioButton("Verde",false); //Estado inicial sin seleccioner
		
		//Los añadimos al grupo
		miGrupo1.add(btn1);
		miGrupo1.add(btn2);
		miGrupo1.add(btn3);
		
		//No se puede agregar el grupo, debemos agregar uno a uno los botones
		add(btn1);
		add(btn2);
		add(btn3);
		
		 //Nuevo grupo
		ButtonGroup miGrupo2=new ButtonGroup();
		btn4=new JRadioButton("Masculino",false);
		btn5=new JRadioButton("Femenino",false);
		
		miGrupo2.add(btn4);
		miGrupo2.add(btn5);
		
		add(btn4);
		add(btn5);
		
	}
}