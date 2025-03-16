# Selenium Cucumber

## Session: 01

Link: https://www.youtube.com/watch?v=4e9vhX7ZuCw

Step 1 - Create a new maven project
Step 2 - Add maven dependencies
  Cucumber Java | Cucumber JUnit | JUnit | Selenium Java
Step 3 - Create a folder Features under src/test/resources
Step 4 - Under features folder create a new feature file login.feature
Step 5 - Download cucumber plugin from Eclipse Marketplace
Step 6 - Create feature file and add contents
Feature
Scenario
Steps
Scenario Outline
Example
Tags
Comments

Step 7 - Try to run the feature file
Step 8 - Add Step Definitions / Glue Code under src/test/java package
Step 9 - Create a Runner class

import org.junit.runner.RunWith;   
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;  

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Features",
glue={"StepDefinitions"})
public class TestRunner {
}

monochrome = true

plugin = { "pretty", "html:target/reports"}
plugin = { "pretty", "json:target/reports/cucumber.json"}
plugin = { "pretty",  "junit:target/reports/cucumber.xml"}

tags="@smoketest"

Step 10 - Create Add Cucumber Options for generating reports
   HTML | JSON | JUNIT/XML   
Step 11 - Run and verify results

GitHub Repositories

[https://github.com/Raghav-Pal/Seleniu...](https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbFpKRDh6TzNGN203c05KTGIweWJ2LS1UYVBtZ3xBQ3Jtc0tsbkVGc0lhR1g5VkFqYzdDZnZJd0RtbmhZRmhwMkd5Q2N1NUtscEN1LXhPM2pZdXlrR1g2cFlGLTBoUWltdlE2X09RRF9hYjY2LWRUd2kya2JSbkRmR2M4QVFBbmdUaWRIdjczS0JRVUcxM002amgzcw&q=https%3A%2F%2Fgithub.com%2FRaghav-Pal%2FSeleniumCucumberBDD&v=4e9vhX7ZuCw)

[https://github.com/Raghav-Pal/Cucumbe...](https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbnhVblhzQlI1WnZfVlg2eDNncFZPZkY4VDFhd3xBQ3Jtc0ttWlk2STYyVWpTMUcwWFd5ZTQtRVRUTDQxQl9udW5ra09ULUxtS2pReUdfS3VkNXRHYTFPTVcxb2F5bXFYak1vOW1fX3JWeXJ6TUV0UXU3eXhWMklLTnh2NWZ1c2t5bi1MVkxwdU1OYW92ZDY2WHQyTQ&q=https%3A%2F%2Fgithub.com%2FRaghav-Pal%2FCucumberBDDCMD&v=4e9vhX7ZuCw)

## Session - 02

Link: https://www.youtube.com/watch?v=-fkMEj7wrAk

## Issues faced:

1. Cache files → The code of line has been deleted but still the line executes while running the test-cases.

Solution

1. So clean the cache and ran the test again
    
    `mvn clean install`
    
    ### **`mvn clean install` in a Maven Project**
    
    The command `mvn clean install` is commonly used in **Maven** projects to build and install the application. It performs two key actions:
    
    ### **1️⃣ `clean` Phase**
    
    - **Deletes** the `target/` directory (i.e., removes compiled `.class` files, previous builds, and reports).
    - Ensures a **fresh** build without old artifacts.
    
    ### **2️⃣ `install` Phase**
    
    - **Compiles** the Java code (`mvn compile`).
    - **Runs tests** (`mvn test`).
    - **Packages** the application (JAR/WAR) (`mvn package`).
    - **Installs** the built artifact (`.jar` or `.war`) into the local Maven repository (`~/.m2/repository`).
    - Other Maven projects can then **reuse** the installed artifact.
    
    ---
    
    ### **When to Use `mvn clean install`?**
    
    ✅ When making significant code changes and you want a fresh build.
    
    ✅ When dependencies are not resolving correctly.
    
    ✅ When testing before deploying to higher environments.
    
    ---
    
    ### **Example Usage**
    
    ```
    sh
    CopyEdit
    mvn clean install
    
    ```
    
    👉 **Result**: The project is cleaned, built, tested, packaged, and installed in the local Maven repository.
    
    ---
    
    ### **Alternative Commands**
    
    | Command | Description |
    | --- | --- |
    | `mvn clean` | Removes the `target/` directory only. |
    | `mvn install` | Builds and installs without cleaning previous builds. |
    | `mvn clean package` | Cleans and packages the application without installing it in the local repository. |

## Session - 03

Step 1 - Check the scenario/navigation
Step 2 - Create a feature file and add Scenario and Steps
Step 3 - Create Step Definition/Glue Code for the steps
Step 4 - Add Selenium WebDriver code
Step 5 - Run Feature file and check the execution
