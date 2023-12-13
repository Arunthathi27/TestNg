package pom.without.pagefactory;

import org.openqa.selenium.WebElement;

import com.base.utils.BaseClass;

public class LoginPage extends BaseClass{

//	LoginPageLocators lp = new LoginPageLocators();
	
	public static void login() {
		browserLaunch("chrome", "https://adactinhotelapp.com/");
		
		WebElement username = findElementAB(LoginPageLocators.user);
		username.sendKeys("Muthulakshmi07");
		WebElement pwd=findElementAB(LoginPageLocators.pwd);
		pwd.sendKeys("Test@123");
		WebElement login=findElementAB(LoginPageLocators.login);
		login.click();
		WebElement location=findElementAB(LoginPageLocators.location);
		selectByVisibleText(location,"Sydney");
		WebElement search1=findElementAB(LoginPageLocators.search1);
		search1.click();
		WebElement radio=findElementAB(LoginPageLocators.radio);
		radio.click();
		WebElement cont=findElementAB(LoginPageLocators.cont);
		cont.click();
		WebElement firstname=findElementAB(LoginPageLocators.firstname);
		firstname.sendKeys("arun");
		WebElement lastname=findElementAB(LoginPageLocators.lastname);
		lastname.sendKeys("thathi");
		WebElement addres=findElementAB(LoginPageLocators.addres);
		addres.sendKeys("maduravayol");
		WebElement num=findElementAB(LoginPageLocators.addres);
		num.sendKeys("12345678912346");
		WebElement type=findElementAB(LoginPageLocators.type);
		selectByIndex(type,1);
		WebElement month=findElementAB(LoginPageLocators.month);
		selectByVisibleText(month,"April");
		WebElement year=findElementAB(LoginPageLocators.year);
		selectByVisibleText(year,"2023");
		WebElement cvv=findElementAB(LoginPageLocators.cvv);
		cvv.sendKeys("123");
		WebElement book=findElementAB(LoginPageLocators.book);
		book.click();
		
		
		
		
		
		//username.sendKeys("Hello");
		
	}
}
