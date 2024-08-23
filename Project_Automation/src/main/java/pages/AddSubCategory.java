package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUpload_Utilities;
import utilities.Page_utilities;
import utilities.Wait_Utilities;

public class AddSubCategory 
{
	WebDriver driver;
	public AddSubCategory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category'][@class='small-box-footer']")WebElement subCategoryLink;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newSubCategory;
	@FindBy(xpath="//select[@id='cat_id']")WebElement selectCategoryField;
	@FindBy(xpath="//input[@id='subcategory']")WebElement subCategoryField;
	@FindBy(xpath="//input[@id='main_img']")WebElement chooseFileButton;
	@FindBy(xpath="//button[text()='Save']")WebElement saveButton;
	@FindBy(xpath="//div[@class='col-sm-12']")WebElement alert;
	public void clickSubcategoryLink()
	{
		subCategoryLink.click();
	}
	public void clickNewSubCategory()
	{
		newSubCategory.click();
	}
	public void selectCategory(String category)
	{
		Page_utilities page = new Page_utilities();
		page.selectionIndes(selectCategoryField, category);
	}
	public void enterSubcategory(String subCategory)
	{
		subCategoryField.sendKeys(subCategory);
	}
	public void clickChooseFile(String filepath)
	{
		FileUpload_Utilities.fileuploadRobortclass(chooseFileButton, filepath);
	}
	public void clickSaveButton()
	{
		Wait_Utilities wait1 = new Wait_Utilities();
		wait1.waitforAnElementtoBeClick(driver, saveButton);
		saveButton.click();
	}
	public boolean isSuccessMessageDisplayed()
	{
		return alert.isDisplayed();
	}

}
