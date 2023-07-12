package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinksDemo1 
{
  @Test
  public void linktest()
  {
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/bharg/Downloads/link.html");
	WebElement link = driver.findElement(By.xpath("//a[text()='RBG technologies']"));
	String attributeValue = link.getAttribute("href");
    
	if (!attributeValue.equals(""))
	{
		System.out.println("link is working fine");
	}
	else 
	{
		System.out.println("link is not working fine");
	}
  }
}
