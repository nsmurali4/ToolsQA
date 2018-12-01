package org.testng;

import org.testng.annotations.Test;

public class TestNG_Greens {

	@Test (groups="Sanity") 
	public void smoke() {
		System.out.println("smoke");
	}
	
	@Test
	public void sanity() {
		System.out.println("sanity");
	}
	
	@Test
	public void reg() {
		System.out.println("reg");
	}
	
	
}
