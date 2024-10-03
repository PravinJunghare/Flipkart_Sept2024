package com.qa.flipkart.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.flipkart.constants.AppConstant;
import com.qa.flipkart.utils.ElementUtil;

public class ProductInfoPage {
	private WebDriver driver;
	private ElementUtil eleUtil;

	private By buyNowBtn = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button");
	private By addToCartBtn = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button");
	private By productname = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div[1]/h1/span");
	private By placeOrder = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/form/button");

	public ProductInfoPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	public String getProductName() {
		String productName = eleUtil.doElementGetText(productname);
		return productName;
	}
	public void addtoCart() {

		/*Set<String> handels = driver.getWindowHandles();
		Iterator<String> it = handels.iterator();

		String parwindow = it.next();
		System.out.println(parwindow);

		String child = it.next();
		driver.switchTo().window(child);
*/
		eleUtil.switchToWindow();
		eleUtil.doActionsCick(addToCartBtn);
		System.out.println("************");
		
		// driver.switchTo().window(parwindow);

		eleUtil.waitForElementVisible(placeOrder, AppConstant.DEFAULT_LONG_TIMEOUT).click();

	}
	
	public void buyProduct()
	{
		addtoCart();
		eleUtil.waitForElementVisible(placeOrder, AppConstant.DEFAULT_LONG_TIMEOUT).click();
	}



}
