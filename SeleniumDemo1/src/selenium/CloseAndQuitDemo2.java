package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseAndQuitDemo2
{
	
  @Test
  public void CloseAndQuitTest() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://gmail.com");
		 WebElement learnMoreelement= driver.findElement(By.xpath("//a[@aria-label='Learn more about using Guest mode']"));
		 learnMoreelement.click();
  }
}
