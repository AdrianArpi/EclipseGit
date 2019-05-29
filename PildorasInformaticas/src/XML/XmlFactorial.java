package XML;

import java.awt.BorderLayout;
import java.awt.Font;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.xml.stream.XMLOutputFactory;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
*Nuevo comentario para generar conflictos
*@author adrian
*@since 29/05/2019
*/
public class XmlFactorial extends JFrame{
	
	public XmlFactorial(){
		
		setTitle("COMPRA DE BILLETES");
		
		setSize(500, 500);
		
	
		lamina miLamina=new lamina();
		add(miLamina);
	}

	private static long factorial(int n){
		
		long resul=1;
		for (int i = 0; i <=n; i++) {
			
			resul*=1;
			
			
		}
		
		return resul;
	}
	
private class lamina extends JPanel{
	
	private JPanel lamina2;
	private JTextArea area1;
	private JLabel info;
	private JScrollPane laminaBarras;
	private JButton btnPrueba;
	
	public lamina(){
		
		setLayout(new BorderLayout());
		
		lamina2=new JPanel();
		add(lamina2);
		
		Font negrita= new Font("Serif",Font.PLAIN,25);
		info =new JLabel("Haz doble clic en el destino deseado");
		info.setFont(negrita);
		
		lamina2.add(info,BorderLayout.NORTH);
		
		area1=new JTextArea(8,20);
		lamina2.add(area1,BorderLayout.CENTER);
		laminaBarras=new JScrollPane(area1);
		lamina2.add(laminaBarras);
		
		btnPrueba=new JButton("Dale");
		
		laminaBarras.add(btnPrueba);
	}
	
	
}
	
	public static void main(String[] args) {
		
		XmlFactorial miVentana=new XmlFactorial();
		miVentana.setVisible(true);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLocationRelativeTo(null);
		
		
//		
//		int resp=0;
//		
//		try {
//			resp=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos quieres"));
//			
//		} catch (NumberFormatException ex) {
//			
//			ex.printStackTrace();
//		}
//		
//		Element root=new Element("Factoriales");
//		Document doc=new Document(root);
//	
//		
//		
//		for (int i = 1; i <=resp; i++) {
//			
//			Element hijo=new Element("Factorial");
//			hijo.setAttribute("de", String.valueOf(i));
//			hijo.setText(String.valueOf(factorial(i)));
//			root.addContent(hijo);
//			
//			//Añadimos contenido al hijo
//			hijo.addContent("Prueba");
//			
//			
//			
//		}
//		
//		//Creamos un segundo elemento, lo añadimos al final y le agregamos un hijo
//		Element hijo2=new Element("Codigo");
//		root.addContent(hijo2);
//		Element sub2=new Element("Cod");
//		hijo2.addContent(sub2.addContent("54321"));
//		
//		//A sub2 le agregamos un atributo de tipo int
//		sub2.setAttribute("id", String.valueOf(50));
//		
//		
//		XMLOutputter serializador=new XMLOutputter(Format.getPrettyFormat());
//		try {
//			serializador.output(root, System.out); //doc --> NOs imprime todo el documento junto a la version (root,System.out)
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		
	}

}
