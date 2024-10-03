package com.qa.flipkart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.flipkart.base.BaseTest;
import com.qa.flipkart.constants.AppConstant;

public class LoginPageTest extends BaseTest {

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String actTitle = loginPage.getLoginPageTitle();
		// Assert.assertEquals(actTitle, "Account Login");
		Assert.assertEquals(actTitle, AppConstant.LOGIN_PAGE_TITLE_VALUE);

	}

	@Test(priority = 2)
	public void loginPageUrlTest() {
		String actUrl = loginPage.getLoginUrl();
		// Assert.assertTrue(actUrl.contains("route=account/login"));
		Assert.assertTrue(actUrl.contains(AppConstant.LOGIN_PAGE_URL_FRACTION_VALUE));
	}

	/*@Test(priority = 3)
	public void loginPageImageTest() {
		int actcount = loginPage.getImageCount();

		Assert.assertEquals(actcount, 82);
	}*/

	@Test(priority = 4)
	public void searchProductTest() {
		loginPage.searchProduct("iphone 15 plus");

	}
}