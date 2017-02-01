
package trng.imcs.soap.temp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eligibilityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eligibilityResponse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanResponse", namespace = "http://www.example.org/LoanResponse", propOrder = {
    "eligibilityCode",
    "eligibilityResponse"
})
public class LoanResponse {

    @XmlElement(required = true)
    protected String eligibilityCode;
    @XmlElement(required = true)
    protected String eligibilityResponse;

    /**
     * Gets the value of the eligibilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityCode() {
        return eligibilityCode;
    }

    /**
     * Sets the value of the eligibilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityCode(String value) {
        this.eligibilityCode = value;
    }

    /**
     * Gets the value of the eligibilityResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityResponse() {
        return eligibilityResponse;
    }

    /**
     * Sets the value of the eligibilityResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityResponse(String value) {
        this.eligibilityResponse = value;
    }

}
