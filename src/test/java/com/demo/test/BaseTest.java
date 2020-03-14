package com.demo.test;

import com.demo.automation.DriverManager.DriverFactory;
import com.demo.automation.DriverManager.TestChromeDriver;
import com.demo.automation.DriverManager.TestDriverManager;
import com.demo.automation.EnvironmentManager.Environment;
import com.demo.automation.EnvironmentManager.EnvironmentType;
import com.demo.automation.Keywords.ApiKeywords;
import com.demo.automation.Keywords.BrowserKeywords;
import com.demo.automation.Keywords.IApiKeywords;
import com.demo.automation.Keywords.IBrowserKeywords;
import com.demo.automation.PageObjects.LoginPage;
import com.demo.automation.PageObjects.ParentPortalPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class BaseTest {


    private DriverFactory factory;

    protected IBrowserKeywords browserKeyword;

    protected Environment environment = Environment.getInstance();


    @BeforeSuite
    public void init()
    {
        factory = new TestChromeDriver();
        TestDriverManager.init().setDriver(factory.createDriver());
        browserKeyword = new BrowserKeywords();
        browserKeyword.maximizeBrowser();
        browserKeyword.getUrl(environment.getUrl(EnvironmentType.PRODUCTION));
    }

    @AfterTest
    public  void tearDown()
    {
        browserKeyword.quitDriver();
    }


    public LoginPage getLoginpage()
    {
        return new LoginPage();
    }

    public ParentPortalPage getParentPortalPage()
    {
        return new ParentPortalPage();
    }
}
