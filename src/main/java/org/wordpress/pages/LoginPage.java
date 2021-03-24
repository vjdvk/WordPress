	package org.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By username=By.id("user_login");
	By password=By.id("user_pass");
	By Login_Button=By.xpath("//input[@id='wp-submit']");
	By Check_box=By.id("rememberme");

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void typeusername(String userid) {
		driver.findElement(username).sendKeys(userid);
	}
	public void typepassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void clickloginbutton() {
		driver.findElement(Login_Button).click();
	}
}
