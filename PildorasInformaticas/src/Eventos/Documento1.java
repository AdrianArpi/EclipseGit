package Eventos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class Documento1 {

	public static void main(String[] args) {
		
		MarcoPrueba adr= new MarcoPrueba();
		adr.setVisible(true);
		adr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoPrueba extends JFrame{
	
	public MarcoPrueba() {
		setBounds(500,300,500,350);
		setTitle("Documentos");
		
		
		LaminaPrueba miLamina=new LaminaPrueba();
		add(miLamina);
		
	}
}


class LaminaPrueba extends JPanel{
	
	
	public LaminaPrueba() {
		
		JTextField miCampo=new JTextField(20);
		
		escuchaTexto el_evento=new escuchaTexto(); //Añadimos un objeto de la clase interna
		
		//Instanciamos un objeto de tipo Documento, importamos (javax...)
		Document miDoc=miCampo.getDocument();
		miDoc.addDocumentListener(el_evento); //La añadimos sin olvidarnos de luego crear la variable que escucha
		
		add(miCampo);
		
		
	}
	
	
//Creamos la clase interna para poder tratar con los documentos, importamos  y aplicamos todos los metodos
private class escuchaTexto implements DocumentListener{

	@Override
	public void changedUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("Has insertado texto");
		
	}

	@Override
	public void removeUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("Estas borrando texto");
		
	}
	
	
}
}