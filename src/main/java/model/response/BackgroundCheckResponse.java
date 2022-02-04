package model.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
public class BackgroundCheckResponse {

    private int refId;
    private int orderId;
    private String orderStatus;
    private int errorCode;
    private String errorDesc;
    private String applicantInterfaceURL;

    public BackgroundCheckResponse() {
    }

    public BackgroundCheckResponse(int refId, int orderId, String orderStatus, int errorCode, String errorDesc,
                                   String applicantInterfaceURL) {
        this.refId = refId;
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.errorCode = errorCode;
        this.errorDesc = errorDesc;
        this.applicantInterfaceURL = applicantInterfaceURL;
    }

    public int getRefId() {
        return refId;
    }

    public void setRefId(int refId) {
        this.refId = refId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
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

    public String getApplicantInterfaceURL() {
        return applicantInterfaceURL;
    }

    public void setApplicantInterfaceURL(String applicantInterfaceURL) {
        this.applicantInterfaceURL = applicantInterfaceURL;
    }

    @Override
    public String toString() {
        return "BackgroundCheckResponse{" +
                "refId=" + refId +
                ", orderId=" + orderId +
                ", orderStatus='" + orderStatus + '\'' +
                ", errorCode=" + errorCode +
                ", errorDesc='" + errorDesc + '\'' +
                ", applicantInterfaceURL='" + applicantInterfaceURL + '\'' +
                '}';
    }
}
