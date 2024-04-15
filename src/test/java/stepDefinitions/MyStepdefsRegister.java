package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class MyStepdefsRegister {
    WebDriver driver;
    WebDriverWait wait;

    @After
    public void afterTest() {
        driver.close();
    }

    @Given("User is on the registration page using {string}")
    public void userIsOnTheRegistrationPageUsing(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        }
        driver.manage().window().maximize();
        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");
    }

    @When("User enters {string} of birth")
    public void userEntersOfBirth(String date) {
        driver.findElement(By.cssSelector("input#dp")).click();
        driver.findElement(By.name("DateOfBirth")).sendKeys(date);
        driver.findElement(By.cssSelector("input#member_firstname")).click();
    }

    @When("User enters {string} and {string}")
    public void userEntersAndAnd(String name, String lasName) throws InterruptedException {
        driver.findElement(By.cssSelector("input#member_firstname")).sendKeys(name);
        driver.findElement(By.name("Surname")).sendKeys(lasName);
        Thread.sleep(1000);

    }

    @When("User enters mail {string} and {string}")
    public void userEntersMailAnd(String mail, String confirmMail) throws InterruptedException {
        Random random = new Random();
        String randomInt = String.valueOf(random.nextInt(2500));
        String randomEmail = randomInt + mail;
        String randomConfirmEmail = randomInt + confirmMail;
        driver.findElement(By.name("EmailAddress")).sendKeys(randomEmail);
        driver.findElement(By.name("ConfirmEmailAddress")).sendKeys(randomConfirmEmail);
        Thread.sleep(1000);
    }

    @When("User enters password {string} and {string}")
    public void userEntersPasswordAnd(String password, String confirmPassword) throws InterruptedException {
        driver.findElement(By.name("Password")).sendKeys(password);
        driver.findElement(By.name("ConfirmPassword")).sendKeys(confirmPassword);
        driver.findElement(By.name("ConfirmPassword")).click();
        driver.findElement(By.cssSelector("div:nth-of-type(9) .caption")).click();
        Thread.sleep(1000);
    }

    @When("User accepts therms {string}, {string}, and {string}")
    public void userAcceptsThermsAnd(String termsStr, String ageStr, String ethicsStr) {


        boolean terms = Boolean.parseBoolean(termsStr);
        boolean age = Boolean.parseBoolean(ageStr);
        boolean ethics = Boolean.parseBoolean(ethicsStr);

        if (terms) {
            WebElement termBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for" +
                    "='sign_up_25']")));
            termBox.click();
        }

        if (age) {
            WebElement ageCheckbox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for" +
                    "='sign_up_26']")));
            ageCheckbox.click();
        }

        if (ethics) {
            WebElement ethicsCheckbox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[for" +
                    "='fanmembersignup_agreetocodeofethicsandconduct" +
                    "']")));
            ethicsCheckbox.click();

        }
    }

    @When("User clicks submit button")
    public void userClicksSubmitButton() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='join']"))).click();
        Thread.sleep(1000);
    }

    @Then("User sees the message {string}")
    public void userSeesTheMessage(String expectedMessage) {
        WebElement messageElement = null;
        System.out.println(expectedMessage);
        if (expectedMessage.equalsIgnoreCase("THANK YOU FOR CREATING AN ACCOUNT WITH BASKETBALL ENGLAND")) {
            messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='bold  gray  text-center  margin-bottom-40']")));
            messageElement.getText();
        } else if (expectedMessage.equalsIgnoreCase("First Name is required")) {
            messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-valmsg-for='Forename']")));
            messageElement.getText();
        } else if (expectedMessage.equalsIgnoreCase("Password did not match")) {
            messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-valmsg" +
                    "-for] [for]")));
            messageElement.getText();
        } else if (expectedMessage.equalsIgnoreCase("You must confirm that you have read and accepted our Terms and " +
                "Conditions")) {
            messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[for" +
                    "='TermsAccept']")));
            messageElement.getText();
        }
        if (messageElement != null) {
            String actualMessage = messageElement.getText();
            assertTrue("The expected message was not found. Found: " + actualMessage, actualMessage.contains(expectedMessage));
        } else {
            fail("Message element was not found.");
        }
    }
}
