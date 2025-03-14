//package StepDefinitions;
//
//import io.cucumber.java.en.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//public class GoogleSearchSteps {
//
//    WebDriver driver;
//
//    @Given("browser is open")
//    public void browser_is_open() {
//        System.out.println("Inside Step : browser is open");
//        String projectPath = System.getProperty("user.dir");
//        System.out.println("Project Path : "+projectPath);
//
//
//        System.setProperty("webdriver.chrome.driver", projectPath + "src/test/resources/drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//
//        driver.manage().window().maximize();
//    }
//
//    @And("User is on google search")
//    public void user_is_on_google_search() {
//        System.out.println("Inside Step : User is on google search");
//        driver.navigate().to("https://google.com");
//    }
//
//    @When("user enters a text in search box")
//    public void user_enters_a_text_in_search_box() throws InterruptedException {
//        System.out.println("Inside Step : user enters a text in search box");
//        driver.findElement(By.name("q")).sendKeys("Designer Bros");
//        Thread.sleep(2000);
//    }
//
//
//    @And("hits enter")
//    public void hits_enter() throws InterruptedException {System.out.println("Inside Step : ");
//        System.out.println("Inside Step : hits enter");
//        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//        Thread.sleep(2000);
//    }
//
//    @Then("user is navigated to search results")
//    public void user_is_navigated_to_search_results() {
//        System.out.println("Inside Step : user is navigated to search results");
//        driver.getPageSource().contains("Designer Bros - Web Development, SEO & Video Editing");
//
//        driver.close();
//        driver.quit();
//    }
//
//}
