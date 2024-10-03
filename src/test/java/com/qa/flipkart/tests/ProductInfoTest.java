package com.qa.flipkart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.flipkart.base.BaseTest;

public class ProductInfoTest extends BaseTest {
	@Test
	public void VerifyProductNameTest() {
		searchPage = loginPage.searchProduct("Iphone 15 plus");
		productInfoPage = searchPage.selectProduct("Apple iPhone 15 Plus (Blue, 128 GB");
		// String actProductName = productInfoPage.getProductName();
		// Assert.assertEquals(actProductName, "Apple iPhone 15 Plus (Blue, 128 GB");

	}

	@Test
	public void addToCartTest() {
		searchPage = loginPage.searchProduct("Iphone 15 plus");
		productInfoPage = searchPage.selectProduct("Apple iPhone 15 Plus (Blue, 128 GB");
		productInfoPage.addtoCart();
	}

	@Test
	public void buyProductTest() {
		searchPage = loginPage.searchProduct("Iphone 15 plus");
		productInfoPage = searchPage.selectProduct("Apple iPhone 15 Plus (Blue, 128 GB");
		productInfoPage.buyProduct();
	}
}
