//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.10 at 01:31:15 AM IST 
//


package com.devglan.springbootsoapclient.generated.blz;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for getBankType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBankType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="blz" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBankType", propOrder = {
    "blz"
})
@XmlRootElement
public class GetBankType {

    @XmlElement(required = true)
    protected String blz;

    /**
     * Gets the value of the blz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlz() {
        return blz;
    }

    /**
     * Sets the value of the blz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlz(String value) {
        this.blz = value;
    }

}
