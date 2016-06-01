/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.akshayavenkatesh8;
import org.w3c.dom.Node;

/**
 *
 * @author AKSHAYA
 */
public class Address {

    /**
     *
     */
    public String name;
    public String streetNumber;
    public String streetName;
    public String secondaryAddress;
    public String city;
    public String stateCode;
    public String zipCode;
    public String toString()
    {
       return "Address :\n"+name+",\n"+streetNumber+" "+streetName+",\n"+secondaryAddress+",\n"+city+",\n"+stateCode+" "+zipCode;
    }
    
}
