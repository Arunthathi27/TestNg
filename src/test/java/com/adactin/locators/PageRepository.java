package com.adactin.locators;

import org.openqa.selenium.WebDriver;

import com.base.utils.BaseClass;

public class PageRepository extends BaseClass{

	private LoginPageLocators login;
	private SearchHotelPageLocators searchHotel;
	
	public LoginPageLocators getLogin() {
		login = new LoginPageLocators(driver);
		return login;
		
	}
	
	public SearchHotelPageLocators getSearchHotel() {
		searchHotel = new SearchHotelPageLocators(driver);
		return searchHotel;
	}
	
	public PageRepository(WebDriver prDriver) {
		this.driver = prDriver;
	}
}
