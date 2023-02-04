package com.banking.testcases;



import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;



//import org.apache.log4j.PropertyConfigurator;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Parameters;


import com.banking.utilites.ReadConfig;




public class BaseClass {
	

	ReadConfig readconfig=new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUserName();
	public String password=readconfig.getPassword();
	public static WebDriver driver;


	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {  
		
		

		if (br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		options.addArguments("start-maximized");
		driver=new ChromeDriver(options);
		}
		else	if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxpath());
			driver=new FirefoxDriver();
			}
		
		else if (br.equals("edge")) {
			System.setProperty("webdriver.msedge.driver",readconfig.getEdgepath());
			driver=new EdgeDriver();
			}
		
	


	
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get(baseURL);
	
	
		
	}
	
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
	@AfterTest
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		//System.out.println("Screenshot taken");
	}
	public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}

}
