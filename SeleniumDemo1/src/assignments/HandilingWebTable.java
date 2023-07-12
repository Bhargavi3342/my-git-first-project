package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v112.cachestorage.model.Header;
import org.testng.annotations.Test;

public class HandilingWebTable
{
	
  @Test
  public void HandilingWebTableTest() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.bseindia.com/markets/equity/EQReports/mktwatchR.html?filter=gainer*all$all$");
	  
	  String rowData = driver.findElement(By.xpath("//*[@id='fontSize']//table/tbody/tr/td/table/thead/tr/td[1]")).getText();
      System.out.println("data of row is :"+rowData);
      
      String columnData = driver.findElement(By.xpath("//*[@id='fontSize']/div[2]//table/tbody/tr/td/table/tbody/tr[5]/td[5]")).getText();
      System.out.println("data of column is :"+columnData);
      
      
	  
  }
}
	  
	  
	  
	  
	  
	  
	  
	  
