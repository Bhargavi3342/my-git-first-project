package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableDemo 
{
	
  @Test
  public void TableTest()
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.bseindia.com/markets/equity/EQReports/mktwatchR.html?filter=gainer*all$all$");
      driver.findElements(By.xpath(""));
  
  
  }
}
