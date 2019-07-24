//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.07.24 à 04:21:49 PM CEST 
//


package uk.org.siri.wsdl;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.org.siri.wsdl package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.org.siri.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckStatus }
     * 
     */
    public CheckStatus createCheckStatus() {
        return new CheckStatus();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link CheckStatusResponse }
     * 
     */
    public CheckStatusResponse createCheckStatusResponse() {
        return new CheckStatusResponse();
    }

    /**
     * Create an instance of {@link CheckStatusAnswerInfo }
     * 
     */
    public CheckStatusAnswerInfo createCheckStatusAnswerInfo() {
        return new CheckStatusAnswerInfo();
    }

    /**
     * Create an instance of {@link Answer }
     * 
     */
    public Answer createAnswer() {
        return new Answer();
    }

}
