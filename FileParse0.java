/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileparse0;

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
public class FileParse1 {

    /**
     * @param args the command line arguments
     * @throws org.xml.sax.SAXException
     * @throws javax.xml.parsers.ParserConfigurationException
     */
    public static void main(String[] args) throws SAXException, ParserConfigurationException {
        // TODO code application logic here
        try{
            address add=new address();
    File input= new File("address1.xml");
    DocumentBuilderFactory db= DocumentBuilderFactory.newInstance();
    DocumentBuilder dbld= db.newDocumentBuilder();
    Document doc = dbld.parse(input);
    doc.getDocumentElement().normalize();
    Element rootE= doc.getDocumentElement();
            //System.out.println(rootE.getNodeName());
    
     add.name=rootE.getFirstChild().getTextContent();
    add.streetNumber=rootE.getFirstChild().getNextSibling().getTextContent();
    add.streetName=rootE.getFirstChild().getNextSibling().getNextSibling().getTextContent();
    add.secondaryAddress=rootE.getFirstChild().getNextSibling().getNextSibling().getNextSibling().getTextContent();
    add.city=rootE.getLastChild().getPreviousSibling().getPreviousSibling().getTextContent();
    add.stateCode=rootE.getLastChild().getPreviousSibling().getTextContent();
    add.zipCode=rootE.getLastChild().getTextContent();
   // address ad= new address(name.getTextContent(),streetNumber.getTextContent(),streetName.getTextContent(),secondaryAddress.getTextContent(),city.getTextContent(),stateCode.getTextContent(),zipCode.getTextContent());
    
            
            System.out.println(add);
        }catch(ParserConfigurationException | SAXException | IOException e){
            System.out.println("ERROR"+e);
      } 


    }
}
    
