
package com.qa.flipkart.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.qa.filpkart.factory.DriverFactory;
import com.qa.flipkart.pages.LoginPage;
import com.qa.flipkart.pages.ProductInfoPage;
import com.qa.flipkart.pages.SearchPage;

public class BaseTest {
	DriverFactory df;
	WebDriver driver;
	protected Properties prop;
	protected LoginPage loginPage;
	protected SearchPage searchPage;
	protected ProductInfoPage productInfoPage;
	protected SoftAssert softAssert;

	@BeforeTest
	public void setUp() {
		df = new DriverFactory();
		prop = df.initProp();
		// driver = df.initDriver("chrome");
		driver = df.initDriver(prop);
		loginPage = new LoginPage(driver);
		searchPage = new SearchPage(driver);
		productInfoPage= new ProductInfoPage(driver);

		softAssert = new SoftAssert();

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
