package com.oxytech.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;




public class BaseClass extends DataClass {
	
	
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public Robot robot;
	public static BaseClass base = new BaseClass();
	
	
	public void initializePageFactory() {
		
//		PageFactory.initElements(driver, ElementXpath.class);
//		PageFactory.initElements(driver, FlowPageXPath.class);
	}
	
	public void openBrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
              "C:\\Work\\chromedriver.exe");
     
				
		driver = new ChromeDriver();
        driver.get("http://d1jsw59hixcxec.cloudfront.net/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
        Thread.sleep(5000);
		
	}
	
	@BeforeClass
	public void browserInitialize() throws AWTException, InterruptedException, IOException {
//		initializeBrowser(BROWSER);
		openBrowser();
//		login();
		initializePageFactory();
		DataClass.data();
	}
	
	public void login() throws InterruptedException {
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@placeholder,'Email ID')]"));
		username.sendKeys("sohail.shaikh@ascendtek.com");
		WebElement password = driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
		password.sendKeys("sohail.shaikh@ascendtek.com");
		WebElement submit = driver.findElement(By.xpath("//button[contains(@class,'loginbtn')]"));
		submit.click();
		Thread.sleep(2000);
				
	}

	
	
	public void login(String user,String pwd) throws InterruptedException {
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@placeholder,'Email ID')]"));
		username.sendKeys(user);
		WebElement password = driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
		password.sendKeys(pwd);
		WebElement submit = driver.findElement(By.xpath("//button[contains(@class,'loginbtn')]"));
		submit.click();
		Thread.sleep(2000);
				
	}
	
	
	@AfterClass
	public void flush() {
		
		driver.quit();
	}

}
