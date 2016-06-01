/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileparse1;

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
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        try{
           
    File input= new File("address1.xml");
    fileParse(input);
        }catch(Exception e){
            System.out.println("ERROR"+e);
       


    }
}
    public static void fileParse(File f) throws SAXException, IOException, ParserConfigurationException
    {
        address add=new address();
        DocumentBuilderFactory db= DocumentBuilderFactory.newInstance();
    DocumentBuilder dbld= db.newDocumentBuilder();
    Document doc = dbld.parse(f);
   doc.getDocumentElement().normalize();
    Element rootE= doc.getDocumentElement();
            //System.out.println(rootE.getNodeName());
    
    NodeList nlist=doc.getElementsByTagName("name");
    add.name=nlist.item(0).getTextContent();
    nlist=doc.getElementsByTagName("streetnumber");
    add.streetNumber=nlist.item(0).getTextContent();
    nlist=doc.getElementsByTagName("streetname");
    add.streetName=nlist.item(0).getTextContent();
    nlist=doc.getElementsByTagName("secondaryaddress");
    add.secondaryAddress=nlist.item(0).getTextContent();
    nlist=doc.getElementsByTagName("city");
    add.city=nlist.item(0).getTextContent();
    nlist=doc.getElementsByTagName("statecode");
    add.stateCode=nlist.item(0).getTextContent();
    nlist=doc.getElementsByTagName("zipcode");
    add.zipCode=nlist.item(0).getTextContent();
    System.out.println(add);
    
    }
}
    

