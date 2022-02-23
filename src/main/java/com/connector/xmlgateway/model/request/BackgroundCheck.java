package com.connector.xmlgateway.model.request;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "BackgroundCheck")
public class BackgroundCheck {

    //attributes
    @XmlAttribute
    private String userId;

    @XmlAttribute
    private String password;

    //Elements
    @XmlElement
    private int refId;

    @XmlElement
    private BackgroundSearchPackage backgroundSearchPackage;

    @XmlElement
    private PersonalData personalData;

    private List<Screenings> screeningsList;

    private List<AdditionalItems> additionalItemsList;

    public BackgroundCheck() {
    }

    public BackgroundCheck(String userId, String password, int refId, BackgroundSearchPackage backgroundSearchPackage,
                           PersonalData personalData, List<Screenings> screeningsList,
                           List<AdditionalItems> additionalItemsList) {
        this.userId = userId;
        this.password = password;
        this.refId = refId;
        this.backgroundSearchPackage = backgroundSearchPackage;
        this.personalData = personalData;
        this.screeningsList = screeningsList;
        this.additionalItemsList = additionalItemsList;
    }

    @XmlAttribute
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @XmlAttribute
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlElement
    public int getRefId() {
        return refId;
    }

    public void setRefId(int refId) {
        this.refId = refId;
    }

    @XmlElement
    public BackgroundSearchPackage getBackgroundSearchPackage() {
        return backgroundSearchPackage;
    }

    public void setBackgroundSearchPackage(BackgroundSearchPackage backgroundSearchPackage) {
        this.backgroundSearchPackage = backgroundSearchPackage;
    }

    @XmlElement
    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    @XmlElement
    public List<Screenings> getScreeningsList() {
        return screeningsList;
    }

    public void setScreeningsList(List<Screenings> screeningsList) {
        this.screeningsList = screeningsList;
    }

    public List<AdditionalItems> getAdditionalItemsList() {
        return additionalItemsList;
    }

    public void setAdditionalItemsList(List<AdditionalItems> additionalItemsList) {
        this.additionalItemsList = additionalItemsList;
    }

    @Override
    public String toString() {
        return "BackgroundCheck{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", refId=" + refId +
                ", backgroundSearchPackage=" + backgroundSearchPackage +
                ", personalData=" + personalData +
                ", screeningsList=" + screeningsList +
                ", additionalItemsList=" + additionalItemsList +
                '}';
    }
}
