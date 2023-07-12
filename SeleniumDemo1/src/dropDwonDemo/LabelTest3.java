package dropDwonDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LabelTest3
{
	
  @Test
  public void LabelTestTest() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.meghanabus.in/index.html");
	  WebElement Label = driver.findElement(By.xpath("//a[@title='Manage Bookings']"));
	  Label.click();
	  Thread.sleep(4000);
	  WebElement button = driver.findElement(By.xpath("//button[@type='search']"));
	  button.click();
	  String alertText = driver.switchTo().alert().getText();
	  System.out.println("alertText :"+alertText);
	  driver.switchTo().alert().getText();
	  WebElement Label3 = driver.findElement(By.xpath("//span[text()='please enter the details for print, update, cancel and pre/postpone Ticket']"));
	  Label3.getText();
	  Thread.sleep(4000);
	  
	  
	  	  
  }
}
