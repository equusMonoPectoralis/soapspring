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
 * <p>Classe Java pour CheckStatusAnswerInfo complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CheckStatusAnswerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseTimestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProducerRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResponseMessageIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RequestMessageRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckStatusAnswerInfo", propOrder = {
    "responseTimestamp",
    "producerRef",
    "responseMessageIdentifier",
    "requestMessageRef"
})
public class CheckStatusAnswerInfo {

    @XmlElement(name = "ResponseTimestamp", required = true)
    protected String responseTimestamp;
    @XmlElement(name = "ProducerRef", required = true)
    protected String producerRef;
    @XmlElement(name = "ResponseMessageIdentifier", required = true)
    protected String responseMessageIdentifier;
    @XmlElement(name = "RequestMessageRef", required = true)
    protected String requestMessageRef;

    /**
     * Obtient la valeur de la propriété responseTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseTimestamp() {
        return responseTimestamp;
    }

    /**
     * Définit la valeur de la propriété responseTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseTimestamp(String value) {
        this.responseTimestamp = value;
    }

    /**
     * Obtient la valeur de la propriété producerRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerRef() {
        return producerRef;
    }

    /**
     * Définit la valeur de la propriété producerRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerRef(String value) {
        this.producerRef = value;
    }

    /**
     * Obtient la valeur de la propriété responseMessageIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseMessageIdentifier() {
        return responseMessageIdentifier;
    }

    /**
     * Définit la valeur de la propriété responseMessageIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseMessageIdentifier(String value) {
        this.responseMessageIdentifier = value;
    }

    /**
     * Obtient la valeur de la propriété requestMessageRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestMessageRef() {
        return requestMessageRef;
    }

    /**
     * Définit la valeur de la propriété requestMessageRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestMessageRef(String value) {
        this.requestMessageRef = value;
    }

}
