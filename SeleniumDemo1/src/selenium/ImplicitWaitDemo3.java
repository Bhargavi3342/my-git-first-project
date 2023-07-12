package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWaitDemo3 
{
	
  @Test
  public void ImplicitWaitTest() 
  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


		WebElement checkBoxElement= driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));

		checkBoxElement.click();

		WebElement checkBoxChildElement= driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_10_D']"));
		checkBoxChildElement.click();

		WebElement checkBoxBluetoothElement= driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_Bluetooth_D']"));

		checkBoxBluetoothElement.click();

		WebElement checkBoxModel11Element= driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels']"));
		checkBoxModel11Element.click();


  }
}
