package dropDwonDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LabelDemo4 
{
	
  @Test
  public void LabelTest() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://only-testing-blog.blogspot.com/2015/01/iframe1.html");
	  driver.switchTo().frame(0);
	  WebElement label = driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/h2/span"));
	  
	  String actualData = label.getText();
	  String expectedData = "Saturday, 3 january 2015";
     
      System.out.println("actualData"+expectedData);
      driver.switchTo().defaultContent();
      WebElement inputbox = driver.findElement(By.xpath("//input[@name='Town']"));
      inputbox.sendKeys("Hyderabad");
      
  }
}
