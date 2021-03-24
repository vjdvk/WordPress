package org.wordpress.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	Properties prop;

	public ConfigReader() {
		// TODO Auto-generated constructor stub
		
		try {
			File src=new File("./Configuration/config.property");
			
			FileInputStream fis=new FileInputStream(src);
			
			prop=new Properties();
			
			prop.load(fis);
			
		} catch (Exception e) {	
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println(e.getMessage());
		}
	}
	
	public String getchromepath() {
		String path=prop.getProperty("chromeDriver");
		return path;
	}
	
	public String getURL() {
		return prop.getProperty("URL");
	}

	
}
