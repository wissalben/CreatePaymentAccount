//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.01.31 à 03:28:10 PM GMT 
//


package com.cmi.xml.account;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cmi.xml.account package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cmi.xml.account
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateAccountValidationRequest }
     * 
     */
    public CreateAccountValidationRequest createCreateAccountValidationRequest() {
        return new CreateAccountValidationRequest();
    }

    /**
     * Create an instance of {@link CreateAccountValidationResponse }
     * 
     */
    public CreateAccountValidationResponse createCreateAccountValidationResponse() {
        return new CreateAccountValidationResponse();
    }

}
