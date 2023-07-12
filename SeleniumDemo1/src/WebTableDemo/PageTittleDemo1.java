package WebTableDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTittleDemo1
{
	
  @Test
  public void PageTittleTest()
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	  String actualTitle = driver.getTitle();
	  System.out.println(actualTitle);
	  String expectedTitle = "Find a Flight:Mercury Tours";
	  Assert.assertEquals("Title is not matching", expectedTitle, actualTitle);
	  }
}
