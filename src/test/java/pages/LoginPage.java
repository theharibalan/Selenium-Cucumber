package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    protected WebDriver driver;

    private By txt_username = By.id("name");
    private By txt_password = By.id("password");
    private By btn_login = By.id("submit");


    public void enterUsername(String username){
        driver.findElement(By.id(String.valueOf(txt_username))).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(By.id(String.valueOf(txt_password))).sendKeys(password);
    }

    public void login(){
        driver.findElement(By.id(String.valueOf(btn_login))).click();
    }

//    public void loginUserCred(String username, String password){
//        driver.findElement(By.id(txt_username)).sendKeys(username);
//        driver.findElement(By.id(txt_password)).sendKeys(password);
//        driver.findElement(By.id(btn_login)).click();
//    }

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }


}
