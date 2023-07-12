package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConfirmBox
{
	
  @Test
  public void ConfirmBoxTest() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	  
	  driver.findElement(By.id("confirmBox")).click();
	  driver.switchTo().alert().accept();
	  System.out.println(driver.switchTo().alert().getText());
	  driver.findElement(By.id("confirmBox")).click();
	  driver.switchTo().alert().dismiss();
	  System.out.println(driver.switchTo().alert().getText());
	  System.out.println(driver.findElement(By.id("output")).getText());
	  
	  Thread.sleep(2000);
	  
	  }
}
