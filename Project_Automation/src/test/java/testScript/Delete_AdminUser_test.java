package testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constants;
import pages.Delete_Admin_User;
//import utilities.Excel_Utilities;
import pages.Login_Page;
import utilities.Excel_Utilities;

public class Delete_AdminUser_test extends Base
{
  @Test
  @Parameters({"userName","password"})
  public void verify_User_Is_Able_To_Delete_Adminuser_Dtails(String username,String password1) throws IOException 
  {
	  //String userNameValue=Excel_Utilities.readStringdata(1, 0, "Login page");
	  //String passwordValue=Excel_Utilities.readStringdata(1, 1,"Login page");
	  Login_Page loginPage=new Login_Page(driver);
	  loginPage.enterUserNameField(username);
	  loginPage.enterPasswordField(password1);
	  loginPage.clickSubmitButton(); 
	  Delete_Admin_User delete=new Delete_Admin_User(driver);
	  delete.clickAdminUserLink();
	  delete.clickDeleteButton();
	  boolean isDeleteSuccessfull=delete.isalertIsDisplayed();
	  assertTrue(isDeleteSuccessfull, Constants.ALERTMESSAGEISLOADED);
  }
}
