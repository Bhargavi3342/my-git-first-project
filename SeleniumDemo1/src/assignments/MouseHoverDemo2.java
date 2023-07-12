package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverDemo2
{
	
  @Test
  public void MouseHoverTest() 
  {

		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.amazon.in/");	
		WebElement mouseHoverDemo1Element =driver.findElement(By.xpath("//a[@id='icp-nav-flyout']/span/span[2]/span[2]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mouseHoverDemo1Element).perform();
		
		WebElement country = driver.findElement(By.xpath("(//a[@id='icp-flyout-mkt-change']/span/div)[1]"));
		actions.scrollToElement(country);
		country.click();
		System.out.println("Done");
  }
}
