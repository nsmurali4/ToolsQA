package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsQA_HomePage extends ToolsQA_BasePage{
	
	@FindBy(xpath=ToolsQA_Constants.myAccount)
	public WebElement Account;
	
	public ToolsQA_HomePage(WebDriver driver) {
		super(driver);
}
		
	public Object myAccount() throws InterruptedException {
		Thread.sleep(3000);
		Account.click();
	
		ToolsQA_LoginPage loginpage = new ToolsQA_LoginPage(driver);
		PageFactory.initElements(driver, loginpage);
		return loginpage;  
		 
	}
}
