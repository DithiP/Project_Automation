package testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.Login_Page;
import pages.Manage_Pages;
import utilities.Excel_Utilities;

public class Manage_Pages_Test extends LoginPage_Test
{
  @Test
  public void verify_User_is_Able_to_Upload_Image() throws IOException
  {
	  String userNameValue=Excel_Utilities.readStringdata(1, 0, "Login page");
	  String passwordValue=Excel_Utilities.readStringdata(1, 1,"Login page");
	  Login_Page loginPage=new Login_Page(driver);
	  loginPage.enterUserNameField(userNameValue);
	  loginPage.enterPasswordField(passwordValue);
	  loginPage.clickSubmitButton(); 
	  String titleValue=Excel_Utilities.readStringdata(1, 0, "upload_Image");
	  String descriptionValue=Excel_Utilities.readStringdata(1, 1, "upload_Image");
	  String pageNameValue=Excel_Utilities.readStringdata(1, 2, "upload_Image");
	  String filepath1=Excel_Utilities.readStringdata(1, 3,"upload_Image");
	  Manage_Pages uploadImage=new Manage_Pages(driver);
	  uploadImage.clickManagePageLink();
	  uploadImage.clickNewButton();
	  uploadImage.enterTitle(titleValue);
	  uploadImage.enterDescription(descriptionValue);
	  uploadImage.enterPageName(pageNameValue);
	  uploadImage.selectFile(filepath1);
	  uploadImage.clickSavebutton();
	  boolean isfileuploaded=uploadImage.isfileuploaded();
	  assertTrue(isfileuploaded, Constants.ERRORMESSAGEFORFILEUPLOAD);
  }
}

