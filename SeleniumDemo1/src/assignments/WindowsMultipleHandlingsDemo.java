package assignments;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class WindowsMultipleHandlingsDemo 
{
	
  @Test
  public void windowsMultipleHandlingsTest() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	  driver.findElement(By.xpath("//*[@id='newWindowsBtn']"));
	  String parentWindow = driver.getWindowHandle();
	  System.out.println(parentWindow);
	  Set<String> windowhandles = driver.getWindowHandles();
	  System.out.println(windowhandles);
	
	  String childWindow = driver.getWindowHandle();
	  System.out.println(childWindow);
	  Set<String> windowhandles1 = driver.getWindowHandles();
	  System.out.println(windowhandles1);
	  driver.switchTo().window(childWindow);
	  
	  driver.findElement(By.name("firstName")).sendKeys("RBG technologies");
	  driver.findElement(By.name("lastName")).sendKeys("Hyderabad");
	  driver.switchTo().window(parentWindow);
	  
  }
}
