package com.demo.automation.Keywords;

import com.demo.automation.DriverManager.TestDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BrowserKeywords  implements IBrowserKeywords{

    protected WaitKeywords waitsKeyword = WaitKeywords.getInstance();

    @Override
    public void getUrl(String url) {
        TestDriverManager.init().getDriver().get(url);
    }

    @Override
    public void quitDriver() {
        TestDriverManager.init().getDriver().quit();

    }

    @Override
    public void maximizeBrowser()
    {
        TestDriverManager.init().getDriver().manage().window().maximize();
    }

    @Override
    public void inputText(By selector, String inputtext)
    {
        waitsKeyword.waitUntilSelectorElementIsDisplayed(selector).sendKeys(inputtext);
    }

    @Override
    public void clickElement(By selector)
    {
        waitsKeyword.waitUntilSelectorElementIsDisplayed(selector).click();
    }

    @Override
    public String getText(WebElement element)
    {
       return  waitsKeyword.waitUntilSelectorElementIsDisplayed(element).getText();
    }

    @Override
    public String getText(By selector)
    {
        return  waitsKeyword.waitUntilSelectorElementIsDisplayed(selector).getText();
    }
}
