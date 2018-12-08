package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQA_BaseTestCase {

	public WebDriver driver;

	public void init(String browserType) throws InterruptedException {
		
		if (browserType == "Chrome") {
			
			System.setProperty("webdriver.chrome.driver", ToolsQA_Constants.ChromeDriver_Path);
			driver = new ChromeDriver(); 
			driver.get(ToolsQA_Constants.urlQA);
			}
			}
}