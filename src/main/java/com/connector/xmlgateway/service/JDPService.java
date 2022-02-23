package com.connector.xmlgateway.service;

import com.connector.xmlgateway.entity.Order;
import com.connector.xmlgateway.model.request.*;
import com.connector.xmlgateway.model.response.BackgroundCheckResponse;
import com.connector.xmlgateway.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

@Service
@PropertySource("classpath:application.properties")
public class JDPService {

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private Environment env;

    //TODO: read baseurl from application properties
    //TODO: Parameterize the request xml, the response xml and save that into the database
    public BackgroundCheckResponse saveBgcResponse() throws Exception {

        RestTemplate restTemplate = new RestTemplate();
        BackgroundCheckResponse response = restTemplate.postForObject(env.getProperty("jdp.baseurl"),
                fetchBGCFormByCoachId(300L), BackgroundCheckResponse.class);
        //Unmarshalling method call
        responseForNewOrder(response);
        return response;
    }

    //Unmarshalling is conversion of XML to Java Object
    private void responseForNewOrder (BackgroundCheckResponse resp) throws JAXBException {
        File file = new File(String.valueOf(resp));
        JAXBContext jaxbContext = JAXBContext.newInstance(Order.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Order order = (Order)jaxbUnmarshaller.unmarshal(file);
        orderRepo.save(order);
    }

    //Marshalling is conversion of Java Object to XML
    private Marshaller fetchBGCFormByCoachId(long coachId) throws Exception {

        BackgroundCheck bgcReq = populateXMLRequest();
        JAXBContext contextObj = JAXBContext.newInstance(BackgroundCheck.class);
        Marshaller marshallerObj = contextObj.createMarshaller();
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshallerObj.marshal(bgcReq, new FileOutputStream("BackgroundCheckRequest.xml"));
        return marshallerObj;
    }

    private BackgroundCheck populateXMLRequest() {

        BackgroundCheck bgcReq = new BackgroundCheck();
        BackgroundSearchPackage bgSearchPackage = new BackgroundSearchPackage();
        PersonalData personalData = new PersonalData();
        PostalAddress postalAddress = new PostalAddress();
        Aliases aliases = new Aliases();
        DemographicDetail demographicDetail = new DemographicDetail();
        DemographicDetail demographicDetail1 = new DemographicDetail();
        Screenings screenings = new Screenings();
        Screenings screenings1 = new Screenings();
        Vendor vendor = new Vendor();
        Vendor vendor1 = new Vendor();
        AdditionalItems additionalItems = new AdditionalItems();

        bgcReq.setUserId(env.getProperty("jdp.userId"));
        bgcReq.setPassword(env.getProperty("jdp.password"));

        bgSearchPackage.setAction("submit");
        bgSearchPackage.setType(env.getProperty("backgroundsearchpackage.type"));
        bgcReq.setBackgroundSearchPackage(bgSearchPackage);

        bgcReq.setRefId(123456);

        personalData.setGivenName("John");
        personalData.setMiddleName("Q");
        personalData.setFamilyName("Test");
        personalData.setAliasesList(new ArrayList<Aliases>());

        aliases.setGivenName("Jack");
        aliases.setMiddleName("Quigley");
        aliases.setFamilyName("Example");
        personalData.getAliasesList().add(aliases);
        personalData.setDemographicDetailList(new ArrayList<DemographicDetail>());

        demographicDetail.setIssuingAuthority("SSN");
        demographicDetail.setGovId(123456789);
        personalData.getDemographicDetailList().add(demographicDetail);
        demographicDetail1.setJurisdiction("UT");
        demographicDetail1.setIssuingAuthority("DMV");
        demographicDetail1.setGovId(123456789);
        personalData.getDemographicDetailList().add(demographicDetail1);

        postalAddress.setPostalCode(83201);
        postalAddress.setRegion("UT");
        postalAddress.setMunicipality("Salt Lake City");
        postalAddress.setAddressLine("1234 Main Street");

        personalData.setEmail("john@test.com");
        personalData.setTelephone(801 - 789 - 4229);
        bgcReq.setPersonalData(personalData);

        bgcReq.setScreeningsList(new ArrayList<Screenings>());

        screenings.setType("credit");
        screenings.setVendor(new ArrayList<Vendor>());
        vendor.setFraud("yes");
        vendor.setScore("yes");
        vendor.setVendor("Experian");
        screenings.getVendor().add(vendor);

        bgcReq.getScreeningsList().add(screenings);

        screenings1.setType("ssn");
        screenings1.setVendor(new ArrayList<Vendor>());
        vendor1.setType("idsearchplus");
        vendor1.setHighRiskFraudAlert("yes");
        vendor1.setVendor("transUnion");
        screenings1.getVendor().add(vendor1);

        bgcReq.getScreeningsList().add(screenings1);

        additionalItems.setType("x:interface");
        additionalItems.setText("Applicant|Instant");
        bgcReq.getAdditionalItemsList().add(additionalItems);

        return  bgcReq;
    }

    public BackgroundCheckResponse getStatus(int orderId) throws Exception {

        RestTemplate restTemplate = new RestTemplate();
        BackgroundCheckResponse status = restTemplate.postForObject(env.getProperty("jdp.baseurl"),
                fetchStatusByOrderId(1000), BackgroundCheckResponse.class);
        statusResponseByOrderId(status);
        return status;
    }

    //Unmarshalling is conversion of XML to Java Object
    private void statusResponseByOrderId( BackgroundCheckResponse status) throws JAXBException{

        File file = new File(String.valueOf(status));
        JAXBContext jaxbContext = JAXBContext.newInstance(Order.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Order order = (Order)jaxbUnmarshaller.unmarshal(file);
        orderRepo.save(order);
    }

    //Marshalling is conversion of Java Object to XML
    private Marshaller fetchStatusByOrderId(int orderId ) throws Exception{

        BackgroundCheckResponse bgcResp = populateInquiryXML();
        JAXBContext contextObj = JAXBContext.newInstance(BackgroundCheckResponse.class);
        Marshaller marshallerObj = contextObj.createMarshaller();
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshallerObj.marshal(bgcResp, new FileOutputStream("BackgroundCheckResponse.xml"));
        return marshallerObj;
    }

    private BackgroundCheckResponse populateInquiryXML(){

        BackgroundCheckResponse bgcResp = new BackgroundCheckResponse();
        bgcResp.setOrderId(1000);
        return bgcResp;
    }
}
