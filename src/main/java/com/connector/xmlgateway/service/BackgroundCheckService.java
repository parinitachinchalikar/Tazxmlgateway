package com.connector.xmlgateway.service;

import com.connector.xmlgateway.model.response.BackgroundCheckResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BackgroundCheckService {
    //TODO: read  username and password from application properties
    //TODO: add jdp service reference

    @Autowired
    private JDPService jdpService;

    public BackgroundCheckResponse createOrder() throws Exception {
        return jdpService.saveBgcResponse();
    }

    public BackgroundCheckResponse getOrderStatus(int orderId) throws Exception {
        return jdpService.getStatus(orderId);
    }


}