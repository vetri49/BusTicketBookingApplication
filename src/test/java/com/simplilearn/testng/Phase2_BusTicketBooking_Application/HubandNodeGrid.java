package com.simplilearn.testng.Phase2_BusTicketBooking_Application;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HubandNodeGrid {

	public static WebDriver driver;
	public  static void hubNodeChrome() throws MalformedURLException, InterruptedException {
		ChromeOptions co=new ChromeOptions();
		driver=new RemoteWebDriver(new URL("http://localhost:4449/wd/hub"),co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	public   void hubNodeFirefox() throws MalformedURLException, InterruptedException {
		FirefoxOptions fo=new FirefoxOptions();
		driver=new RemoteWebDriver(new URL("http://localhost:4449/wd/hub"),fo);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	
}
