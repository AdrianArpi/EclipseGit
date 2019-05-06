package XML;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.xml.stream.XMLOutputFactory;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class XmlFactorial {

	private static long factorial(int n){
		
		long resul=1;
		for (int i = 0; i <=n; i++) {
			
			resul*=1;
			
			
		}
		
		return resul;
	}
	
	
	
	public static void main(String[] args) {
		
		int resp=0;
		
		try {
			resp=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos quieres"));
			
		} catch (NumberFormatException ex) {
			
			ex.printStackTrace();
		}
		
		Element root=new Element("Factoriales");
		Document doc=new Document(root);
		
		for (int i = 1; i <=resp; i++) {
			
			Element hijo=new Element("Factorial");
			hijo.setAttribute("de", String.valueOf(i));
			hijo.setText(String.valueOf(factorial(i)));
			root.addContent(hijo);
			
			
		}
		
		XMLOutputter serializador=new XMLOutputter(Format.getPrettyFormat());
		try {
			serializador.output(root, new FileWriter("fact.xml")); //doc --> NOs imprime todo el documento junto a la version (root,System.out)
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
