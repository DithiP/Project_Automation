package testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.EditAdminUser;
import pages.Login_Page;
import utilities.Excel_Utilities;

public class EditAdminUser_Test extends Base
{
  @Test
  public void verify_User_Able_To_Edit_Admin_User() throws IOException 
  {
	  String userNameValue=Excel_Utilities.readStringdata(1, 0, "Login page");
	  String passwordValue=Excel_Utilities.readStringdata(1, 1,"Login page");
	  Login_Page loginPage=new Login_Page(driver);
	  loginPage.enterUserNameField(userNameValue);
	  loginPage.enterPasswordField(passwordValue);
	  loginPage.clickSubmitButton();  
	  String editUserNameValue=Excel_Utilities.readStringdata(1, 0, "Edit_Admin_User");
	  String editPasswordValue=Excel_Utilities.readStringdata(1, 1, "Edit_Admin_User");
	  String editUserTypeValue=Excel_Utilities.readStringdata(1,2,"Edit_Admin_User");
	  EditAdminUser editAdminUser1=new EditAdminUser(driver);
	  editAdminUser1.clickAdminUserLink();
	  editAdminUser1.clickEditDetails();
	  editAdminUser1.enterUserNameToBeEdit(editUserNameValue);
	  editAdminUser1.enterPasswordToBeEdited(editPasswordValue);
	  editAdminUser1.selectUserType(editUserTypeValue);
	  editAdminUser1.clickUpdateButton();
	  boolean isAlertIsDiaplayed=editAdminUser1.isUpdateUserIsSuccessfull();
	  assertTrue(isAlertIsDiaplayed,Constants.ALERTMESSAGEFOREDITADMINUSER);
  }
}

