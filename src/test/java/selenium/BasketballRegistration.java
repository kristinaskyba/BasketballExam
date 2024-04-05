package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasketballRegistration {
    @Test

    public void testGoogleSearch() throws InterruptedException {
      /*  WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");
        Thread.sleep(2000);
        driver.findElement(By.id("dp")).click();
        driver.findElement(By.name("DateOfBirth")).sendKeys("17/10/1984");
        Thread.sleep(1000);
        driver.findElement(By.name("Forename")).click();
        driver.findElement(By.name("Forename")).sendKeys("Kristina");
        driver.findElement(By.name("Surname")).click();
        driver.findElement(By.name("Surname")).sendKeys("Nilsson");
        Thread.sleep(1000);
        driver.findElement(By.name("EmailAddress")).click();
        driver.findElement(By.name("EmailAddress")).sendKeys("ggg@gmail.com");
        driver.findElement(By.name("ConfirmEmailAddress")).click();
        driver.findElement(By.name("ConfirmEmailAddress")).sendKeys("ggg@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("Password")).sendKeys("12345");
        driver.findElement(By.name("ConfirmPassword")).click();
        driver.findElement(By.name("ConfirmPassword")).sendKeys("12345");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".md-checkbox > .md-checkbox:nth-child(1) .box")).click();
        driver.findElement(By.cssSelector(".md-checkbox:nth-child(2) > label > .box")).click();
        driver.findElement(By.cssSelector(".md-checkbox:nth-child(7) .box")).click();
        driver.findElement(By.name("join")).click();
        Thread.sleep(2000);
*/

        //https://membership.basketballengland.co.uk/Account/SignUpConfirmation?beMembershipNumber=A105063&privilegeLevelId=2&memberTypeId=1
//THANK YOU FOR CREATING AN ACCOUNT WITH BASKETBALL ENGLAND
        ///html/body/div/div[2]/div/div/div[2]/a
      /*  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement searchDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cdx-menu__listbox")));
        Thread.sleep(2000);
        List<WebElement> choices = searchDropdown.findElements(By.tagName("li"));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfAllElements(choices));
        choices.get(2).click();
        String findWord = driver.getTitle();
        System.out.println(findWord);
        String text = "Van Gogh's family in his art - Wikipedia";
        Assert.assertEquals(text, findWord);
        System.out.println(text);*/
        //driver.quit();
    }
}
