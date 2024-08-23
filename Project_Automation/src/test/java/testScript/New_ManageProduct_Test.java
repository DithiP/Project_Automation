package testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.Login_Page;
import pages.New_ManageProduct;
import utilities.Excel_Utilities;

public class New_ManageProduct_Test extends LoginPage_Test
{
  @Test
  public void verify_User_Is_Able_To_Add_new_ProductDetails() throws IOException 
  {
	  String userNameValue=Excel_Utilities.readStringdata(1, 0, "Login page");
	  String passwordValue=Excel_Utilities.readStringdata(1, 1,"Login page");
	  Login_Page loginPage=new Login_Page(driver);
	  loginPage.enterUserNameField(userNameValue);
	  loginPage.enterPasswordField(passwordValue);
	  loginPage.clickSubmitButton(); 
	  String titleValue=Excel_Utilities.readStringdata(1, 0, "Manage_Product_Details");
	  String tagValue=Excel_Utilities.readStringdata(1, 1, "Manage_Product_Details");
	  String selectCategoryValue=Excel_Utilities.readStringdata(1, 2, "Manage_Product_Details");
	  String selectSubCategoryValue=Excel_Utilities.readStringdata(1, 3, "Manage_Product_Details");
	  String selectGroupValue=Excel_Utilities.readStringdata(1, 4, "Manage_Product_Details");
	  String selectMinimumPiece=Excel_Utilities.readStringdata(1, 5, "Manage_Product_Details");
	  String maxQtCanOrderValue=Excel_Utilities.readIntigerData(1, 6, "Manage_Product_Details");
	  String priceForProduct=Excel_Utilities.readIntigerData(1, 7, "Manage_Product_Details");
	  String mrpForProduct=Excel_Utilities.readIntigerData(1, 8, "Manage_Product_Details");
	  String productStockAvailable=Excel_Utilities.readIntigerData(1, 9, "Manage_Product_Details");
	  String purchasePriceForProduct=Excel_Utilities.readIntigerData(1, 10, "Manage_Product_Details");
	  String descriptionValue=Excel_Utilities.readStringdata(1, 11, "Manage_Product_Details");
	  //String imagePath=Excel_Utilities.readStringdata(1, 12, "Manage_Product_Details");
	  //String subimagePath=Excel_Utilities.readStringdata(1, 13, "Manage_Product_Details");
	  New_ManageProduct newProduct=new New_ManageProduct(driver);
	  newProduct.clickManageProductLink();
	  newProduct.clickNewProductButton();
	  newProduct.enterTitle(titleValue);
	  newProduct.clickProductType();
	  newProduct.enterTag(tagValue);
	  newProduct.selectCategory(selectCategoryValue);
	  newProduct.selectSubCategory(selectSubCategoryValue);
	  newProduct.selectGroup(selectGroupValue);
	  newProduct.clickPriceType();
	  newProduct.selectMinimumPiece(selectMinimumPiece);
	  newProduct.enterMaxQtCanOrder(maxQtCanOrderValue);
	  newProduct.enterPrice(priceForProduct);
	  newProduct.enterMRPField(mrpForProduct);
	  newProduct.enterStockAvailability(productStockAvailable);
	  newProduct.enterPurchasePrice(purchasePriceForProduct);
	  newProduct.clickUnlimited();
	  newProduct.enterDescription(descriptionValue);
	  //newProduct.clickStock();
	  //newProduct.selectFile(imagePath);
	  //newProduct.selectSubFile(subimagePath);
	  //newProduct.clickFeatured();
	  //newProduct.clickCombo();
	  newProduct.clickSaveButton();
	  boolean isproductlistadded=newProduct.isProductDetailAddedSuccess();
	  assertTrue(isproductlistadded, Constants.ALERTMESSAGEFORPRODUCTLISTADDED);
  }
}
