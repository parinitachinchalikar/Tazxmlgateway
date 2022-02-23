package com.connector.xmlgateway.entity;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import static javax.persistence.GenerationType.AUTO;

@Entity(name = "orders")
@Table(name = "orders")
public class Order {

    @Id
    @NotNull
    @GeneratedValue(strategy = AUTO)
    private long jdpId;
    private String fName;
    private String lName;
    private Long postalCode;
    private String addressLine;
    private String email;
    private long ssn;
    private String orderStatus;
    private boolean errorStatus;
    private int errorCode;
    private String errorDesc;
    private String xmlRequest;
    private String xmlResponse;
    // TODO: properties to store raw xml response and request


    public Order() {
    }

    public Order(long jdpId, String fName, String lName, Long postalCode, String addressLine, String email, long ssn,
                 String orderStatus, boolean errorStatus, int errorCode, String errorDesc, String xmlRequest,
                 String xmlResponse) {
        this.jdpId = jdpId;
        this.fName = fName;
        this.lName = lName;
        this.postalCode = postalCode;
        this.addressLine = addressLine;
        this.email = email;
        this.ssn = ssn;
        this.orderStatus = orderStatus;
        this.errorStatus = errorStatus;
        this.errorCode = errorCode;
        this.errorDesc = errorDesc;
        this.xmlRequest = xmlRequest;
        this.xmlResponse = xmlResponse;
    }

    public long getJdpId() {
        return jdpId;
    }

    public void setJdpId(long jdpId) {
        this.jdpId = jdpId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Long postalCode) {
        this.postalCode = postalCode;
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

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public boolean isErrorStatus() {
        return errorStatus;
    }

    public void setErrorStatus(boolean errorStatus) {
        this.errorStatus = errorStatus;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    public String getXmlRequest() {
        return xmlRequest;
    }

    public void setXmlRequest(String xmlRequest) {
        this.xmlRequest = xmlRequest;
    }

    public String getXmlResponse() {
        return xmlResponse;
    }

    public void setXmlResponse(String xmlResponse) {
        this.xmlResponse = xmlResponse;
    }

    @Override
    public String toString() {
        return "Order{" +
                "jdpId=" + jdpId +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", postalCode=" + postalCode +
                ", addressLine='" + addressLine + '\'' +
                ", email='" + email + '\'' +
                ", ssn=" + ssn +
                ", orderStatus='" + orderStatus + '\'' +
                ", errorStatus=" + errorStatus +
                ", errorCode=" + errorCode +
                ", errorDesc='" + errorDesc + '\'' +
                ", xmlRequest='" + xmlRequest + '\'' +
                ", xmlResponse='" + xmlResponse + '\'' +
                '}';
    }
}