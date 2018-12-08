package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ToolsQA_ProductPage extends ToolsQA_BasePage{

	 public ToolsQA_ProductPage (WebDriver driver){
		  super(driver);
		 }
	 
	 @FindBy(xpath=ToolsQA_Constants.prodCategory)
	 public WebElement select;
		 
	 public void selectProduct(WebElement element){
	 Actions act=new Actions(driver);
	 act.moveToElement(element);
	 select.click();
		  
			 
	 
	
	 } 

	 }
	
