package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframesDemo1A 
{
	
  @Test
  public void IframesTest() 
  {
	  
	  		WebDriver driver= new ChromeDriver();
	  		driver.get("file:///C:/Users/Dell/Downloads/Iframe1%20(1).html");
	  		
	  		driver.switchTo().frame("iframe_a");
	  		driver.switchTo().frame("frame2");
	  		
	  		WebElement iframeText=driver.findElement(By.xpath("//span[text()='Tuesday, 28 January 2014']"));
	  		String iframe2Text=iframeText.getText();
	  		
	  		System.out.println(iframe2Text);
	  		
	  		driver.switchTo().parentFrame();
	  		WebElement townElement=driver.findElement(By.xpath("//input[@name='Town']"));
	  		townElement.sendKeys("RBG Technologies");
	  		
	  		
	}

 }

  

