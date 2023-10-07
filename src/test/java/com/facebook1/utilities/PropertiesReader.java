package com.facebook1.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	Properties prop;

	public PropertiesReader() {
		prop = new Properties();// prop job is load, fis navigates/traverse
		String propertyFile = "src/test/resources/test.properties";

		try {
			FileInputStream fis = new FileInputStream(propertyFile);
			prop.load(fis);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public String readBrowser() {
		return prop.getProperty("Browser");

	}

	public String getUrl() {
		return prop.getProperty("qaUrl");

	}

	public String getuserName() {
		return prop.getProperty("userName");

	}
	public String getPassword() {
		return prop.getProperty("password");
	}
	
	

	public static void main(String[] args) {
		PropertiesReader pr = new PropertiesReader();
		String browserName = pr.readBrowser();
		System.out.println("browserName");

	}
}
