package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonDemo1 
{
	
  @Test
  public void RadioButtonTest() 
  {
	  
	  	      WebDriver driver = new ChromeDriver();
	  	      driver.get("http://demo.guru99.com/test/newtours/reservation.php");
	  	      WebElement radioButtonDemo1 = driver.findElement(By.xpath("//input[@type='radio'and@value='oneway']"));
	  	      
	  	      boolean radioButtonDemo1Displayed=radioButtonDemo1.isDisplayed();
	  	      if(radioButtonDemo1Displayed==true)
	  	      {
	  	    	  System.out.println("oneway RadioButtonDemo1 is Displayed");
	  	      }
	  	      else
	  	      {
	  	    	  System.out.println("oneway RadioButtonDemo1 is not Displayed");
	  	      }
	  	      boolean radioButtonDemo1Enabled = radioButtonDemo1.isEnabled();
	  	      if(radioButtonDemo1Enabled==true)
	  	      {
	  	    	  System.out.println("oneway RadioButtonDemo1 is Enabled");
	  	      }
	  	      else
	  	      {
	  	    	  System.out.println("oneway RadioButtonDemo1 is not Enabled");
	  	      }
	            boolean radioButtonDemo1selected = radioButtonDemo1.isSelected();
	            if(radioButtonDemo1selected==true)
	            {
	          	  System.out.println("oneway RadioButtonDemo1 is selected");
	            }
	            else
	            {
	          	  System.out.println("oneway RadioButtonDemo1 is not selected");
	            }
	            radioButtonDemo1.click();
	  	}
	  
  }

