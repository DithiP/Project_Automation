package pages;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delete_Admin_User 
{
	WebDriver driver;
	public Delete_Admin_User(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']//i[@class='fas fa-arrow-circle-right']")WebElement adminUserLink;
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr[15]/td[5]//i[@class='fas fa-trash-alt']")WebElement deleteTableData;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	public void clickAdminUserLink()
	{
		adminUserLink.click();
	}
	public void clickDeleteButton()
	{
		deleteTableData.click();
		driver.switchTo().alert().accept();
	}
	public boolean isalertIsDisplayed()
	{
		return alert.isDisplayed();
	}
}
