package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class MyStepdefsRegister {
    WebDriver driver;


    private WebElement waitForElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    @Given("User is on the registration page")
    public void userIsOnTheRegistrationPage() {
        driver = new ChromeDriver();
       // driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");
    }

    @When("User enters {string} of birth")
    public void userEntersOfBirth(String date) {
        driver.findElement(By.cssSelector("input#dp")).click();
        driver.findElement(By.name("DateOfBirth")).sendKeys(date);
        waitForElementToBeClickable(By.cssSelector("input#member_firstname")).click();
    }

    @When("User enters {string} and {string}")
    public void userEntersAndAnd(String name, String lasName) {
        driver.findElement(By.cssSelector("input#member_firstname")).sendKeys(name);
        driver.findElement(By.name("Surname")).sendKeys(lasName);

    }

    @When("User enters mail {string} and {string}")
    public void userEntersMailAnd(String mail, String confirmMail) {
        driver.findElement(By.name("EmailAddress")).sendKeys(mail);
        driver.findElement(By.name("ConfirmEmailAddress")).sendKeys(confirmMail);

    }

    @When("User enters password {string} and {string}")
    public void userEntersPasswordAnd(String password, String confirmPassword) {
        driver.findElement(By.name("Password")).sendKeys(password);
        driver.findElement(By.name("ConfirmPassword")).sendKeys(confirmPassword);
    }

    @When("User accepts therms {string}, {string}, and {string}")
    public void userAcceptsThermsAnd(String termsStr, String ageStr, String ethicsStr) {
        boolean terms = Boolean.parseBoolean(termsStr);
        boolean age = Boolean.parseBoolean(ageStr);
        boolean ethics = Boolean.parseBoolean(ethicsStr);
        if (terms) {
            WebElement termsCheckbox = waitForElementToBeClickable(By.id("sign_up_25"));
            if (termsCheckbox.isSelected()) {
                termsCheckbox.click();
            }
            boolean isSelected = termsCheckbox.isSelected();
            if (!isSelected) {
                // Handle the case where the checkbox still isn't checked as expected
                System.out.println("Checkbox is not selected after interaction.");
                // Consider retrying the interaction or logging this issue.
            }
        }
        if (age) {
            WebElement ageCheckbox = waitForElementToBeClickable(By.id("sign_up_26"));
            if (! ageCheckbox.isSelected()) {
                ageCheckbox.click();
            }
        }

        if (ethics) {
            WebElement ethicsCheckbox = waitForElementToBeClickable(By.cssSelector("[for='fanmembersignup_agreetocodeofethicsandconduct']"));
            if (! ethicsCheckbox.isSelected()) {
                ethicsCheckbox.click();
            }
        }
    }

    @And("User sees the registration success message")
    public void userSeesTheRegistrationSuccessMessage() {
        String expected = String.valueOf(driver.findElement(By.cssSelector(".bold.gray.margin-bottom-40.text-center")).getText());
        String actual = "THANK YOU FOR CREATING AN ACCOUNT WITH BASKETBALL ENGLAND";
        Assert.assertEquals(expected, actual);
    }





}
