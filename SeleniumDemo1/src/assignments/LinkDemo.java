package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkDemo
{

	@Test
	public void LinkDemoTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/news");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		for(WebElement link : allLinks)
		{
			System.out.println(link.getText()+" "+link.getAttribute("href"));
		}
		
	}

}
