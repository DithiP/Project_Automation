package testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.commons.math3.analysis.function.Constant;
import org.testng.annotations.Test;

import constants.Constants;
import pages.AddSubCategory;
import pages.Login_Page;
import utilities.Excel_Utilities;

public class AddSubCategory_Test extends Base
{
  @Test
  public void verify_User_IS_Able_To_Add_Subcategory() throws IOException 
  {
	  Login_Page login=new Login_Page(driver);
	  String userNameValue=Excel_Utilities.readStringdata(1, 0, "Login page");
	  String passwordValue=Excel_Utilities.readStringdata(1, 1, "Login page");
	  login.enterUserNameField(userNameValue);
	  login.enterPasswordField(passwordValue);
	  login.clickSubmitButton();
	  String selectcategory=Excel_Utilities.readStringdata(1, 0, "Add_Subcategory");
	  String subcategoryValue=Excel_Utilities.readStringdata(1, 1, "Add_Subcategory");
	  //String chooseFilepath=Excel_Utilities.readStringdata(1, 2, "Add_Subcategory");
	  AddSubCategory subcategory=new AddSubCategory(driver);
	  subcategory.clickSubcategoryLink();
	  subcategory.clickNewSubCategory();
	  subcategory.selectCategory(selectcategory);
	  subcategory.enterSubcategory(subcategoryValue);
	  subcategory.clickChooseFile(Constants.IMAGEPATH);
	  subcategory.clickSaveButton();
	  boolean isSubcategoryIsAdded=subcategory.isSuccessMessageDisplayed();
	  assertTrue(isSubcategoryIsAdded,Constants.ALERTMESSAGEFOREDITADMINUSER);	  
  }
}
