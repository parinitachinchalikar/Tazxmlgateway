package model.request;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
public class Vendor {

    //attributes
    private String score;
    private String fraud;
    private String type;
    private String highRiskFraudAlert;

    public Vendor() {
    }

    public Vendor(String score, String fraud, String type, String highRiskFraudAlert) {
        this.score = score;
        this.fraud = fraud;
        this.type = type;
        this.highRiskFraudAlert = highRiskFraudAlert;
    }

    @XmlAttribute
    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @XmlAttribute
    public String getFraud() {
        return fraud;
    }

    public void setFraud(String fraud) {
        this.fraud = fraud;
    }

    @XmlAttribute
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlAttribute
    public String getHighRiskFraudAlert() {
        return highRiskFraudAlert;
    }

    public void setHighRiskFraudAlert(String highRiskFraudAlert) {
        this.highRiskFraudAlert = highRiskFraudAlert;
    }

    @Override
    public String toString() {
        return "vendor{" +
                "score='" + score + '\'' +
                ", fraud='" + fraud + '\'' +
                ", type='" + type + '\'' +
                ", highRiskFraudAlert='" + highRiskFraudAlert + '\'' +
                '}';
    }
}
