package com.demo.test;

import com.demo.automation.DataModel.DemoDataModel;
import com.demo.automation.Keywords.ApiKeywords;
import com.demo.automation.Keywords.IApiKeywords;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class ApiTest  {

    protected IApiKeywords apiKeywords =  new ApiKeywords();

    String endPoint = "https://my-json-server.typicode.com/typicode/demo/posts/1";

    @Test
    public void verifyAPI() throws InterruptedException, IOException {
        HttpUriRequest request = RequestBuilder.get(endPoint).build();
        String jsonReponses = apiKeywords.makeRestRequest(request);
        ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        DemoDataModel dataModel = objectMapper.readValue(jsonReponses,DemoDataModel.class);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(dataModel.getId(), 1);
        softAssert.assertEquals(dataModel.getTitle(), "Post 1");
        softAssert.assertAll();

    }
}
