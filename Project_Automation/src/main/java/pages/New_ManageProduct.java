package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUpload_Utilities;
import utilities.Page_utilities;

public class New_ManageProduct 
{
	WebDriver driver;
	public New_ManageProduct(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-product']")WebElement manageProductLink;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/add']")WebElement newProductButton;
	@FindBy(xpath="//input[@id='title']")WebElement titleField;
	@FindBy(xpath="//input[@value='Nonveg']")WebElement productType;
	@FindBy(xpath="//input[@id='tag']")WebElement tagField;
	@FindBy(xpath="//select[@id='cat_id']")WebElement categorySelect;
	@FindBy(xpath="//select[@id='sub_id']")WebElement subcategorySelect;
	@FindBy(xpath="//select[@id='grp_id']")WebElement groupSelect;
	@FindBy(xpath="//input[@value='piece']")WebElement priceType;
	@FindBy(xpath="//select[@id='p_minimum']")WebElement minimumPieceSelect;
	@FindBy(xpath="//input[@id='p_max']")WebElement maxQtCanOrderField;
	@FindBy(xpath="//input[@id='p_price']")WebElement priceField;
	@FindBy(xpath="//input[@id='p_mrp']")WebElement mrpField;
	@FindBy(xpath="//input[@id='p_stock']")WebElement stockAvailabilityField;
	@FindBy(xpath="//input[@id='p_pp']")WebElement purchasePriceField;
	@FindBy(xpath="//input[contains(@name,'unlimitp')]")WebElement unlimitCheckbox;
	@FindBy(xpath="//div[@class='note-editable card-block']")WebElement descriptionField;
	//@FindBy(xpath="//input[@name='stock'][@value='yes']")WebElement Stockselect;
	//@FindBy(xpath="//input[@id='main_img']")WebElement chooseFileButton;
	//@FindBy(xpath="//input[@id='main_imgs']")WebElement chooseSubFileButton;
	//@FindBy(xpath="//input[@name='featured'][@value='no']")WebElement featuredSelect;
	//@FindBy(xpath="//input[@name='combo'][@value='no']")WebElement comboSelect;
	@FindBy(xpath="//button[text()='Save']")WebElement saveButton;
	public void clickManageProductLink()
	{
		manageProductLink.click();
	}
	public void clickNewProductButton()
	{
		newProductButton.click();
	}
	public void enterTitle(String title)
	{
		titleField.sendKeys(title);
	}
	public void clickProductType()
	{
		productType.click();
	}
	public void enterTag(String tag)
	{
		tagField.sendKeys(tag);
	}
	public void selectCategory(String category)
	{
		Page_utilities page = new Page_utilities();
		page.selectionIndes(categorySelect, category);
	}
	public void selectSubCategory(String subCategory)
	{
		Page_utilities page = new Page_utilities();
		page.selectionIndes(subcategorySelect, subCategory);
	}
	public void selectGroup(String group)
	{
		Page_utilities page = new Page_utilities();
		page.selectionIndes(groupSelect, group);
	}
	public void clickPriceType() 
	{
		priceType.click();
	}
	public void selectMinimumPiece(String minimumPiece)
	{
		Page_utilities page = new Page_utilities();
		page.selectionIndes(minimumPieceSelect, minimumPiece);
	}
	public void enterMaxQtCanOrder(String maxQuantity)
	{
		maxQtCanOrderField.sendKeys(maxQuantity);
	}
	public void enterPrice(String price)
	{
		priceField.sendKeys(price);
	}
	public  void enterMRPField(String mrp)
	{
		mrpField.sendKeys(mrp);
	}
	public void enterStockAvailability(String stockAvailability)
	{
		stockAvailabilityField.sendKeys(stockAvailability);
	}
	public void enterPurchasePrice(String purchasePrice)
	{
		purchasePriceField.sendKeys(purchasePrice);
	}
	public void clickUnlimited()
	{
		unlimitCheckbox.click();
	}
	public void enterDescription(String description)
	{
		descriptionField.sendKeys(description);
	}
	/*public void clickStock()
	{
		Stockselect.click();
	}*/
	/*public void selectFile(String filepath)
	{
		FileUpload_Utilities upload=new FileUpload_Utilities();
		upload.chooseFileToUpload(chooseFileButton, filepath);
	}
	public void selectSubFile(String filepath1)
	{
		FileUpload_Utilities upload=new FileUpload_Utilities();
		upload.chooseFileToUpload(chooseSubFileButton, filepath1);
	} 
	public void clickFeatured()
	{
		featuredSelect.click();
	}
	public void clickCombo() 
	{
		comboSelect.click();
	}*/
	public void clickSaveButton()
	{
		saveButton.click();
	}
	public boolean isProductDetailAddedSuccess()
	{
		return saveButton.isDisplayed();
	}
	}
