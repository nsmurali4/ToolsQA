package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ToolsQA_LaunchPage extends ToolsQA_BasePage{
	
		
		public ToolsQA_LaunchPage(WebDriver driver) {
		super(driver);
}
			
	public ToolsQA_HomePage gotohomePage() {
		driver.get(ToolsQA_Constants.urlQA);
		
		ToolsQA_HomePage homepage = new ToolsQA_HomePage(driver);
		PageFactory.initElements(driver, homepage);
		return homepage;     
	}
}
