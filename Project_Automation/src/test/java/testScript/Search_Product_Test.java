package testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.Login_Page;
import pages.Search_Product;
import utilities.Excel_Utilities;

public class Search_Product_Test extends LoginPage_Test
{
  @Test
  public void verify_User_is_Able_To_Search_Product_Details() throws IOException
  {
	  String userNameValue=Excel_Utilities.readStringdata(1, 0, "Login page");
	  String passwordValue=Excel_Utilities.readStringdata(1, 1,"Login page");
	  Login_Page loginPage=new Login_Page(driver);
	  loginPage.enterUserNameField(userNameValue);
	  loginPage.enterPasswordField(passwordValue);
	  loginPage.clickSubmitButton(); 
	  String titleValue = Excel_Utilities.readStringdata(1, 0, "Search_Data");
	  Search_Product search = new Search_Product(driver);
	  search.clickManagePageLink();
	  search.clickNewSeachButton();
	  search.enterTitleField(titleValue);
	  search.clickSearchSubmitButton();
	  boolean isSearchResultFound=search.isSearchSuccesfull();
	  assertTrue(isSearchResultFound, Constants.SEARCHRESULTFOUND);
  }
}
