import org.w3c.dom.*;
import javax.xml.parsers.*;

public class Ejemplo8 {

	public static void print(String s, int level){
		for(; level>0; level--)
			System.out.print("\t");
		System.out.println(s);
	}

	public static void listChildren(Node e, int level){
		print("[ "+e.getNodeName()+" , "+e.getNodeValue()+" ]", level);
		level++;
		
		for(Node node = e.getFirstChild(); node != null; node = node.getNextSibling()){
			listChildren(node, level);
		}
	}
	
	public static void main(String args[]){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		try{
			builder = factory.newDocumentBuilder();
		}catch(ParserConfigurationException e){
			System.err.println("No se ha podido crear una instancia de DocumentBuilder");
			return;
		}
		
		DOMImplementation implementation = builder.getDOMImplementation();
		Document document = implementation.createDocument(null, "root", null);
		Element rootElement = document.getDocumentElement();
		Text text = document.createTextNode("Este es un texto muy largo."+
			" Pero que muy largo");
		rootElement.appendChild(text);
		
		System.out.println();
		System.out.println("Antes de insertar un nodo");
		listChildren(document, 0);
		
		Element smiley = document.createElement("smiley");
		Text anotherText = text.splitText(27);
		rootElement.appendChild(smiley);
		rootElement.appendChild(anotherText);
		
		System.out.println();
		System.out.println("Despues de insertarlo");
		listChildren(document, 0);
	}
	
}
