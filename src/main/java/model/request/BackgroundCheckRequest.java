package model.request;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "")
public class BackgroundCheckRequest {

    //attributes
    private String userId;
    private String password;
    private String action;
    private String type;

    //Elements
    private int refId;
    private PersonalInfo personalInfo;
    private List<Screening> screeningList;

    public BackgroundCheckRequest() {
    }

    public BackgroundCheckRequest(String userId, String password, String action, String type, int refId,
                                  PersonalInfo personalInfo, List<Screening> screeningList) {
        this.userId = userId;
        this.password = password;
        this.action = action;
        this.type = type;
        this.refId = refId;
        this.personalInfo = personalInfo;
        this.screeningList = screeningList;
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

    @XmlAttribute
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @XmlAttribute
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement
    public int getRefId() {
        return refId;
    }

    public void setRefId(int refId) {
        this.refId = refId;
    }

    @XmlElement
    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    @XmlElement
    public List<Screening> getScreeningList() {
        return screeningList;
    }

    public void setScreeningList(List<Screening> screeningList) {
        this.screeningList = screeningList;
    }

    @Override
    public String toString() {
        return "backGroundCheck{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", action='" + action + '\'' +
                ", type='" + type + '\'' +
                ", refId=" + refId +
                ", personalInfo=" + personalInfo +
                ", screeningList=" + screeningList +
                '}';
    }
}
