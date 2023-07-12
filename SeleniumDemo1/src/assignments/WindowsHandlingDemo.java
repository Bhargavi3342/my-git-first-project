package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsHandlingDemo 
{
	
  @Test
  public void WindowsHandlingTest() 
  {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	  
	  String parentWindowHandle = driver.getWindowHandle();
	  System.out.println("parant window handle :"+parentWindowHandle);
	  driver.findElement(By.xpath("//*[@id='newWindowBtn']")).click();
	  Set<String> windowHandles = driver.getWindowHandles();
	  for(String windowHandle : windowHandles)
	  {
		  System.out.println(windowHandle);
	  }
      
	  driver.quit();
  
  }
}
