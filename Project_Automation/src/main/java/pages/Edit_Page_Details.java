package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Wait_Utilities;

public class Edit_Page_Details 
{
	WebDriver driver;
	public Edit_Page_Details(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//i[@class='fas fa-arrow-circle-right']")WebElement managePagesLink;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/pages/edit?edit=1545&page_ad=1']")WebElement editDetails;
	@FindBy(xpath="//input[@placeholder='Enter the Title']")WebElement editTittleField;
	@FindBy(xpath="//div[@class='note-editable card-block']")WebElement editDescriptionfield;
	@FindBy(xpath="//input[@placeholder='Enter Page Name']")WebElement editPageNmaeField;
	@FindBy(xpath="//input[@id='main_img']")WebElement chooseFileButton;
	@FindBy(xpath="//button[@name='update']")WebElement detailsUpdateButton;
	public void clickManagePageLink()
	{
		managePagesLink.click();
	}
	public void clickEditdetails()
	{
		editDetails.click();
	}
	public void enterTitleToBeEdit(String editTitle)
	{
		editTittleField.clear();
		editTittleField.sendKeys(editTitle);
	}
	public void enterDescriptionToBeEdit(String editDescription)
	{
		editDescriptionfield.clear();
		editDescriptionfield.sendKeys(editDescription);
	}
	public void enterPageNameToBeEdit(String editPageName)
	{
		editPageNmaeField.clear();
		editPageNmaeField.sendKeys(editPageName);
	}
	public void selectFile(String filepath)
	{
		chooseFileButton.sendKeys(filepath);
	}
	public void clickUpdateButton()
	{
		Wait_Utilities wait1=new Wait_Utilities();
		wait1.waitforAnElementtoBeClick(driver, detailsUpdateButton);
		detailsUpdateButton.click();
	}
	public boolean isDetailsEditedSccesfully()
	{
		return detailsUpdateButton.isDisplayed();
	}
}
