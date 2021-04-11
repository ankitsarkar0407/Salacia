package com.oxytech.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.oxytech.utilities.BaseClass;

public class AddToDoc extends BaseClass {
	
	
	
	@Test
	public void addToDocTest() throws InterruptedException {
		
		login(username,passwrd );
		Thread.sleep(5000);
		WebElement available_label = driver.findElement(By.xpath("//div//h5[contains(@class,'dropdown')]"));
		available_label.click();
		Thread.sleep(2000);
		
		WebElement ocean_front = driver.findElement(By.xpath("//span[contains(text(),'Ocean Front')]"));
		ocean_front.click();
		Thread.sleep(2000);
		
		WebElement plot = driver.findElement(By.xpath("//div//li//span[text()='"+plot_number+"']"));
		plot.click();
		Thread.sleep(2000);
		
		WebElement click_to_reserve = driver.findElement(By.xpath("//a[contains(text(),'Click to reserve')]"));
		click_to_reserve.click();
		Thread.sleep(3000);
		
		WebElement add_to_doc = driver.findElement(By.xpath("(//button[@class = ' btn loginbtn'])[1]"));
		add_to_doc.click();
		Thread.sleep(3000);
		
		WebElement price = driver.findElement(By.xpath("//input[@class='form-control']"));
		price.clear();
		Thread.sleep(1000);
		price.sendKeys("50000");
		
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("//button[@class='btn loginbtn' and text()='Submit']"));
		submit.click();
		Thread.sleep(1000);
		
		
	
	}

}
