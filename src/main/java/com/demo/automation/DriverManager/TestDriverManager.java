package com.demo.automation.DriverManager;

import org.openqa.selenium.WebDriver;

public class TestDriverManager {

    private  ThreadLocal<WebDriver> parallelDriver = new ThreadLocal<WebDriver>();

    private static TestDriverManager instance;

    private TestDriverManager()
    {
        //do nothing
    }

    public static TestDriverManager init()
    {
        if (instance == null)
        {
            instance = new TestDriverManager();

        }
        return instance;
    }


    public void setDriver(WebDriver driver)
    {
        this.parallelDriver.set(driver);

    }

    public WebDriver getDriver()
    {
        return parallelDriver.get();
    }

}
