package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Page_utilities;

public class Search_SubcatogeryList 
{
	WebDriver driver;
	public Search_SubcatogeryList(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category'][@class='small-box-footer']")WebElement subCategoryLink;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement newSearchButton;
	@FindBy(xpath="//select[@class='form-control selectpicker']")WebElement categoryField;
	@FindBy(xpath="//input[@name='ut']")WebElement subCategoryField;
	@FindBy(xpath="//button[@value='sr']")WebElement searchButton;
	public void clickSubcategoryLink()
	{
		subCategoryLink.click();
	}
	public void clickNewSearchbutton()
	{
		newSearchButton.click();
	}
	public void selectCategory(String category)
	{
		Page_utilities page = new Page_utilities();
		page.selectionIndes(categoryField, category);
	}
	public void enterSubcategory(String subCategory)
	{
		subCategoryField.sendKeys(subCategory);
	}
	public void clickSearchButton()
	{
		searchButton.click();
	}
	public boolean isSearchDataLoaded()
	{
		return searchButton.isDisplayed();
	}
	
}
