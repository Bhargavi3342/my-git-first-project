package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropDemo1
{
	
  @Test
  public void DragAndDropTest() 
  {
	  
	  WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement dragElement=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropElement=driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(dragElement, dropElement).perform();
		
  }
}
