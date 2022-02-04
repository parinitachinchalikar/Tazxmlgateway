package model.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
public class Aliases {

    private String givenName;
    private String middleName;
    private String familyName;

    public Aliases() {
    }

    public Aliases(String givenName, String middleName, String familyName) {
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
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

    @Override
    public String toString() {
        return "Aliases{" +
                "givenName='" + givenName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", familyName='" + familyName + '\'' +
                '}';
    }
}
