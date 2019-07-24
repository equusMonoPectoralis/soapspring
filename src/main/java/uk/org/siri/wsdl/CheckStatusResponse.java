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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckStatusAnswerInfo" type="{http://wsdl.siri.org.uk}CheckStatusAnswerInfo"/>
 *         &lt;element name="Answer" type="{http://wsdl.siri.org.uk}Answer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "checkStatusAnswerInfo",
    "answer"
})
@XmlRootElement(name = "CheckStatusResponse")
public class CheckStatusResponse {

    @XmlElement(name = "CheckStatusAnswerInfo", required = true)
    protected CheckStatusAnswerInfo checkStatusAnswerInfo;
    @XmlElement(name = "Answer", required = true)
    protected Answer answer;

    /**
     * Obtient la valeur de la propriété checkStatusAnswerInfo.
     * 
     * @return
     *     possible object is
     *     {@link CheckStatusAnswerInfo }
     *     
     */
    public CheckStatusAnswerInfo getCheckStatusAnswerInfo() {
        return checkStatusAnswerInfo;
    }

    /**
     * Définit la valeur de la propriété checkStatusAnswerInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckStatusAnswerInfo }
     *     
     */
    public void setCheckStatusAnswerInfo(CheckStatusAnswerInfo value) {
        this.checkStatusAnswerInfo = value;
    }

    /**
     * Obtient la valeur de la propriété answer.
     * 
     * @return
     *     possible object is
     *     {@link Answer }
     *     
     */
    public Answer getAnswer() {
        return answer;
    }

    /**
     * Définit la valeur de la propriété answer.
     * 
     * @param value
     *     allowed object is
     *     {@link Answer }
     *     
     */
    public void setAnswer(Answer value) {
        this.answer = value;
    }

}
