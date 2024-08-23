package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Page_utilities;

public class Admin_User 
{
	WebDriver driver;
	public Admin_User(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']//i[@class='fas fa-arrow-circle-right']")WebElement adminUserLink;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newAdminUser;
	@FindBy(xpath="//input[@id='username']")WebElement newUserNameField;
	@FindBy(xpath="//input[@id='password']")WebElement newPasswordField;
	@FindBy(xpath="//select[@id='user_type']")WebElement newUserTypeField;
	@FindBy(xpath="//button[@name='Create']")WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	
	public void clickAdminUserLink()
	{
		adminUserLink.click();
	}
	
	public void clickNewAdminUser()
	{
		newAdminUser.click();
	}
	
	public void enterNewUserName(String newUserName)
	{
		newUserNameField.sendKeys(newUserName);
	}
	
	public void EnterNewPassword(String newPassword)
	{
		newPasswordField.sendKeys(newPassword);
	}
	
	public void selectNewUserType(String userType)
	{
		Page_utilities page = new Page_utilities();
		page.selectionIndes(newUserTypeField, userType);
	}
	
	public void clickSaveButton()
	{
		savebutton.click();
	}
	
	public boolean isAlertForSuccessIsLoaded()
	{
		return alert.isDisplayed();
	}

}

