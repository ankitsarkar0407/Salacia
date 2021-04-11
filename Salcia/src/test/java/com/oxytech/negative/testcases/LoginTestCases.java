package com.oxytech.negative.testcases;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.oxytech.utilities.BaseClass;

public class LoginTestCases extends BaseClass {
	
	String expected = "Incorrect Value" ;
	
	@Test
	public void testCase1() throws InterruptedException {
		loginWithDifferentUsers("ankit@gmail.com", "psddsd");
		
	}
	
public void loginWithDifferentUsers(String user,String pwd) throws InterruptedException {
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@placeholder,'Email ID')]"));
		username.sendKeys(user);
		WebElement password = driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
		password.sendKeys(pwd);
		WebElement submit = driver.findElement(By.xpath("//button[contains(@class,'loginbtn')]"));
		submit.click();
		Thread.sleep(4000);
		
//		WebElement alert = driver.findElement(By.xpath("//div[@role='alert']"));
//		
//		String errMessage = alert.getText();
//		Assert.assertEquals(errMessage, expected);
		
		
				
	}

public void clickElement() {
	
	WebElement agent = driver.findElement(By.xpath("//div[@class='media profile-media']"));
	
	Actions act1 = new Actions(driver);	
	act1.moveToElement(agent).build().perform();
	
	
}



}
