package com.simplilearn.testng.Phase2_BusTicketBooking_Application;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchTest extends HubandNodeGrid{
	@Test(priority=2)
	public void chromeTest() throws InterruptedException, MalformedURLException {
       hubNodeChrome();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement fromTextBox = driver.findElement(By.id("src"));
        fromTextBox.sendKeys("Chennai"); // Replace "Origin" with the actual source
        WebElement toTextBox = driver.findElement(By.id("dest"));
        toTextBox.sendKeys("Dharmapuri"); // Replace "Destination" with the actual destination
        Thread.sleep(1000);
        WebElement dateField = driver.findElement(By.id("onwardCal"));
        dateField.click();

        // Select desired date - Replace "desired_date" with the actual date you want to select
        String desiredDate = "25";
        List<WebElement> dateElements = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//td"));
        for (WebElement dateElement : dateElements) {
            if (dateElement.getText().equals(desiredDate)) {
                dateElement.click();
                break;
            }
        }
        WebElement searchButton = driver.findElement(By.id("search_button"));
        searchButton.click();

     
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement searchResultsTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Search Results')]")));
        assertTrue(searchResultsTitle.isDisplayed(), "Search results page not displayed");
        Thread.sleep(3000);
		driver.quit();
	}
	@Test(priority=1)
	public void fireFoxTest() throws InterruptedException, MalformedURLException {
		hubNodeFirefox();
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		WebElement fromTextBox = driver.findElement(By.id("src"));
        fromTextBox.sendKeys("Chennai"); // Replace "Origin" with the actual source
        WebElement toTextBox = driver.findElement(By.id("dest"));
        toTextBox.sendKeys("Dharmapuri"); // Replace "Destination" with the actual destination
        Thread.sleep(1000);
        WebElement dateField = driver.findElement(By.id("onwardCal"));
        dateField.click();

        // Select desired date - Replace "desired_date" with the actual date you want to select
        String desiredDate = "25";
        List<WebElement> dateElements = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//td"));
        for (WebElement dateElement : dateElements) {
            if (dateElement.getText().equals(desiredDate)) {
                dateElement.click();
                break;
            }
        }
        WebElement searchButton = driver.findElement(By.id("search_button"));
        searchButton.click();

       
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement searchResultsTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Search Results')]")));
        Assert.assertTrue(searchResultsTitle.isDisplayed(), "Search results page not displayed");
        Thread.sleep(3000);
		driver.quit();
	}

	
}
