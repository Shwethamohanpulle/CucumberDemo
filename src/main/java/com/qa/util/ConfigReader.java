package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties prop;
	
	
	
	
	/**
	 * This method is used to load the properties from config.properties file
	 * @return it returns Properties prop object
	 */
	public Properties initializeProp() {
		prop = new Properties();
		try {
			FileInputStream fis =  new FileInputStream("./src/test/resources/config/config.Properties");
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
	

}
