package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopupDemo
{
	
  @Test
  public void AlertPopUpTest()
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	 driver.findElement(By.id("output")).getText();
	 System.out.println(driver.findElement(By.id("output")).getText());
	 driver.findElement(By.id("alertBox")).click();
	 driver.switchTo().alert().getText();
     System.out.println( driver.switchTo().alert().getText());
     System.out.println(driver.findElement(By.id("output")).getText());
	  
	  System.out.println(driver.findElement(By.id("output")).getText());
	  driver.findElement(By.id("confirmBox")).click();
	  System.out.println( driver.switchTo().alert().getText());	  
	  driver.switchTo().alert().accept();
	  System.out.println(driver.findElement(By.id("output")).getText());
	  driver.findElement(By.id("confirmBox")).click();
	  System.out.println( driver.switchTo().alert().getText());
	  driver.switchTo().alert().dismiss();
	  System.out.println(driver.findElement(By.id("output")).getText());
 
	  System.out.println(driver.findElement(By.id("output")).getText());
	  driver.findElement(By.id("promptBox")).click();
	  System.out.println( driver.switchTo().alert().getText());	 
	  driver.switchTo().alert().sendKeys("Bhargavibayanna");
	  driver.switchTo().alert().accept();
	  System.out.println(driver.findElement(By.id("output")).getText());
	  driver.findElement(By.id("promptBox")).click();
	  System.out.println( driver.switchTo().alert().getText());
	  driver.switchTo().alert().dismiss();
	  System.out.println(driver.findElement(By.id("output")).getText());
 
	  
  
  }
}
