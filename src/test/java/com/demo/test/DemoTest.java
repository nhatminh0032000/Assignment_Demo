package com.demo.test;

import com.demo.automation.DataModel.DemoDataModel;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class DemoTest extends BaseTest{

    String userName = "admin@test.com";
    String password = "test123";
    String endPoint = "https://my-json-server.typicode.com/typicode/demo/posts/1";

    @Test
    public void countApproved() throws InterruptedException {
        getLoginpage().LoginWith(userName, password);
        int number = getParentPortalPage().getApproved();
        System.out.println("Request Status = Approved && Date Submitted = 2019 is " + number);
    }


}
