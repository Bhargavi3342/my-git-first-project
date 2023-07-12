package WebTableDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableCountDemo
{
	
  @Test
  public void TableCountTest() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://only-testing-blog.blogspot.com/2013/09/test.html");
       driver.findElement(By.xpath(("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td[1]")));
    //   String tableData= TableCountTest 
	//	System.out.println(tableData);
		
		
	}
  }

