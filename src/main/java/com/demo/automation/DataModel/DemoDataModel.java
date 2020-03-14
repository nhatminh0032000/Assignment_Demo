package com.demo.automation.DataModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DemoDataModel {

    @JsonProperty("id")
    private int id;

    @JsonProperty("title")
    private String title;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}

