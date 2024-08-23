package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

import utilities.Page_utilities;

public class Search_User 
{
	WebDriver driver;
	public Search_User(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);		
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']")WebElement adminUserLink;	
	@FindBy(xpath="//a[@onclick='click_button(2)']")WebElement searchButton;
	@FindBy(xpath="//input[@id='un']")WebElement userNameField;
	@FindBy(xpath="//select[@id='ut']")WebElement userTypeField;
	@FindBy(xpath="//button[@class='btn btn-block-sm btn-danger']")WebElement searchSubmitButton;
	
	public void clickAdminLink()
	{
		adminUserLink.click();
	}
	
	public void clickSearchButton()
	{
		searchButton.click();
	}
	
	public void enterUserName(String userName)
	{
		userNameField.sendKeys(userName);
	}
	
	public void selectUserType(String userType)
	{
		Page_utilities page = new Page_utilities();
		page.selectionIndes(userTypeField, userType);
	}
	
	public void clickSearchSubmitButton()
	{
		searchSubmitButton.click();
	}
	public boolean isSearchResultfound()
	{
		return searchSubmitButton.isDisplayed();
	}
	
}
