package com.demo.automation.DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestChromeDriver implements DriverFactory{

    public WebDriver createDriver() {
        initChromeDriver();
        ChromeOptions options  = new ChromeOptions();
        //disable all chrome pop up
        options.addArguments("--disable-popup-blocking");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        return new ChromeDriver(capabilities);
    }

    private void initChromeDriver()
    {
        WebDriverManager.chromedriver().setup();
    }

}
