package dropDwonDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LabelDemo5 {
  @Test
  public void f()
  {
	  WebDriver driver= new ChromeDriver();
		 driver.get("http://gmail.com");
		 WebElement learnMoreelement= driver.findElement(By.xpath("//a[@aria-label='Learn more about using Guest mode']"));
		 learnMoreelement.click();
  }
}
