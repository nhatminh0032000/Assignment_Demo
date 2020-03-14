package com.demo.automation.PageObjects;

import org.openqa.selenium.By;

public class LoginPage extends AbstractBaseObject {

    By  fieldEmail = By.name("email");
    By  fieldPassword = By.name("password");
    By  btnLogin = By.className("col-login__btn");

    public void LoginWith(String userName, String password){
        browserKeyword.inputText(fieldEmail, userName);
        browserKeyword.inputText(fieldPassword, password);
        browserKeyword.clickElement(btnLogin);
    }

}
