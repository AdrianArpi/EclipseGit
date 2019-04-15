package Eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MultipleOyente1 {

	public static void main(String[] args) {

		ventana7 str=new ventana7();
		str.setVisible(true);
		str.setLocationRelativeTo(null);
		str.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class ventana7 extends JFrame{
	
	public ventana7() {
		
		setTitle("Ventana Adrian");
		setSize(500,500);

		creaBotones adr=new creaBotones();
		add(adr);
		
		raton rat=new raton();
		addMouseListener(rat);
	}
	
}

class creaBotones extends JPanel{
	
	JButton btnCerrar=new JButton();
	
	public creaBotones() {
		
		
		JButton btnVentana=new JButton("Nuevo");
		add(btnVentana);
		
		btnCerrar=new JButton("Cerrar Todo");
		add(btnCerrar);
		
		
		//Instanciamos la clase interna
		OyenteNuevo miOyente=new OyenteNuevo();
		btnVentana.addActionListener(miOyente);
	}
	
	//Creamos una clase interna para poder acceder a los botones
	private class OyenteNuevo implements ActionListener{

		//Implementamos el metodo correspondiente y agregamos la acción
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Marco_Emergente marco=new Marco_Emergente(btnCerrar);
			
			marco.setVisible(true);
			
		}
		
		
	}
	
	
}


//Creamos una nueva clase que sera la que abra mas ventanas
class Marco_Emergente extends JFrame{
	
	//Creacion de un contador para que nos muestre el numero de la ventana
		private static int contador=0;
	
	public Marco_Emergente(JButton boton_de_principal) {
		
		//Gracias e esto logramos contar las ventanas y ubicarlas una tras otra.
		contador++;
		setTitle("Ventana" + contador);
		setBounds(40*contador,40*contador,300,150);
		
		CierraTodo oyenteCerrar=new CierraTodo();
		boton_de_principal.addActionListener(oyenteCerrar);
	}
	
//Creacion de una clase interna para que el boton cerrar, cierre todas las ventanas
private class CierraTodo extends AbstractAction implements ActionListener{

	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Iocion para cerrar ventanas
		dispose();
		contador=0;
	}
	
	
	
}
}

//Clase externa creada para dar uso a opciones de raton
class raton extends MouseAdapter implements MouseListener{
	
	
	public void mouseClicked(MouseEvent e){
		
		if(e.getClickCount()==2) {
			
			JOptionPane.showMessageDialog(null, "Estas seguro que quieres cerrar la ventana");
			
		}
	}
	
	
	
	
	
	
}