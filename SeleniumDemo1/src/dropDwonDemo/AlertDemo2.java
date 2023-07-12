package dropDwonDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo2 
{
	
  @Test
  public void AlertDemo() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.meghanabus.in/index.html");
	  WebElement Label = driver.findElement(By.xpath("//a[@title='Manage Bookings']"));
	  Label.click();
	  Thread.sleep(4000);
	  
	  WebElement Label2 = driver.findElement(By.xpath("//button[@type='search']"));
	  Label2.click();
	  Thread.sleep(4000);
	  
	  Alert alert = driver.switchTo().alert();
	  String alertText = alert.getText();
	  System.out.println("alertText :"+alertText);
	  alert.accept();
	  
	  WebElement Label3 = driver.findElement(By.xpath("//span[text()='please enter the details for print, update, cancel and pre/postpone Ticket']"));
	  Label3.getText();
	  System.out.println(Label3.getText());
	   
  }
}
