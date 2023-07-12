package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumGetText1 
{
	
  @Test
  public void SeleniumGetText() 
  {
	
	  		WebDriver driver = new ChromeDriver();
	  		driver.get("https://gmail.com/");
	  		WebElement element=driver.findElement(By.xpath("input[name=passwd]"));
	  		String actualData=element.getText();
	  		String expectedData = "to continue to gmail";
	  		if(actualData.equals(expectedData)) 
	  		{
	  		    System.out.println("Data is matching");	
	  		}
	  		else
	  		{
	  			System.out.println("Data is not matching");
	  		}
	  	}
	  

  }

