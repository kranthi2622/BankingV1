package com.banking.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;

	public ReadConfig() {
		File src=new File("./configuration/data.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			
			prop=new Properties();
			try {
				prop.load(fis);
			} catch (IOException e) {
		System.out.println("Exception is "+e.getMessage());
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	//to read and return value of the baseURL
	public String getApplicationURL() {
		String url=prop.getProperty("baseURL");
		return url;
	}
	
	public String getUserName() {
		String username=prop.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String password=prop.getProperty("password");
		return password;
	}
	
	public String getChromepath() {
		String chromepath=prop.getProperty("chromepath");
		return chromepath;
	}
	
	public String getEdgepath() {
		String edgepath=prop.getProperty("edgepath");
		return edgepath;
	}

	public String getFirefoxpath() {
		String firefoxpath=prop.getProperty("firefoxpath");
		return firefoxpath;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
