package assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertBox 
{
	
  @Test
  public void AlertTest() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	  

	  WebElement element = driver.findElement(By.xpath("//*[@id='alertBox']"));
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click();", element);
	  element.click();
	  
	 Alert alert = driver.switchTo().alert();
	 alert.accept();
	String alertMessage = driver.switchTo().alert().getText();
	 
	 System.out.println(alertMessage);
	 Thread.sleep(3000);
	
}
  }

