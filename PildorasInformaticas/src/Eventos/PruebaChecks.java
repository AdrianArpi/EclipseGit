package Eventos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PruebaChecks {

	public static void main(String[] args) {

		MarcoCheck miMarco= new MarcoCheck();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoCheck extends JFrame{
	
	public MarcoCheck() {
		
		setTitle("Casillas");
		setBounds(550,300,550,350);
		setLocationRelativeTo(null);
		
		LaminaCheck miLamina=new LaminaCheck();
		add(miLamina);
		
	}
}

class LaminaCheck extends JPanel{
	
	private JLabel texto;
	private JCheckBox check1,check2;

	
	public LaminaCheck() {
		
		setLayout(new BorderLayout());
		
		//Instanciamos un tipo de letra
		Font miLetra=new Font("Serif", Font.PLAIN,24);
		
		//Iniciamos las variables locales
		texto=new JLabel("En un lugar de la mancha de cuyo nombre...");
		
		//Lo agregamos y le añadimos el tipo de letra
		texto.setFont(miLetra);
		
		
		//Creacion de otra lamina secundaria
		JPanel laminaTexto= new JPanel();
		laminaTexto.add(texto);
		add(laminaTexto,BorderLayout.CENTER);
		
		//Iniciamos las varables locales
		check1= new JCheckBox("Negrita");
		check2=new JCheckBox("Cursiva");
		
		//Hacemos que estena la escuha
		check1.addActionListener(new ManejaChecks()); //UTILIZAR MAS A MENUDO
		check2.addActionListener(new ManejaChecks());//UTILIZAR MAS A MENUDO
		
		//Nueva lamina para ubicar los checkssss
		JPanel laminaChecks =new JPanel();
		laminaChecks.add(check1);
		laminaChecks.add(check2);
		
		add(laminaChecks,BorderLayout.SOUTH);//Situamos la lamina al sur.
	}
	
//Creacion de una clase interna para manejar listener
	private class ManejaChecks implements ActionListener{

		
		@Override
		public void actionPerformed(ActionEvent e) {
			
		int tipo=0;
		
		if (check1.isSelected()) {
			
			tipo+=Font.BOLD;
			
		}
		
		if (check2.isSelected()) {
			
			tipo+=Font.ITALIC;
			
		}
			
		//Resultado de como debe quedar el texto
		texto.setFont(new Font("Serif",tipo,24));
			
		}
		
		
		
	}
}