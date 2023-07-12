package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SiblingRadioButtonDemo1 
{
	
  @Test
  public void SiblingRadioButtonTest()
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://en-gb.facebook.com/");
	  WebElement redio = driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[preceding-sibling::label[text()='Female']]"));
	  System.out.println("Before : "+redio.isSelected());
	  if(!(redio.isSelected()))
	  {
		  redio.click();
	  }
	  System.out.println("After : "+redio.isSelected());
	  driver.close();
}
}