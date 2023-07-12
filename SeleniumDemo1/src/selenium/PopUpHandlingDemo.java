package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class PopUpHandlingDemo {
  @Test
  public void f() 
  {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		WebElement learnMoreelement= driver.findElement(By.xpath("//a[@aria-label='Learn more about using Guest mode']"));
		learnMoreelement.click();

		Set<String> windowsId=driver.getWindowHandles();
		Iterator<String> windowsList=windowsId.iterator();
		String parentWindowId=windowsList.next();
		String childWindowId=windowsList.next();
		driver.switchTo().window(childWindowId);

		String getTextElement=driver.findElement(By.xpath("//h1[text()='Browse Chrome as a guest']")).getText();
		System.out.println(getTextElement);
		
		System.out.println("Done");




	
  }
}
