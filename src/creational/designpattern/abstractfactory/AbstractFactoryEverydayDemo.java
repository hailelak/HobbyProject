package creational.designpattern.abstractfactory;



import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class AbstractFactoryEverydayDemo {

	public static void main(String[] args) {
    String xml = "<document><body><stock>AAPL</stock></body></document>";
    ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());
    
    DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
    Document doc=null;
    DocumentBuilder factory=null;
    try {
		factory = abstractFactory.newDocumentBuilder();
		try {
			doc = factory.parse(bais);
			doc.getDocumentElement().normalize();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} catch (ParserConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    System.out.println("Root element :"+ doc.getDocumentElement().getNodeName());
    System.out.println(abstractFactory.getClass());
    System.out.println(factory.getClass());
    
    
	}

}
