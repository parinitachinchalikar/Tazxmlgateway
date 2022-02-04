package model.request;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "")
public class PersonalInfo {

    //Elements
    private String givenName;
    private String middleName;
    private String familyName;
    private int postalCode;
    private String region;
    private String municipality;
    private String addressLine;
    private String email;
    private int telephone;
    private List<Aliases> aliasesList;
    private List<GovernmentId> governmentIdList;

    public PersonalInfo() {
    }

    public PersonalInfo(String givenName, String middleName, String familyName, int postalCode, String region,
                        String municipality, String addressLine, String email, int telephone, List<Aliases> aliasesList,
                        List<GovernmentId> governmentIdList) {
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.postalCode = postalCode;
        this.region = region;
        this.municipality = municipality;
        this.addressLine = addressLine;
        this.email = email;
        this.telephone = telephone;
        this.aliasesList = aliasesList;
        this.governmentIdList = governmentIdList;
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

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public List<Aliases> getAliasesList() {
        return aliasesList;
    }

    public void setAliasesList(List<Aliases> aliasesList) {
        this.aliasesList = aliasesList;
    }

    public List<GovernmentId> getGovernmentIdList() {
        return governmentIdList;
    }

    public void setGovernmentIdList(List<GovernmentId> governmentIdList) {
        this.governmentIdList = governmentIdList;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "givenName='" + givenName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", postalCode=" + postalCode +
                ", region='" + region + '\'' +
                ", municipality='" + municipality + '\'' +
                ", addressLine='" + addressLine + '\'' +
                ", email='" + email + '\'' +
                ", telephone=" + telephone +
                ", aliasesList=" + aliasesList +
                ", governmentIdList=" + governmentIdList +
                '}';
    }
}
