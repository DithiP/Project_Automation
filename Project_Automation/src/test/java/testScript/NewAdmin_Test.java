package testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import javax.management.DescriptorKey;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constants;
import pages.Admin_User;
import pages.Login_Page;
import pages.Login_Page;
import utilities.Excel_Utilities;

public class NewAdmin_Test extends Base
{
  @Test 
  @Parameters({"userName","password"})
  public void verify_User_is_Able_To_Add_NewUser(String username,String password1) throws IOException 
  {
	  Login_Page login= new Login_Page(driver);
	  login.enterUserNameField(username);
	  login.enterPasswordField(password1);
	  login.clickSubmitButton();
	  String newUserNameValue=Excel_Utilities.readStringdata(1, 0,"New_Admin_User");
	  String newPasswordValue=Excel_Utilities.readStringdata(1, 1,"New_Admin_User"); 
	  String newUserTypeValue=Excel_Utilities.readStringdata(1,2,"New_Admin_User");
	  Admin_User newAdminUser=new Admin_User(driver);
	  newAdminUser.clickAdminUserLink();
	  newAdminUser.clickNewAdminUser();
	  newAdminUser.enterNewUserName(newUserNameValue);
	  newAdminUser.EnterNewPassword(newPasswordValue);
	  newAdminUser.selectNewUserType(newUserTypeValue);
	  newAdminUser.clickSaveButton();
	  boolean isAlertIsDiaplayed=newAdminUser.isAlertForSuccessIsLoaded();
	  assertTrue(isAlertIsDiaplayed,Constants.ALERTMESSAGEFORADDADMIN);
	 	  
  }
}
