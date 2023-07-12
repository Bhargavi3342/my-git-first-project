package testNGDemo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinkDemo1
{
  @Test
  public void BrokenLinkTest() throws IOException
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("file:///C:/Users/bharg/Downloads/BrokenLink1.html");
	  WebElement link = driver.findElement(By.xpath("//a[text()='RBG technologies']"));
	  String attributeValue = link.getAttribute("href");
     
	  URL url= new URL("https://rbgtechnologies.com/");
	  
	  HttpURLConnection connect = (HttpURLConnection)url.openConnection();
	  connect.connect();
	  
	  int responsecode = connect.getResponseCode();
	  System.out.println(responsecode);
	  
  }
}
