package org.wordpress.tests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.wordpress.pages.LoginPage;
import org.wordpress.util.BrowserFactory;
import org.wordpress.util.ConfigReader;

public class CheckValidLogin {

	ConfigReader config=new ConfigReader();
	LoginPage page;
		
  @Test
  public void wordpresslogin() {
	  BrowserFactory browser=new BrowserFactory();
	  
	  WebDriver driver=browser.startBrowser("Chrome", config.getURL());
	  
	  page=new LoginPage(driver);
	  page.typeusername("admin");
	  page.typepassword("demo123");
	  page.clickloginbutton();
	  
	  String CurrentURL=driver.getCurrentUrl();
	  Assert.assertEquals("http://demosite.center/wordpress/wp-admin/", CurrentURL);
	  Reporter.log("Success Login", true);
	  driver.quit();
	  
  }
}
