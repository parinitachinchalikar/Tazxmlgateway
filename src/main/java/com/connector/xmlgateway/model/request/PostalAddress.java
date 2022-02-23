package com.connector.xmlgateway.model.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PostalAddress")
public class PostalAddress {

    private int postalCode;
    private String region;
    private String municipality;
    private String deliveryAddress;
    private String addressLine;

    public PostalAddress() {
    }

    public PostalAddress(int postalCode, String region, String municipality, String deliveryAddress, String addressLine) {
        this.postalCode = postalCode;
        this.region = region;
        this.municipality = municipality;
        this.deliveryAddress = deliveryAddress;
        this.addressLine = addressLine;
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

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    @Override
    public String toString() {
        return "PostalAddress{" +
                "postalCode=" + postalCode +
                ", region='" + region + '\'' +
                ", municipality='" + municipality + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", addressLine='" + addressLine + '\'' +
                '}';
    }
}
