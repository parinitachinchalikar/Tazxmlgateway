package com.connector.xmlgateway.model.request;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BackgroundSearchPackage")
public class BackgroundSearchPackage {

    //attributes
    @XmlAttribute
    private String action;

    @XmlAttribute
    private String type;

    public BackgroundSearchPackage() {
    }

    public BackgroundSearchPackage(String action, String type) {
        this.action = action;
        this.type = type;
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

    @Override
    public String toString() {
        return "BackgroundSearchPackage{" +
                "action='" + action + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
