package testScript;

import static org.testng.Assert.assertEquals; 
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constants;
import pages.Login_Page;
import utilities.Excel_Utilities;
public class LoginPage_Test extends Base
{
	@DataProvider(name = "Credentials")
		public Object[][] testData() {// data provider
			Object[][] input = new Object[2][2];
			input[0][0] = "admin";
			input[0][1] = "admin";
			input[1][0] = "admin@123";
			input[1][1] = "admin123";
			return input;

		}
  @Test(retryAnalyzer = retry.Retry.class)
  @Parameters({"userName","password"})
  public void verify_User_is_Able_To_Login_Using_Valid_Credentials(String username,String password1) throws IOException  
  {
	  //String userNameValue=Excel_Utilities.readStringdata(1, 0, "Login page");
	  //String passwordValue=Excel_Utilities.readStringdata(1, 1,"Login page");
	  Login_Page loginPage=new Login_Page(driver);
	  loginPage.enterUserNameField(username);
	  loginPage.enterPasswordField(password1);
	  loginPage.clickSubmitButton();  
	  boolean isHomepageisLoaded=loginPage.isDashboardisLoaded();
	  assertTrue(isHomepageisLoaded,Constants.ERRORMESSAGEFORLOGIN);
	  //
  }
  @Test(groups={"Smoke testing"})
  @Parameters({"invalidUserName","password"})
  public void verify_User_is_Able_To_Login_Using_invalid_Username_Valid_Password(String invalidusername,String password1) throws IOException
  {
	  //String userNameValue=Excel_Utilities.readStringdata(2, 0, "Login page");
	  //String passwordValue=Excel_Utilities.readStringdata(2, 1,"Login page");
	  Login_Page loginpage=new Login_Page(driver);
	  loginpage.enterUserNameField(invalidusername);
	  loginpage.enterPasswordField(password1);
	  loginpage.clickSubmitButton();
	  boolean isAlertDisplayed=loginpage.isAlertisLoaded();
	  assertTrue(isAlertDisplayed,"invalid credentials");
  }    
  @Test(dataProvider = "Credentials")
  public void verify_User_is_Able_to_Login_Using_Valid_Username_invalid_Password(String userNameVal,String inPasswordVal) throws IOException  
  {
	// String userNameValue=Excel_Utilities.readStringdata(3, 0, "Login page");
	 //String passwordValue=Excel_Utilities.readStringdata(3, 1,"Login page");
	 Login_Page loginpage=new Login_Page(driver);
	 loginpage.enterUserNameField(userNameVal);
	 loginpage.enterPasswordField(inPasswordVal);
	 loginpage.clickSubmitButton();
	 boolean isAlertDisplayed=loginpage.isAlertisLoaded();
	  assertTrue(isAlertDisplayed,"invalid credentials");
  }
  @Test
  public void verify_User_is_Able_to_Login_Using_Invalid_Username_Invalid_Password() throws IOException 
  {
	  String userNameValue=Excel_Utilities.readStringdata(4, 0, "Login page");
	  String passwordValue=Excel_Utilities.readStringdata(4, 1,"Login page");
	  Login_Page loginpage=new Login_Page(driver);
	  loginpage.enterUserNameField(userNameValue);
	  loginpage.enterPasswordField(passwordValue);
	  loginpage.clickSubmitButton();
	  boolean isAlertDisplayed=loginpage.isAlertisLoaded();
	  assertTrue(isAlertDisplayed,"invalid credentials");
  }
}
