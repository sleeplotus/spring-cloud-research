package com.tiger.employee.beans;

/**
 * @author 王澎
 * @date 1/7/2019
 * @company VRV
 */
public class HoverflyServiceResponse {

    private String message;

    private String responseTime;

    private String transactionId;

    public HoverflyServiceResponse(String message, String responseTime, String transactionId) {
        super();
        this.setMessage(message);
        this.setResponseTime(responseTime);
        this.setTransactionId(transactionId);
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
