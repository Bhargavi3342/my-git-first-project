package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InputBoxDemo2 
{
	
  @Test
  public void f() 
  {
	  
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.gmail.com/");
	  		WebElement InputBox = driver.findElement(By.xpath("//input[@id='identifierId']"));
	  		boolean InputBoxDisplay = InputBox.isDisplayed();
	  		System.out.println(InputBoxDisplay);
	  		boolean expectedInputBoxDisplay=true;
	  		if(InputBoxDisplay==expectedInputBoxDisplay)
	  		{
	  			System.out.println("InputBox is Displaying");
	  		}
	  		else
	  		{
	  			System.out.println("InputBox is not Displaying");
	  		}
	  		boolean InputBoxEnabled = InputBox.isEnabled();
	  		System.out.println(InputBoxEnabled);
	  		boolean expectedInputBoxEnabled=true;
	  		if(InputBoxEnabled==expectedInputBoxEnabled)
	  		{
	  			System.out.println("InputBox is Enabled");
	  		}
	  		else
	  		{
	  			System.out.println("InputBox is not Enabled");
	  		} 
	          String expectedWatermarkData="Email or Phone";
	          String actualWatermarkData= InputBox.getAttribute("aria-label");
	          System.out.println(actualWatermarkData);
	          if(actualWatermarkData.equals(expectedWatermarkData))
	          {
	          	System.out.println("WatermarkData is displaying correctly" );
	          }
	  	    else 
	  	    {
	  			System.out.println("WatermarkData is not displaying correctly");
	  		}
	          InputBox.sendKeys("RBG technologies");
	          String userEnteredData = InputBox.getAttribute("value");
	          System.out.println(userEnteredData);
	          InputBox.clear();
	  	}
	  

  }

