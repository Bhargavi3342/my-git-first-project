package testNgWithSeleniumDemo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementsAndFindElementsDemo1
{
	
  @Test
  public void FindElementsAndFindElementsTest1() 
  {
	  WebDriver driver = new ChromeDriver();
	//  WebElement element = driver.findElement(By.id("RBG"));
	  List<WebElement> lists = driver.findElements(By.id("RBG"));
	  int elementsCount= lists.size();
	  System.out.println("elementsCount : "+elementsCount);
	  System.out.println("Done");
  }
}
