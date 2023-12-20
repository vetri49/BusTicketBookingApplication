package com.simplilearn.testng.Phase2_BusTicketBooking_Application;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends HubandNodeGrid{
	@Test(priority=1)
	public void chromeTest() throws MalformedURLException, InterruptedException {
		hubNodeChrome();
		driver.get("https://www.redbus.in/");
		String expectedTitle ="Online Bus Ticket Booking with Best Offers and Lowest Price - redBus";
        String actualTitle = driver.getTitle();
        System.out.println(driver.getTitle());
        assertEquals(actualTitle, expectedTitle, "Page title is not as expected");
        Thread.sleep(3000);
        driver.close();
		
	}
	@Test(priority=2)
	public void fireFoxtest() throws MalformedURLException, InterruptedException {
		hubNodeFirefox();
		driver.get("https://www.redbus.in/");
		String expectedTitle = "Online Bus Ticket Booking with Best Offers and Lowest Price - redBus";
        String actualTitle = driver.getTitle();
        
        assertEquals(actualTitle, expectedTitle, "Page title is not as expected");
        Thread.sleep(3000);
        driver.quit();
	}

}
