package testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.Login_Page;
import pages.Search_User;
import utilities.Excel_Utilities;

public class Search_User_Test extends LoginPage_Test
{
  @Test
  public void verify_User_is_Able_To_Search_User() throws IOException 
  {
	  String userNameValue=Excel_Utilities.readStringdata(1, 0, "Login page");
	  String passwordValue=Excel_Utilities.readStringdata(1, 1,"Login page");
	  Login_Page loginPage=new Login_Page(driver);
	  loginPage.enterUserNameField(userNameValue);
	  loginPage.enterPasswordField(passwordValue);
	  loginPage.clickSubmitButton(); 	
	String userNameValue1 = Excel_Utilities.readStringdata(1, 0,"Search_User");
	String userTypeValue = Excel_Utilities.readStringdata(1, 1,"Search_User");
	Search_User search = new Search_User(driver);
	search.clickAdminLink();
	search.clickSearchButton();
	search.enterUserName(userNameValue1);
	search.selectUserType(userTypeValue);
	search.clickSearchSubmitButton();
	boolean isSearchResutfound=search.isSearchResultfound();
	assertTrue(isSearchResutfound, Constants.SEARCHRESULT);
  }
}

