package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Product 
{
	WebDriver driver;
	public Search_Product(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//i[@class='fas fa-arrow-circle-right']")WebElement managePagesLink;
	@FindBy(xpath="//a[@onclick='click_button(2)']")WebElement newSearchButton;
	@FindBy(xpath="//input[@class='form-control']")WebElement titleField;
	@FindBy(xpath="//button[@type='submit']")WebElement searchSubmitButton;
	public void clickManagePageLink()
	{
		managePagesLink.click();
	}
	public void clickNewSeachButton()
	{
		newSearchButton.click();
	}
	public void enterTitleField(String title)
	{
		titleField.sendKeys(title);
	}
	public void clickSearchSubmitButton()
	{
		searchSubmitButton.click();
	}
	public boolean isSearchSuccesfull()
	{
		return searchSubmitButton.isDisplayed();
	}
	

}
