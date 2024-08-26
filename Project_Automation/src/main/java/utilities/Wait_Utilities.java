package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Constants;

public class Wait_Utilities 
{
	public void waitforAnElementtoBeClick(WebDriver driver,WebElement elementName)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Constants.EXPLICITWAIT));
		wait.until(ExpectedConditions.elementToBeClickable(elementName));
	}
	public void waitforAnElementtoBeSelected(WebDriver driver,WebElement elementName)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Constants.EXPLICITWAIT));
		wait.until(ExpectedConditions.elementToBeSelected(elementName));
	}
	public void waitforAnElementtoBevisiblity(WebDriver driver,WebElement elementName)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Constants.EXPLICITWAIT));
		wait.until(ExpectedConditions.visibilityOf(elementName));
	}
	public void waitforAnElementtoBeInvisiblity(WebDriver driver,WebElement elementName)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Constants.EXPLICITWAIT));
		wait.until(ExpectedConditions.invisibilityOf(elementName));
	}
	
}
