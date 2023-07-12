package WebTableDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LabelDemo5
{
	
  @Test
  public void LabelTest() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://gmail.com");
	  WebElement learnMoreElement = driver.findElement(By.xpath("//a[@aria-label= 'learn more about using Guest mode']"));
	  learnMoreElement.click();
	  
	  Set<String> windowsId = driver.getWindowHandles();
	  Iterator<String> windowsList= windowsId.iterator();
	  String perentWindowId = windowsList.next();
	  String childWindowId = windowsList.next();
	  driver.switchTo().window(childWindowId);
	  
	  String getTextElement = driver.findElement(By.xpath("//h1[text()='Browse Chrome as a guest']")).getText();
	  System.out.println(getTextElement);
  }
}
