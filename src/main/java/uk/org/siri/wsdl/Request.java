//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.07.24 à 04:21:49 PM CEST 
//


package uk.org.siri.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Request complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestTimestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RequestorRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MessageIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", propOrder = {
    "requestTimestamp",
    "requestorRef",
    "messageIdentifier"
})
public class Request {

    @XmlElement(name = "RequestTimestamp", required = true)
    protected String requestTimestamp;
    @XmlElement(name = "RequestorRef", required = true)
    protected String requestorRef;
    @XmlElement(name = "MessageIdentifier", required = true)
    protected String messageIdentifier;

    /**
     * Obtient la valeur de la propriété requestTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestTimestamp() {
        return requestTimestamp;
    }

    /**
     * Définit la valeur de la propriété requestTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTimestamp(String value) {
        this.requestTimestamp = value;
    }

    /**
     * Obtient la valeur de la propriété requestorRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorRef() {
        return requestorRef;
    }

    /**
     * Définit la valeur de la propriété requestorRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestorRef(String value) {
        this.requestorRef = value;
    }

    /**
     * Obtient la valeur de la propriété messageIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageIdentifier() {
        return messageIdentifier;
    }

    /**
     * Définit la valeur de la propriété messageIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageIdentifier(String value) {
        this.messageIdentifier = value;
    }

}
