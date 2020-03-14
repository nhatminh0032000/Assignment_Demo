package com.demo.automation.Keywords;

import org.apache.http.client.methods.HttpUriRequest;

import java.io.IOException;

public interface IApiKeywords {

    String makeRestRequest(HttpUriRequest request) throws IOException;
}
