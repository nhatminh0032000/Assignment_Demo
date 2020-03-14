package com.demo.automation.Keywords;

import com.demo.automation.DriverManager.TestDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WaitKeywords {
    private  int TIME_OUT = 30;

    private static WaitKeywords instance;

    WebDriverWait wait;

    private WaitKeywords()
    {
        wait = new WebDriverWait(TestDriverManager.init().getDriver(), TIME_OUT);
    }

    public static WaitKeywords getInstance()
    {
        if (instance == null)
        {
            instance = new WaitKeywords();
        }
        return instance;
    }

    public WebElement waitUntilSelectorElementIsDisplayed(By selector)
    {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
    }

    public  WebElement waitUntilSelectorElementIsClickable(By selector)
    {
        return wait.until(ExpectedConditions.elementToBeClickable(selector));
    }

    public List<WebElement> WaitForAllElementBySelector(By selector) throws InterruptedException {
        List<WebElement> lstBefore= wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(selector));
        List<WebElement> lstAfter = null;
        boolean isLoadCompletedly = false;
        while (!isLoadCompletedly) {
            Thread.sleep(1000);
            lstAfter = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(selector));
            if (lstAfter.size() > lstBefore.size()) {
                lstBefore = lstAfter;
            }
            if (lstAfter.size() == lstBefore.size()) {
                break;
            }
        }
        return lstAfter;
    }

    public WebElement waitUntilSelectorElementIsDisplayed(WebElement element)
    {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilPageIsLoadedCompletedly()
    {
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }
}
