package com.demo.automation.Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface IBrowserKeywords {

    void getUrl(String url);

    void quitDriver();

    void maximizeBrowser();

    void inputText(By selector, String inputtext);

    void clickElement(By selector);

    String getText(WebElement element);

    String getText(By selector);

}
