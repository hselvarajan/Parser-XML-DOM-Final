package fileparse1;

import com.github.akshayavenkatesh8.Address;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @author akshaya
 */
public class FileParse1 {

    /**
     * @param args the command line arguments
     * @throws org.xml.sax.SAXException
     * @throws javax.xml.parsers.ParserConfigurationException
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        try {

            File input = new File("address1.xml");
            fileParse(input);
        } catch (Exception e) {
            System.out.println("ERROR" + e);


        }
    }

    public static void fileParse(File f) throws SAXException, IOException, ParserConfigurationException {
        Address[] addlist = new Address[4];
        DocumentBuilderFactory db = DocumentBuilderFactory.newInstance();
        db.setIgnoringElementContentWhitespace(true);
        DocumentBuilder dbld = db.newDocumentBuilder();
        Document doc = dbld.parse(f);
        doc.getDocumentElement().normalize();
        Element rootE = doc.getDocumentElement();
        System.out.println(rootE.getNodeName());
        NodeList nList = doc.getElementsByTagName("address");
        for (int i = 0; i < nList.getLength(); i++) {
            Node nNode = nList.item(i);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                Element eElement = (Element) nNode;
                addlist[i].streetName = eElement.getElementsByTagName("streetname").item(0).getTextContent();
                addlist[i].streetNumber = eElement.getElementsByTagName("streetnumber").item(0).getTextContent();
                addlist[i].secondaryAddress =
                        eElement.getElementsByTagName("secondaryAddress").item(0).getTextContent();
                addlist[i].city = eElement.getElementsByTagName("city").item(0).getTextContent();
                addlist[i].stateCode = eElement.getElementsByTagName("statecode").item(0).getTextContent();
                addlist[i].zipCode = eElement.getElementsByTagName("zipcode").item(0).getTextContent();
                System.out.println(addlist[i]);
            }
        }
    }
}    

