//package StepDefinitions;
//
//import io.cucumber.java.en.*;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//
//public class LoginDemoSteps {
//
//    WebDriver driver;
//
//
//    @Given("browser is open")
//    public void browser_is_open() {
//        System.out.println("Inside Step : browser is open");
////        String projectPath = System.getProperty("user.dir");
////        System.out.println("Project Path : "+projectPath);
//
//
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
//        driver = new ChromeDriver();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//
//        driver.manage().window().maximize();
//    }
//
//    @And("User is on login page")
//    public void user_is_on_login_page() throws InterruptedException {
//        System.out.println("Inside Step : User is on login page");
//        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
//
//        // Instead of Thread.Sleep(2000);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
//
//    }
//
//    @When("^User enters (.*) and (.*)$")
//    public void user_enters_username_and_password(String username, String password) {
//        System.out.println("Inside Step : User enters username and password - " + username + " | " + password);
//        driver.findElement(By.id("name")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
//    }
//
//    @And("user clicks on login")
//    public void user_clicks_on_login() throws InterruptedException {
//        System.out.println("Inside Step : User clicks on login");
//        driver.findElement(By.id("submit")).click();
//        Thread.sleep(2000);
//    }
//
//
////    @Then("User is navigate to the home page")
////    public void user_is_navigate_to_the_home_page() {
////        System.out.println("Inside Step : User is navigated to the home page");
////
////        // Assertion to verify login success
//////        Assert.assertTrue(driver.findElement(By.className("post-title")).isDisplayed());
////        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).isDisplayed());
////
////        driver.close();
////        driver.quit();
////    }
//
//    @Then("User is navigate to the home page")
//    public void user_is_navigate_to_the_home_page() {
//        System.out.println("Inside Step : User is navigated to the home page");
//
//        // More stable XPath for validation
//        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).isDisplayed());
//
//        driver.close();
//        driver.quit();
//    }
//
//}
