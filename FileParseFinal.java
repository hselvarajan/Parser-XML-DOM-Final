/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.akshayavenkatesh8;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.lang.NullPointerException;
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
    fileParse(input);
        }catch(Exception e){
            System.out.println("ERROR"+e);
       


    }
}
    public static void fileParse(File f) throws SAXException, IOException, ParserConfigurationException
    {
    address add=new address();
    DocumentBuilderFactory db= DocumentBuilderFactory.newInstance();
    db.setIgnoringElementContentWhitespace(true);
    DocumentBuilder dbld= db.newDocumentBuilder();
    Document doc = dbld.parse(f);
    doc.getDocumentElement().normalize();
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
    public static Node getFirstElementSibling(Node node)
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
  

