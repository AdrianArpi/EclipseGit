package Swing;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class Fuentes {

	public static void main(String[] args) {

		String fuente=JOptionPane.showInputDialog("Introduce la fuente que desees");
		
		boolean eslafuente=false;
		
		String [] nombresDeFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for(String nombredelafuente: nombresDeFuentes) {
			
			if(nombredelafuente.equals(fuente)) {
				
				eslafuente=true;
				
			}
			
			
		}
		
		
		if(eslafuente) {
			
			System.out.println("La fuente esta instalada");
		}else {
			
			System.out.println("La fuente no esta instalada");
		}
	}

}
