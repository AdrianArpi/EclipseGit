package poo;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		
		DameLaHora oyente=new DameLaHora();

		Timer mitemporizador=new Timer(5000, oyente);
		
		mitemporizador.start();
		
		//Ventana emergente para mantener el programa
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		
		System.exit(0);
		
	}

}


class DameLaHora implements ActionListener{
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora=new Date();
		System.out.println("Te pondo la hora cada 5 segundos: " + ahora);
		//Alarma del sistema operativo
		Toolkit.getDefaultToolkit().beep();
	}
	
	
}