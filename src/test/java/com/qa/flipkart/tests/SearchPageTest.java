package com.qa.flipkart.tests;

import org.testng.annotations.Test;

import com.qa.flipkart.base.BaseTest;

public class SearchPageTest extends BaseTest {

	@Test
	public void selectProductTest() {
		searchPage = loginPage.searchProduct("Iphone 15 plus");
		searchPage.selectProduct("Apple iPhone 15 Plus (Blue, 128 GB)");

	}

}
