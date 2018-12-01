package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsQA_LoginPage extends ToolsQA_BasePage {

	 @FindBy(id=ToolsQA_Constants.UserName)
	 public WebElement uname;
	 @FindBy(id=ToolsQA_Constants.Password)
	 public WebElement pword;
	 @FindBy(id=ToolsQA_Constants.Login)
	 public WebElement submit;
	 
	 public ToolsQA_LoginPage(WebDriver driver){
	  super(driver);
	 }
	  
	 public ToolsQA_ProductPage doLogin(String username, String password){
	 uname.sendKeys(username); 
	 pword.sendKeys(password);
	 submit.click();
	 ToolsQA_ProductPage productPage = new ToolsQA_ProductPage(driver);
	 PageFactory.initElements(driver, productPage);
	 return productPage;   
	   
	 }	  
}

