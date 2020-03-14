package com.demo.automation.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ParentPortalPage extends AbstractBaseObject {


    By selectors  = By.xpath("//tr[@class]//div[@class='ct-drop-group dropdown btn-group']/p[contains(text(),'Approved')]/ancestor::td/following-sibling::td/*[contains(text(), '2019')]");

    public int getApproved() throws InterruptedException {
        wait.waitUntilPageIsLoadedCompletedly();
        List<WebElement> lstWebElement = wait.WaitForAllElementBySelector(selectors);
        return lstWebElement.size();
    }

}
