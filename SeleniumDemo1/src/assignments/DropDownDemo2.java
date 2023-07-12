package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDemo2 
{

	@Test
	public void DropDownTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	    WebElement monthsElement = driver.findElement(By.xpath("//select[@name = 'fromMonth']"));
        Select select = new Select(monthsElement);
        List<WebElement> allMonths = select.getOptions();
        
        for(WebElement months : allMonths)
        {
        	System.out.println(months.getText());
        }
	}

}
