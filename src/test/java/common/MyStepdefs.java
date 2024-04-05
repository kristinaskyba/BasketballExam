package common;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyStepdefs {
    WebDriver driver;



   /* @Given("I am on the registration page")
    public void iAmOnTheRegistrationPage() {
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");
    }

    @When("I fill in all required fields with valid information")
    public void iFillInAllRequiredFieldsWithValidInformation() throws InterruptedException {
        driver.findElement(By.id("dp")).click();
        driver.findElement(By.name("DateOfBirth")).sendKeys("17/10/1984");
        Thread.sleep(1000);
        driver.findElement(By.name("Forename")).click();
        driver.findElement(By.name("Forename")).sendKeys("MyName");
        Thread.sleep(1000);
        driver.findElement(By.name("Surname")).click();
        driver.findElement(By.name("Surname")).sendKeys("MyLastName");
        Thread.sleep(1000);
        driver.findElement(By.name("EmailAddress")).click();
        driver.findElement(By.name("EmailAddress")).sendKeys("111@gmail.com");
        driver.findElement(By.name("ConfirmEmailAddress")).click();
        driver.findElement(By.name("ConfirmEmailAddress")).sendKeys("111@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("Password")).sendKeys("12345");
        driver.findElement(By.name("ConfirmPassword")).click();
        driver.findElement(By.name("ConfirmPassword")).sendKeys("12345");
        Thread.sleep(1000);
    }

    @And("I accept the terms and conditions")
    public void iAcceptTheTermsAndConditions() throws InterruptedException {
        driver.findElement(By.cssSelector(".md-checkbox > .md-checkbox:nth-child(1) .box")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".md-checkbox:nth-child(2) > label > .box")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".md-checkbox:nth-child(7) .box")).click();

    }

    @And("I submit the registration form")
    public void iSubmitTheRegistrationForm() {
        driver.findElement(By.name("join")).click();

    }

    @Then("I should see a confirmation message")
    public void iShouldSeeAConfirmationMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'THANK YOU FOR CREATING AN ACCOUNT WITH BASKETBALL ENGLAND')]")));
    }

    @And("I should be redirected to the home page")
    public void iShouldBeRedirectedToTheHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.urlContains("SignUpConfirmation?beMembershipNumber"));
        driver.close();
    }
    @Given("I am on the registration page new")
    public void iAmOnTheRegistrationPageNew() {
    }

    @When("I fill in all required fields except for the last name")
    public void iFillInAllRequiredFieldsExceptForTheLastName() {

    }

    @Then("I should see an error message indicating that the last name is required")
    public void iShouldSeeAnErrorMessageIndicatingThatTheLastNameIsRequired() {
    }

    @And("I provide passwords that do not match")
    public void iProvidePasswordsThatDoNotMatch() {
    }

    @Then("I should see an error message indicating that the passwords do not match")
    public void iShouldSeeAnErrorMessageIndicatingThatThePasswordsDoNotMatch() {
    }

    @And("I do not accept the terms and conditions")
    public void iDoNotAcceptTheTermsAndConditions() {
    }

    @Then("I should see an error message indicating that the terms and conditions must be accepted")
    public void iShouldSeeAnErrorMessageIndicatingThatTheTermsAndConditionsMustBeAccepted() {
    }

*/
}
