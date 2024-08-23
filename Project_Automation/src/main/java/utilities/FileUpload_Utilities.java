package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUpload_Utilities 
{
public void chooseFileToUpload(WebElement element,String filepath)
{
	element.sendKeys(filepath);
}

public static void fileuploadRobortclass(WebElement element1,String filepath1)
{
	try {
		StringSelection stringSelection = new StringSelection(filepath1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	} 
	catch (AWTException e) 
	{
		e.printStackTrace();
	}
}
}
