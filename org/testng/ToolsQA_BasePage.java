package org.testng;

import org.openqa.selenium.WebDriver;

public class ToolsQA_BasePage {

		public WebDriver driver;
		
		public ToolsQA_BasePage() {} 
			
		public ToolsQA_BasePage(WebDriver driver) {
		this.driver=driver;
	
	}
}