package model.request;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "")
public class AdditionalItems {

    //attribute
    private String type;

    //element
    private String text;

    public AdditionalItems() {
    }

    public AdditionalItems(String type, String text) {
        this.type = type;
        this.text = text;
    }

    @XmlAttribute
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "additionalItems{" +
                "type='" + type + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
