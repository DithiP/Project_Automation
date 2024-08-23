package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUpload_Utilities;
import utilities.Wait_Utilities;

public class Manage_Pages 
{
	WebDriver driver;
	public Manage_Pages(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//i[@class='fas fa-arrow-circle-right']")WebElement managePagesLink;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/pages/add']")WebElement newButton;
	@FindBy(xpath="//input[@placeholder='Enter the Title']")WebElement titleField;
	@FindBy(xpath="//div[@role='textbox']")WebElement descriptionField;
	@FindBy(xpath="//input[@placeholder='Enter Page Name']")WebElement pageNmaeField;
	@FindBy(xpath="//input[@id='main_img']")WebElement chooseFileButton;
	@FindBy(xpath="//button[@name='create']")WebElement saveButton;
	
	public void clickManagePageLink()
	{
		managePagesLink.click();
	}
	
	public void clickNewButton()
	{
		newButton.click();
	}
	
	public void enterTitle(String title)
	{
		titleField.sendKeys(title);
	}
	
	public void enterDescription(String description)
	{
		descriptionField.sendKeys(description);
	}
	
	public void enterPageName(String pageName)
	{
		pageNmaeField.sendKeys(pageName);
	}
		
	public void selectFile(String filepath)
	{
		FileUpload_Utilities.fileuploadRobortclass(chooseFileButton, filepath);
	}
	
	public void clickSavebutton()
	{
		Wait_Utilities wait1 = new Wait_Utilities();
		wait1.waitforAnElementtoBeClick(driver, saveButton);
		saveButton.click();
	}
	
	public boolean isfileuploaded()
	{
		return saveButton.isDisplayed();
	}

}
