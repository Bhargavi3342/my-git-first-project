package dropDwonDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDemo1
{
	
  @Test
  public void DropDownTest() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	  WebElement dropdown = driver.findElement(By.xpath("//select[@name='toMonth']"));
      
	  Select select = new Select(dropdown);
      select.selectByIndex(3);
      select.deselectByVisibleText("January");
      select.selectByValue("11");
      
  }
}
