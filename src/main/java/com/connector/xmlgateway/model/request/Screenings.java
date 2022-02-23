package com.connector.xmlgateway.model.request;

import javax.xml.bind.annotation.*;
import java.util.Date;
import java.util.List;

@XmlRootElement(name = "Screenings")
public class Screenings {

    //Attributes
    @XmlAttribute
    private String type;
    private String qualifier;
    private String name;
    private String degreeType;

    //Elements
    private String screening;
    private List<Vendor> vendor;
    private String region;
    private String county;
    private String district;
    private String formattedName;
    private String telephone;
    private String relationship;
    private Date startDate;
    private int postalCode;
    private String municipality;
    private String addressLine;
    private String licenseNumber;
    private String schoolName;
    private String degreeName;
    private Date stringDate;
    private String panel;
    private String permissiblePurpose;
    private List<AdditionalItems> additionalItemsList;

    public Screenings() {
    }

    public Screenings(String type, String qualifier, String name, String degreeType, String screening,
                      List<Vendor> vendor, String region, String county, String district, String formattedName,
                      String telephone, String relationship, Date startDate, int postalCode, String municipality,
                      String addressLine, String licenseNumber, String schoolName, String degreeName, Date stringDate,
                      String panel, String permissiblePurpose, List<AdditionalItems> additionalItemsList) {
        this.type = type;
        this.qualifier = qualifier;
        this.name = name;
        this.degreeType = degreeType;
        this.screening = screening;
        this.vendor = vendor;
        this.region = region;
        this.county = county;
        this.district = district;
        this.formattedName = formattedName;
        this.telephone = telephone;
        this.relationship = relationship;
        this.startDate = startDate;
        this.postalCode = postalCode;
        this.municipality = municipality;
        this.addressLine = addressLine;
        this.licenseNumber = licenseNumber;
        this.schoolName = schoolName;
        this.degreeName = degreeName;
        this.stringDate = stringDate;
        this.panel = panel;
        this.permissiblePurpose = permissiblePurpose;
        this.additionalItemsList = additionalItemsList;
    }

    @XmlAttribute
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlAttribute
    public String getQualifier() {
        return qualifier;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    @XmlAttribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlAttribute
    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    @XmlElement
    public String getScreening() {
        return screening;
    }

    public void setScreening(String screening) {
        this.screening = screening;
    }

    @XmlElement
    public List<Vendor> getVendor() {
        return vendor;
    }

    public void setVendor(List<Vendor> vendor) {
        this.vendor = vendor;
    }

    @XmlElement
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @XmlElement
    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @XmlElement
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @XmlElement
    public String getFormattedName() {
        return formattedName;
    }

    public void setFormattedName(String formattedName) {
        this.formattedName = formattedName;
    }

    @XmlElement
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @XmlElement
    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @XmlElement
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @XmlElement
    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @XmlElement
    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    @XmlElement
    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    @XmlElement
    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @XmlElement
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @XmlElement
    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    @XmlElement
    public Date getStringDate() {
        return stringDate;
    }

    public void setStringDate(Date stringDate) {
        this.stringDate = stringDate;
    }

    @XmlElement
    public String getPanel() {
        return panel;
    }

    public void setPanel(String panel) {
        this.panel = panel;
    }

    @XmlElement
    public String getPermissiblePurpose() {
        return permissiblePurpose;
    }

    public void setPermissiblePurpose(String permissiblePurpose) {
        this.permissiblePurpose = permissiblePurpose;
    }

    @XmlElement
    public List<AdditionalItems> getAdditionalItemsList() {
        return additionalItemsList;
    }

    public void setAdditionalItemsList(List<AdditionalItems> additionalItemsList) {
        this.additionalItemsList = additionalItemsList;
    }
}
