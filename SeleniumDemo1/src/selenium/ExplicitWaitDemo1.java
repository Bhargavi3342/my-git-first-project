package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitDemo1
{
	
  @Test
  public void ExplicitWaitTest() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
      WebElement CheckBox = driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_TG_D']"));
      CheckBox.click();
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
  //    WebDriverWait wait = new WebDriverWait(driver, 30 ); // this is bellow 4 version
      wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id='ContentHolder_lbModels_10_D']"))));
      
      
      WebElement model10 = driver.findElement(By.xpath("//*[@id='ContentHolder_lbModels_10_D']"));
      model10.click();
  
  }
}
