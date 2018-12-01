package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Start {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@AfterClass
	public void afterClass() {
			System.out.println("afterClass");	
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");	
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");	
	}	
	
	@Test
	public void test3() {
		System.out.println("test3");	
	}	
	
	@Test
	public void test2() {
		System.out.println("test2");	
	}
	
	@Test
	public void test1() {
		System.out.println("test1");	
	}
	
  }

