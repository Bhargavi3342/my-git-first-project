package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropDemo
{
	
  @Test
  public void DragAndDropTest() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/slider/#colorpicker");
	 WebElement frame = driver.findElement(By.xpath("//*[@id='content']/iframe"));
	  driver.switchTo().frame(frame);
	 WebElement greenSlider =  driver.findElement(By.xpath("//*[@id='green']/span"));
	 Actions action = new Actions(driver);
	 action.dragAndDropBy(greenSlider, 100, 125).perform();
	  
  }
}
