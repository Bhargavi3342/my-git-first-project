package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableDemo1 
{
	
  @Test
  public void WebTableTest() 
  {
	  
	  WebDriver driver=new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/2013/09/test.html");
		
		WebElement webTableDemo=driver.findElement(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td[1]"));
		String tableData=webTableDemo.getText();
		System.out.println(tableData);
		
		
	}



}
