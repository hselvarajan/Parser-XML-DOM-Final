package com.github.akshayavenkatesh8;

import java.io.File;

/**
 * JAXBAddressParser: Parse an Address XML with JAXB
 * <p>
 * Author: <a href="mailto:hari@dcis.net">Hari Selvarajan</a>
 * Date: 6/7/16 6:51 PM
 * <p>
 * Revision: $Rev$
 */
public class JAXBAddressParser {

    public static void main(String... args) {
        JAXBAddressParser parser = new JAXBAddressParser();
        File addressXmlFile = new File(args[0]);
        Address address = parser.parseAddressWithJAXB(addressXmlFile);
        System.out.println(address);
    }

    public Address parseAddressWithJAXB(File addressXmlFile) {
        Address address = ?
        return address;
    }

    public Address parseAndValidateAddressWithJAXB(File addressXmlFile) {
        Address address = ?
        return address;
    }

    public String generateXMLFromAddress(Address address) {
        return ?
    }
}
