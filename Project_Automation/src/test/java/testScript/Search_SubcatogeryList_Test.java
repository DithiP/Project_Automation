package testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.Login_Page;
import pages.Search_SubcatogeryList;
import utilities.Excel_Utilities;

public class Search_SubcatogeryList_Test extends LoginPage_Test
{
  @Test
  public void verify_user_Is_Able_To_Search_Details_From_SubcatogeryList() throws IOException 
  {
	  String userNameValue=Excel_Utilities.readStringdata(1, 0, "Login page");
	  String passwordValue=Excel_Utilities.readStringdata(1, 1,"Login page");
	  Login_Page loginPage=new Login_Page(driver);
	  loginPage.enterUserNameField(userNameValue);
	  loginPage.enterPasswordField(passwordValue);
	  loginPage.clickSubmitButton(); 
	  String selectcategory1=Excel_Utilities.readStringdata(1, 0, "Search_Subcategory_List");
	  String subcategoryValue=Excel_Utilities.readStringdata(1, 1, "Search_Subcategory_List");
	  Search_SubcatogeryList searchData=new Search_SubcatogeryList(driver);
	  searchData.clickSubcategoryLink();
	  searchData.clickNewSearchbutton();
	  searchData.selectCategory(selectcategory1);
	  searchData.enterSubcategory(subcategoryValue);
	  searchData.clickSearchButton();
	  boolean isSearchsuccessfull=searchData.isSearchDataLoaded();
	  assertTrue(isSearchsuccessfull, Constants.ERRORMESSAGEFORSEARCHSUBCATEGORYLIST);
  }
}
