package testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.Edit_Page_Details;
import pages.Login_Page;
import utilities.Excel_Utilities;

public class EditPageDetails_Test extends Base 
{
  @Test
  public void verify_User_is_Able_to_Edit_Pagelist_details() throws IOException 
  {
	  Login_Page login=new Login_Page(driver);
	  String userNameValue=Excel_Utilities.readStringdata(1, 0, "Login page");
	  String passwordValue=Excel_Utilities.readStringdata(1, 1, "Login page");
	  login.enterUserNameField(userNameValue);
	  login.enterPasswordField(passwordValue);
	  login.clickSubmitButton();
	  String editTitleValue = Excel_Utilities.readStringdata(1, 0, "Edit_Product_Details");
	  String descriptionValue=Excel_Utilities.readStringdata(1, 1, "Edit_Product_Details");
	  String pageNameValue=Excel_Utilities.readStringdata(1, 2, "Edit_Product_Details");
	  String filepath1=Excel_Utilities.readStringdata(1, 3,"Edit_Product_Details");
	  Edit_Page_Details uploadImage=new Edit_Page_Details(driver);
	  uploadImage.clickManagePageLink();
	  uploadImage.clickEditdetails();
	  uploadImage.enterTitleToBeEdit(editTitleValue);
	  uploadImage.enterDescriptionToBeEdit(descriptionValue);
	  uploadImage.enterPageNameToBeEdit(pageNameValue);
	  uploadImage.selectFile(filepath1);
	  uploadImage.clickUpdateButton();
	  boolean isEditedDetailsisDisplayed=uploadImage.isDetailsEditedSccesfully();
	  assertTrue(isEditedDetailsisDisplayed,Constants.EDITEDDETAILSDISPLAYEDSUCCESFULLY);
	  
  }
}
