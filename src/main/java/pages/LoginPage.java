package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    // Locators
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("submit");
    private By errorMessage = By.id("error");
    private By homePageTitle = By.className("post-title");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Open login page
    public void openLoginPage() {
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
    }

    // Enter username
    public void enterUsername(String username) {
        driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys(username);
    }

    // Enter password
    public void enterPassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    // Click login button
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    // Verify user is on home page
    public boolean isUserOnHomePage() {
        return driver.findElement(homePageTitle).isDisplayed();
    }

    // Verify error message is displayed
    public boolean isErrorMessageDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        return driver.findElement(errorMessage).isDisplayed();
    }

    // Get error message text
    public String getErrorMessageText() {
        return driver.findElement(errorMessage).getText();
    }

}
