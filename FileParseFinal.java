
package com.github.akshayavenkatesh8;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author akshaya
 */
public class FileParseFinal {

    /**
     * @param args the command line arguments
     * @throws org.xml.sax.SAXException
     * @throws javax.xml.parsers.ParserConfigurationException
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        try{
           
    File input= new File("address1.xml");
    new FileParse1(). fileParse(input);
        }catch(Exception e){
            System.out.println("ERROR"+e);
       


    }
}
    public void fileParse(File f) throws SAXException, IOException, ParserConfigurationException
    {
    address add=new address();
    DocumentBuilderFactory db= DocumentBuilderFactory.newInstance();
    factory.setValidating(false);
    factory.setNamespaceAware(true);
    SchemaFactory schemaFactory = 
    SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
    factory.setSchema(schemaFactory.newSchema(new Source[] {new StreamSource("address.xsd")}));
    InvalidXMLErrorHandler ieh = new InvalidXMLErrorHandler();
    DocumentBuilder dbld= db.newDocumentBuilder();
    dbld.setErrorHandler(ieh);
    Document doc = dbld.parse(f);
    doc.getDocumentElement().normalize();
    if(ieh.check == null){
    Element rootE= doc.getDocumentElement();
           Node name= rootE.getFirstChild();
           name=getFirstElementSibling(name); 
           Node streetNumber=getFirstElementSibling(name);
           Node streetName=getFirstElementSibling(streetNumber);
           Node secondaryAddress=getFirstElementSibling(streetName);
           Node city=getFirstElementSibling(secondaryAddress);
           Node stateCode=getFirstElementSibling(city);
           Node zipCode=getFirstElementSibling(stateCode);
           add.name=name.getTextContent();
           add.streetName=streetName.getTextContent();
           add.streetNumber=streetNumber.getTextContent();
           add.secondaryAddress=secondaryAddress.getTextContent();
           add.city=city.getTextContent();
           add.stateCode=stateCode.getTextContent();
           add.zipCode=zipCode.getTextContent();
           System.out.println(add);
    }
    }
    public  Node getFirstElementSibling(Node node)
    {
        Node nextNode=null;
        for(nextNode=node.getNextSibling();nextNode!=null;nextNode=nextNode.getNextSibling())
        {
            if(nextNode.getNodeType() == Node.ELEMENT_NODE)
                return  nextNode;
        }
    return null;
    }
}
  

