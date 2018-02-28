package my.oenomel.java9;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Test {
    public static void main(String[] args) {
        try {
            File f = new File("test.xml");
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(f);

            System.out.println("Root elem: " + doc.getDocumentElement().getNodeName());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
