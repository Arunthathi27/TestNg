package com.adactin.page;

import org.openqa.selenium.WebElement;

import com.adactin.locators.PageRepository;
import com.base.utils.BaseClass;

public class SearchHotelPage extends BaseClass{
	
	public static PageRepository pr = new PageRepository(driver);

	public static void searchHotel() {
		LoginPage.login();
		
		WebElement location = pr.getSearchHotel().getLocation();
		
		selectByVisibleText(location, "Sydney");
		
		click(pr.getSearchHotel().getSearchBtn());
	}
}
