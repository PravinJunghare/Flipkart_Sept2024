package com.qa.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.flipkart.constants.AppConstant;

import com.qa.flipkart.utils.ElementUtil;

public class SearchPage {
	private WebDriver driver;
	private ElementUtil eleUtil;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

	public ProductInfoPage selectProduct(String productName) {

		By prodLocator = By.partialLinkText(productName);// dynamic locator
		eleUtil.waitForElementVisible(prodLocator, AppConstant.DEFAULT_MEDIUM_TIMEOUT).click();
		return new ProductInfoPage(driver);

	}
}
