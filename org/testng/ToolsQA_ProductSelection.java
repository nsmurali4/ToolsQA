package org.testng;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

	public class ToolsQA_ProductSelection extends ToolsQA_BaseTestCase {
		 
		 public ToolsQA_ProductSelection() throws InterruptedException {
		  super(); 
		 }
		 
		 @Test
		  public void doLogin() throws InterruptedException{
			  
			  init(ToolsQA_Constants.browserType);
			  
			  ToolsQA_LaunchPage launchPage =new ToolsQA_LaunchPage(driver);
			  PageFactory.initElements(driver, launchPage);
			  
			  ToolsQA_HomePage loginPage = launchPage.gotohomePage(); 
			  Object page=loginPage.myAccount();
			  
			  ToolsQA_LoginPage productpage = (ToolsQA_LoginPage)page;
			  page=productpage.doLogin("Murali.N", "store.demoqa.com");
			  
			  ToolsQA_ProductPage pp = productpage.
			  Object page1=pp.
			  
			     
			 } 
			} 


