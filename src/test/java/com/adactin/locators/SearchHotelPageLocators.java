package com.adactin.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPageLocators {
	
	public SearchHotelPageLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//@FindBys({ //&& both the @FindBy should be match with that particular WebElement
		       //*[@id='location' and @name='location'] like this
	//	@FindBy(id="location"),
	//	@FindBy(name="location")
	//})
	
	@FindBy(id="location")
	private WebElement location;
		
	@FindAll({ // It works either one condition is true(based on ||)
			   //*[@id='Submit' or @value='Search']
		@FindBy(id="Submit"),
		@FindBy(xpath="//*[@value='Search']")
	})
	private WebElement searchBtn;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
}
