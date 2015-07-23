package com.tab.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tab.qa.framework.core.Base;

public class TestClass extends Base{

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/
	
	@BeforeTest
	public void BeforeMethod() {
		System.out.println("@BeforeMethod");
	}

	@AfterTest
	public void AfterMethod() {
		System.out.println("@AfterMethod");
	}

	@Test
	public void TestMethod() {
		System.out.println("This is the service test method. Updated");
		Base.Print();
	}
}
