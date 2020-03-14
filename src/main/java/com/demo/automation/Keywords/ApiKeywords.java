package com.demo.automation.Keywords;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import sun.net.www.http.HttpClient;

import java.io.IOException;

public class ApiKeywords implements  IApiKeywords{

    @Override
    public String makeRestRequest(HttpUriRequest request) throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpResponse response = httpClient.execute(request);
        HttpEntity httpEntity = response.getEntity();
        return EntityUtils.toString(httpEntity);
    }
}
