package com.connector.xmlgateway.model.request;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "PersonalData")
public class PersonalData {

    //Elements
    private String personName;
    private String givenName;
    private String middleName;
    private String familyName;
    private String email;
    private long telephone;
    private PostalAddress postalAddress;
    private List<Aliases> aliasesList;
    private List<DemographicDetail> demographicDetailList;

    public PersonalData() {
    }

    public PersonalData(String personName, String givenName, String middleName, String familyName, String email,
                        long telephone, PostalAddress postalAddress, List<Aliases> aliasesList,
                        List<DemographicDetail> demographicDetailList) {
        this.personName = personName;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.email = email;
        this.telephone = telephone;
        this.postalAddress = postalAddress;
        this.aliasesList = aliasesList;
        this.demographicDetailList = demographicDetailList;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public PostalAddress getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(PostalAddress postalAddress) {
        this.postalAddress = postalAddress;
    }

    public List<DemographicDetail> getDemographicDetailList() {
        return demographicDetailList;
    }

    public void setDemographicDetailList(List<DemographicDetail> demographicDetailList) {
        this.demographicDetailList = demographicDetailList;
    }

    public List<Aliases> getAliasesList() {
        return aliasesList;
    }

    public void setAliasesList(List<Aliases> aliasesList) {
        this.aliasesList = aliasesList;
    }


    @Override
    public String toString() {
        return "PersonalData{" +
                "personName='" + personName + '\'' +
                ", givenName='" + givenName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", email='" + email + '\'' +
                ", telephone=" + telephone +
                ", postalAddress=" + postalAddress +
                ", aliasesList=" + aliasesList +
                ", demographicDetailList=" + demographicDetailList +
                '}';
    }
}
