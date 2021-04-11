package com.oxytech.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.oxytech.utilities.BaseClass;



public class LoginClass extends BaseClass {
	

	
	@Test
	public void realEstateBookAvailable() throws InterruptedException {
		login(username,passwrd );
		Thread.sleep(5000);
		
		
		
		WebElement menu = driver.findElement(By.xpath("//button[@title='Menu']"));
		menu.click();
		Thread.sleep(2000);
		
				
		WebElement lot_by_loc = driver.findElement(By.xpath("//a[contains(text(),'Lot By Location')]"));
		lot_by_loc.click();
		Thread.sleep(2000);
		
		
		
		WebElement ocean_front = driver.findElement(By.xpath("//span[contains(text(),'Ocean Front')]"));
		ocean_front.click();
		Thread.sleep(2000);
		
		WebElement plot = driver.findElement(By.xpath("//div//li//span[text()='"+plot_number+"']"));
		plot.click();
		Thread.sleep(2000);
		
		WebElement click_to_reserve = driver.findElement(By.xpath("//a[contains(text(),'Click to reserve')]"));
		click_to_reserve.click();
		Thread.sleep(2000);
		
	
		
	}
	
	@Test(dependsOnMethods="realEstateBookAvailable")
	public void addBuyesDetails() throws InterruptedException {
		
		WebElement add_buyer = driver.findElement(By.xpath("//a[contains(text(),'Add Buyer')]"));
		add_buyer.click();
		Thread.sleep(2000);
		
		WebElement first_name = driver.findElement(By.xpath("//input[contains(@placeholder,'First Name')]"));
		first_name.sendKeys(buyer_first_name);
		Thread.sleep(1000);
		
		WebElement last_name = driver.findElement(By.xpath("//input[contains(@placeholder,'Last Name')]"));
		last_name.sendKeys(buyer_last_name);
		Thread.sleep(500);
		
		WebElement email = driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]"));
		email.sendKeys(buyer_email);
		Thread.sleep(500);
		
		WebElement phone = driver.findElement(By.xpath("//input[contains(@placeholder,'Phone')]"));
		phone.sendKeys(phone_number.toString());
		Thread.sleep(500);
		

		WebElement street = driver.findElement(By.xpath("//input[contains(@placeholder,'Street')]"));
		street.sendKeys("SMDT");
		Thread.sleep(500);
		
		WebElement city = driver.findElement(By.xpath("//input[contains(@placeholder,'City')]"));
		city.sendKeys("Pune");
		Thread.sleep(500);
		
		WebElement state = driver.findElement(By.xpath("//input[contains(@placeholder,'State or Province')]"));
		state.sendKeys("Maharashtra");
		Thread.sleep(500);
		
		WebElement zip = driver.findElement(By.xpath("//input[contains(@placeholder,'Zip Code')]"));
		zip.sendKeys("411041");
		Thread.sleep(500);
		
		WebElement country = driver.findElement(By.xpath("//input[contains(@placeholder,'Country')]"));
		country.sendKeys("India");
		Thread.sleep(500);
		
		WebElement submit = driver.findElement(By.xpath("//button[contains(@class,'loginbtn btn btn- btn-block')]"));
		submit.click();
		Thread.sleep(3000);
		

		WebElement alt= driver.findElement(By.xpath("//button[contains(@class,'Toastify__close-button Toastify__close-button--success')]"));
		alt.click();
		
		
		
	}
	
	@Test(dependsOnMethods="addBuyesDetails")
	public void clientDetails() throws InterruptedException {
		
	WebElement T= driver.findElement(By.xpath("//div[@class='media profile-media']"));
	Actions act= new Actions(driver);
	act.moveToElement(T).build().perform();
	
	Thread.sleep(1000);
	WebElement addc = driver.findElement(By.xpath("//span[text()='Add Client']"));
	addc.click();
	Thread.sleep(500);
	
	WebElement first_name = driver.findElement(By.xpath("//input[contains(@placeholder,'First Name')]"));
	first_name.sendKeys("sajjad 1");
	Thread.sleep(1000);
	
	WebElement last_name = driver.findElement(By.xpath("//input[contains(@placeholder,'Last Name')]"));
	last_name.sendKeys("Test Automation");
	Thread.sleep(500);
	
	WebElement email = driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]"));
	email.sendKeys("sajjadhusainkhan78@gmail.com");
	Thread.sleep(500);
	
	WebElement phone = driver.findElement(By.xpath("//input[contains(@placeholder,'Phone')]"));
	phone.sendKeys("12440984744");
	Thread.sleep(500);
	
	
	WebElement street = driver.findElement(By.xpath("//input[contains(@placeholder,'Street')]"));
	street.sendKeys("SMDT");
	Thread.sleep(500);
	
	WebElement city = driver.findElement(By.xpath("//input[contains(@placeholder,'City')]"));
	city.sendKeys("Pune");
	Thread.sleep(500);
	
	WebElement state = driver.findElement(By.xpath("//input[contains(@placeholder,'State or Province')]"));
	state.sendKeys("Maharashtra");
//	Thread.sleep(500);
	
	WebElement zip = driver.findElement(By.xpath("//input[contains(@placeholder,'Zip Code')]"));
	zip.sendKeys("411041");
	Thread.sleep(500);
	
	WebElement country = driver.findElement(By.xpath("//input[contains(@placeholder,'Country')]"));
	country.sendKeys("India");
	Thread.sleep(500);
	
	WebElement submit = driver.findElement(By.xpath("//button[contains(@class,'loginbtn btn btn- btn-block')]"));
	submit.click();
	Thread.sleep(3000);
	WebElement alt= driver.findElement(By.xpath("//button[contains(@class,'Toastify__close-button Toastify__close-button--success')]"));
	alt.click();
	
	
	}
}


	
	
