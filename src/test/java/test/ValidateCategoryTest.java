package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.ValidateCategoryPage;

import util.BrowserFactory;

public class ValidateCategoryTest {

	WebDriver driver;
	
	@Test
	public void validateUserShouldBeAbleToAddCategory() throws InterruptedException {
		driver = BrowserFactory.init();
		
		ValidateCategoryPage valdiateCategoryPage = PageFactory.initElements(driver, ValidateCategoryPage.class);
		valdiateCategoryPage.typeCategory("Jonathan's Category");
		valdiateCategoryPage.selectMonth("Jul");
		Thread.sleep(5000);
		valdiateCategoryPage.clickAddCategory();
		
		

	}
	
	
	
	
}
