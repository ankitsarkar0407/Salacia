package com.oxytech.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.oxytech.utilities.BaseClass;

public class ViewPropertyMap extends BaseClass {
	
	//String plot_number = "302" ;
	
	
	@Test
	public void View() throws InterruptedException {
		
		Thread.sleep(3000);
		//login("sohail.shaikh@ascendtek.com","sohail.shaikh@ascendtek.com");
		//Thread.sleep(5000);
		WebElement Viewp = driver.findElement(By.linkText("View Property Map"));
		Viewp.click();
		Thread.sleep(5000);
		

		WebElement code = driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Your Code')]"));
		code.sendKeys("1917837");
		Thread.sleep(5000);
		

		WebElement submit = driver.findElement(By.xpath("(//button[@class = 'btn loginbtn'])[1]"));
		submit.click();
		//Thread.sleep(3000);
		
		Thread.sleep(5000);
}
	
}
