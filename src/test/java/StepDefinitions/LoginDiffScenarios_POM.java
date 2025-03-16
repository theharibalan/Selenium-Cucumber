//package StepDefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class LoginDiffScenarios_POM {
//    WebDriver driver;
//    WebDriverWait wait;
//
//    @Given("browser is open")
//    public void browser_is_open() {
//        System.out.println("Inside Step : browser is open");
//
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
//        driver = new ChromeDriver();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//
//        driver.manage().window().maximize();
//    }
//
//    @And("User is on login page")
//    public void user_is_on_login_page() {
//        System.out.println("Inside Step : User is on login page");
//        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
//    }
//
//    @When("^User enters \"(.*)\" and \"(.*)\"$")
//    public void user_enters_username_and_password(String username, String password) {
//        System.out.println("Inside Step : User enters username and password");
//        driver.findElement(By.id("username")).clear();
//        driver.findElement(By.id("username")).sendKeys(username);
//        driver.findElement(By.id("password")).clear();
//        driver.findElement(By.id("password")).sendKeys(password);
//    }
//
//    @And("user clicks on login")
//    public void user_clicks_on_login() {
//        System.out.println("Inside Step : User clicks on login");
//        driver.findElement(By.id("submit")).click();
//    }
//
//    @Then("User is navigated to the home page")
//    public void user_is_navigate_to_the_home_page() {
//        System.out.println("Inside Step : User is navigated to the home page");
//        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).isDisplayed());
//        driver.quit();
//    }
//
//    @Then("An error message is displayed")
//    public void an_error_message_is_displayed() {
//        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"error\"]"));
//        Assert.assertTrue("Error message is not displayed", errorMessage.isDisplayed());
//    }
//
//    @And("The error message text is {string}")
//    public void the_error_message_text_is(String expectedText) {
//        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"error\"]"));
//        String actualText = errorMessage.getText();
//        Assert.assertEquals("The message for the site", expectedText, actualText);
//    }
//}
