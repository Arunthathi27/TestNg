package com.junit.assertion;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.base.utils.BaseClass;

public class AssertionSample extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		browserLaunch("chrome", "https://www.amazon.in/");
		
		//assertEquals
		
		String testData = "Drone";
		
		WebElement searchBox = findElementByXpath("//*[@id='twotabsearchtextbox']");
		searchBox.sendKeys(testData);
		
		Thread.sleep(3000);
		
		String searchValue = searchBox.getAttribute("value");
		
		//String searchValue = "laptop";
		assertEquals(testData, searchValue);
		
		System.out.println("done");
		System.out.println("a");
		
		//assertTrue
		//WebElement amazonLogo = findElementByXpath("//a[@aria-label='Amazon.in']");
		//boolean logo = amazonLogo.isDisplayed();
		//boolean logo = false;
		//assertTrue(logo);
		
		//System.out.println("Test passed");
//		if(logo) {
//			System.out.println("Amazon Logo displayed");
//		}else 
//			System.out.println("Amazon Logo isn't displayed");
//	}
	}
}
