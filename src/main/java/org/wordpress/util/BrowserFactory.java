package org.wordpress.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	WebDriver driver;
	
	ConfigReader config=new ConfigReader();
	
	public WebDriver startBrowser(String browserName, String url) {
		
		if(browserName.equalsIgnoreCase("Chrome")) {
							
			System.setProperty("webdriver.chrome.driver", config.getchromepath());
			driver=new ChromeDriver();
						
		}
		
		else if(browserName.equalsIgnoreCase("Firefox")) {
			
			System.setProperty("webdriver.getco.driver", config.getchromepath());
			driver=new FirefoxDriver();
			}
		
			driver.manage().window().maximize();
			driver.get(url);

			return driver;
	}
}
