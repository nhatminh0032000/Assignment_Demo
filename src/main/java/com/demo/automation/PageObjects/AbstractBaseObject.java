package com.demo.automation.PageObjects;

import com.demo.automation.DriverManager.TestDriverManager;
import com.demo.automation.Keywords.BrowserKeywords;
import com.demo.automation.Keywords.IBrowserKeywords;
import com.demo.automation.Keywords.WaitKeywords;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractBaseObject {


    protected IBrowserKeywords browserKeyword = new BrowserKeywords();

    protected  WaitKeywords wait = WaitKeywords.getInstance();


    public AbstractBaseObject()
    {
        //do nothing
    }
}
