package com.qa.flipkart.pages;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.flipkart.constants.AppConstant;
import com.qa.flipkart.utils.ElementUtil;

public class LoginPage {
	
	// private Webdriver
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	//private loctors
	private By  search=By.xpath("//input[@title='Search for Products, Brands and More']");
	private By searchBtn=By.xpath("//button[@type='submit']");
	private By cart =By.xpath("//a[@href='/viewcart?exploreMode=true&preference=FLIPKART']/span");
	private By loginbtn=By.xpath("//*[contains(text(),'Login')]");
	private By becameSellerIcon=By.xpath("//a[@title=\"Become a Seller\"]");
	private By productImages=By.tagName("img");
	
	// constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

	
 // public action
	
	
	
	public String getLoginPageTitle()
	{
		String title=eleUtil.waitForTitleContainsAndFetch(AppConstant.DEFAULT_MEDIUM_TIMEOUT, AppConstant.LOGIN_PAGE_TITLE_VALUE);
		return title;
	}
	
	
	public String getLoginUrl() {
		// String url = driver.getCurrentUrl();
		// String url = eleUtil.waitForURLContainsAndFetch(10, "route=account/login");
		String url = eleUtil.waitForURLContainsAndFetch(AppConstant.DEFAULT_MEDIUM_TIMEOUT, AppConstant.LOGIN_PAGE_URL_FRACTION_VALUE);
		return url;
	}
	
	public int getImageCount() {

		int imageCount = eleUtil.getTotalElementsCount(productImages);
		System.out.println("ProdcutImages :" + imageCount);
		return imageCount;
	}	
	public boolean isLoginBtnExits() {
		return eleUtil.waitForElementVisible(loginbtn, AppConstant.DEFAULT_MEDIUM_TIMEOUT).isDisplayed();

	}
	
	public SearchPage searchProduct(String productName)
	{
		eleUtil.waitForElementVisible(search, AppConstant.DEFAULT_MEDIUM_TIMEOUT).sendKeys(productName);
		eleUtil.doClick(searchBtn);
		return new SearchPage(driver);
	}
}
