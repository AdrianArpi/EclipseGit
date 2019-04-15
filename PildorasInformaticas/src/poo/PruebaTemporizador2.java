package poo;

import javax.swing.*;
import java.awt.Toolkit;
import javax.swing.Timer;
import java.util.*;
import java.awt.event.*;


public class PruebaTemporizador2 {

	public static void main(String[] args) {
		
		Reloj mireloj=new Reloj(3000,true);
		
		mireloj.enMarcha();
		
		JOptionPane.showConfirmDialog(null, "Pulsa para terminar");
		
		System.exit(0);
		

	}

}


class Reloj {
	
	private int intervalo;
	
	private boolean sonido;
	
	
	
	public Reloj(int intervalo, boolean sonido) {
		
		
		this.intervalo=intervalo;
		this.sonido=sonido;
		
	}
	
	public void enMarcha() {
 		
		
		
		
		//Creacion de una clase interna
		
				 class DameLaHora2 implements ActionListener{
					
					
					public void actionPerformed(ActionEvent evento) {
						
						
						Date ahora=new Date();
						
						System.out.println("Te pongo la hora cada 3 sg " + ahora);
						
						if (sonido) {
							Toolkit.getDefaultToolkit().beep();
							
						}
						
					}
					
				}
		
		
		ActionListener oyente=new DameLaHora2();
		
		Timer mitemporizador=new Timer(intervalo, oyente);
		
		mitemporizador.start();
		
		}
	
	
		
		
		
		
	
	
	
}