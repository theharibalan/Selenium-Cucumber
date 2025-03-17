//package StepDefinitions;
//
//import Pages.LoginPage;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class LoginDiffScenarios_POM {
//    WebDriver driver;
//    WebDriverWait wait;
//    LoginPage loginPage;
//
//    @Given("browser is open")
//    public void browser_is_open() {
//        System.out.println("Inside Step : browser is open");
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
//        driver = new ChromeDriver();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//        driver.manage().window().maximize();
//        loginPage = new LoginPage(driver);
//    }
//
//    @And("User is on login page")
//    public void user_is_on_login_page() {
//        System.out.println("Inside Step : User is on login page");
//        loginPage.openLoginPage();
//    }
//
//    @When("^User enters \"(.*)\" and \"(.*)\"$")
//    public void user_enters_username_and_password(String username, String password) {
//        System.out.println("Inside Step : User enters username and password");
//        loginPage.enterUsername(username);
//        loginPage.enterPassword(password);
//    }
//
//    @And("user clicks on login")
//    public void user_clicks_on_login() {
//        System.out.println("Inside Step : User clicks on login");
//        loginPage.clickLoginButton();
//    }
//
//    @Then("User is navigated to the home page")
//    public void user_is_navigated_to_the_home_page() {
//        System.out.println("Inside Step : User is navigated to the home page");
//        Assert.assertTrue(loginPage.isUserOnHomePage());
//        driver.quit();
//    }
//
//    @Then("An error message is displayed")
//    public void an_error_message_is_displayed() {
//        Assert.assertTrue("Error message is not displayed", loginPage.isErrorMessageDisplayed());
//    }
//
//    @And("The error message text is {string}")
//    public void the_error_message_text_is(String expectedText) {
//        Assert.assertEquals("The message for the site", expectedText, loginPage.getErrorMessageText());
//    }
//}
