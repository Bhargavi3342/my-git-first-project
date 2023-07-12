package selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWaitDemo2
{
	
  @Test
  public void ImplicitWaitTest() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
      WebElement checkBox = driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_TG_DRBG']"));
      checkBox.click();
      WebElement Model10 = driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_10_D']"));
      Model10.click();
      
      WebElement Bluetooth = driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_Bluetooth_D']"));
      Bluetooth.click();
      WebElement model11 = driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_11_D']"));
      model11.click();
  }
}
