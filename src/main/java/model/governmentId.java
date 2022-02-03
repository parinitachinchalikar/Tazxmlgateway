package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "")
public class governmentId {

    //Attributes
    private String issuingAuthority;
    private String jurisdiction;

    //Elements
    private Date dateOfBirth;

    public governmentId() {
    }

    public governmentId(String issuingAuthority, String jurisdiction, Date dateOfBirth) {
        this.issuingAuthority = issuingAuthority;
        this.jurisdiction = jurisdiction;
        this.dateOfBirth = dateOfBirth;
    }

    @XmlAttribute
    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    @XmlAttribute
    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @XmlElement
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "governmentId{" +
                "issuingAuthority='" + issuingAuthority + '\'' +
                ", jurisdiction='" + jurisdiction + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
