package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Page_utilities;

public class EditAdminUser 
{
	WebDriver driver;
	public EditAdminUser(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']")WebElement adminUserLink;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/user/edit?edit=9963&page_ad=1']")WebElement editDetailsButton;
	@FindBy(xpath="//input[@id='username']")WebElement editUserNameField;
	@FindBy(xpath="//input[@id='password']")WebElement editPasswordField;
	@FindBy(xpath="//select[@id='user_type']")WebElement editUserTypeField;
	@FindBy(xpath="//button[@class='btn btn-block-sm btn-info']")WebElement updateButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	public void clickAdminUserLink()
	{
		adminUserLink.click();
	}
	public void clickEditDetails()
	{
		editDetailsButton.click();
	}
	public void enterUserNameToBeEdit(String editUserName)
	{
		editUserNameField.clear();
		editUserNameField.sendKeys(editUserName);
	}
	public void enterPasswordToBeEdited(String editPassword)
	{
		editPasswordField.clear();
		editPasswordField.sendKeys(editPassword);
	}
	public void selectUserType(String userType)
	{
		Page_utilities page = new Page_utilities();
		page.selectionIndes(editUserTypeField, userType);
	}
	public void clickUpdateButton()
	{
		updateButton.click();
	}
	public boolean isUpdateUserIsSuccessfull()
	{
		return alert.isDisplayed();
	}

}
