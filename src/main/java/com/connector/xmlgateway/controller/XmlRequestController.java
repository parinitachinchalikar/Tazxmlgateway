package com.connector.xmlgateway.controller;

import com.connector.xmlgateway.model.response.BackgroundCheckResponse;
import com.connector.xmlgateway.service.BackgroundCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class XmlRequestController {

    @Autowired
    private BackgroundCheckService bgcService;

    @RequestMapping(method = RequestMethod.POST, value = "/orders/jdp")
    public BackgroundCheckResponse generateOrder() throws Exception {
        return bgcService.createOrder();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/orders/{orderId}/status")
     public BackgroundCheckResponse fetchStatus(int orderId) throws Exception {
        return bgcService.getOrderStatus(orderId);
    }
}