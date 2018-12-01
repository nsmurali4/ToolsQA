package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ToolsQA_ProductPage extends ToolsQA_BasePage{

	 public ToolsQA_ProductPage (WebDriver driver){
		  super(driver);
		 }
		 
		 public Object selectProduct(){
		  
		  ToolsQA_ProductPage productpage = new ToolsQA_ProductPage(driver);
		  PageFactory.initElements(driver, productpage);
		  return productpage; 
		 } 

		}
	
