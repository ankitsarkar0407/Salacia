package com.oxytech.testcases;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.oxytech.utilities.BaseClass;

public class ZoomInFeature extends BaseClass {

	@Test
	public void addToDocTest() throws InterruptedException, AWTException {
		login("sohail.shaikh@ascendtek.com", "sohail.shaikh@ascendtek.com");
		Thread.sleep(5000);
		
		WebElement zoomIn = driver.findElement(By.xpath("//button[contains(text(),'+')]"));
		for (int i = 0;i<3; i++) {
			zoomIn.click();
			Thread.sleep(2000);
		}
		
		for(int j = 0; j < 2; j++) {
			Thread.sleep(2000);
			robot = new Robot();
			robot.mouseMove(500, 500);
			robot.mousePress(0);
			robot.mouseMove(700, 500);
			robot.mouseMove(1500, 500);
			Thread.sleep(2000);
			robot.mouseRelease(0);
			
		}
		
		WebElement zoomOut = driver.findElement(By.xpath("//button[contains(text(),'-')]"));
		for (int i = 0;i<2; i++) {
			zoomOut.click();
			Thread.sleep(2000);
		}
		
		for (int i = 0;i<3; i++) {
			zoomIn.click();
			Thread.sleep(2000);
		}
		
		WebElement reset = driver.findElement(By.xpath("//button[contains(text(),'Reset')]"));
		reset.click();
		Thread.sleep(2000);
	}
	
		
	
}
