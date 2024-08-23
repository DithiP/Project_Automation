package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Page_utilities 
{
//reusable codes
	WebDriver driver;
	public void selectionIndes(WebElement element,String elementtext)
	{
	Select select=new Select(element);
	select.selectByVisibleText(elementtext);
	}
	public void selectByValue(WebElement element,String elementValue)
	{
		Select select=new Select(element);
		select.selectByValue(elementValue);
	}
	public void selectionIndex(WebElement element)
	{
		Select select=new Select(element);
		select.selectByIndex(0);
	}
	public void dragDrop(WebElement element1,WebElement element2)
	{
		Actions selection=new Actions(driver);
		selection.dragAndDrop(element1, element2).perform();
	}
	public void javaScriptExecuter(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		js.executeScript("arguments[0].click();",element);
		element.click();
	}
	
	
}
