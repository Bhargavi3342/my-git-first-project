package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowsHandling 
{
	
  @Test
  public void MultipleWindowsHandlingTest() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	  String parentWindow = driver.getWindowHandle();
	  System.out.println("parent window "+parentWindow);
	  driver.findElement(By.xpath("//*[@id='newWindowsBtn']"));
	  Set<String> windowhandles = driver.getWindowHandles();
	  int count = windowhandles.size();
	  System.out.println("Total window "+count);
	  for(String child : windowhandles)
	  {
		  if(!parentWindow.equals(child))
		  {
			  driver.switchTo().window(child);
	       	  driver.findElement(By.name("firstName")).sendKeys("RBG technologies");
			  driver.findElement(By.name("lastName")).sendKeys("Hyderabad");
			  Thread.sleep(3000);
			  driver.close();
		  }
	  }	  
	  driver.switchTo().window(parentWindow);
	  System.out.println("parentWindow title is "+driver.getTitle());
  }
}
