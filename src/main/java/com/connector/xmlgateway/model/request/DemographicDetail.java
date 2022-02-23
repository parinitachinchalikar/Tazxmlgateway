package com.connector.xmlgateway.model.request;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "DemographicDetail")
public class DemographicDetail {

    //Attributes
    @XmlAttribute
    private String issuingAuthority;

    @XmlAttribute
    private String jurisdiction;

    //Elements
    @XmlElement
    private int govId;

    @XmlElement
    private Date dateOfBirth;

    public DemographicDetail() {
    }

    public DemographicDetail(String issuingAuthority, String jurisdiction, int govId, Date dateOfBirth) {
        this.issuingAuthority = issuingAuthority;
        this.jurisdiction = jurisdiction;
        this.govId = govId;
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
    public int getGovId() {
        return govId;
    }

    public void setGovId(int govId) {
        this.govId = govId;
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
