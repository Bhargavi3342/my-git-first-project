package assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertBox 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		  driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

	     driver.findElement(By.xpath("//*[@id='alertBox']")).click();
		  
		  
		 Alert alert = driver.switchTo().alert();
		 String alertMessage = driver.switchTo().alert().getText();
		 
		 System.out.println(alertMessage);
		 Thread.sleep(3000);
		 alert.accept();
		 driver.quit();
		   

	}

}
