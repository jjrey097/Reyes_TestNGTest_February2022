package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidateCategoryPage extends BasePage{
	WebDriver driver;
	
	public ValidateCategoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@FindBy(how = How.XPATH, using = "//input[@name='categorydata']")WebElement CATEGORY_LINE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='Add category']")WebElement ADD_CATEGORY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@name='due_month']")WebElement MONTH_DROPDOWN_ELEMENT;
	
	
	public void typeCategory(String fullname) {
		int genNum = generateRandomNo(999);
		CATEGORY_LINE_ELEMENT.sendKeys(fullname + genNum);
	}
	
	public void clickAddCategory() {
		ADD_CATEGORY_ELEMENT.click();
	}
	
	public void selectMonth(String month) {
		selectFromDropdown(MONTH_DROPDOWN_ELEMENT, month);
	}
	

	
	
	
	
	
	
	
}
