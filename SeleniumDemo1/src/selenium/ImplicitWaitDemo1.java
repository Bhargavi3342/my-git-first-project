package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWaitDemo1
{
	
  @Test
  public void ImplicitWaitTest()
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	  driver.manage().window().setSize(new Dimension(1000, 1000));
	  driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
      WebElement checkBox = driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_TG_D']"));
      checkBox.click();
     
      WebElement Model10 = driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_10_D']"));
      Model10.click();
      
      WebElement Bluetooth = driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_Bluetooth_D']"));
      Bluetooth.click();
      
      WebElement model11 = driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_11_D']"));
      model11.click();
  }
}
