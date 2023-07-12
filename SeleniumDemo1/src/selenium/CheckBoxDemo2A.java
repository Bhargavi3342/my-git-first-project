package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxDemo2A
{

	@Test
	public void CheckBoxTest()
	{

        WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.calculator.net/mortgage-calculator.html");
        WebElement CheckBoxDemo2AElement = driver.findElement(By.xpath("//*[@id='caddoptional']"));
        WebElement CheckBoxDemo2ADisplayedElement = driver.findElement(By.xpath("//span[@class='cbmark'][3]"));
        boolean CheckBoxDemo2AElementDisplayed = CheckBoxDemo2AElement.isDisplayed();
        if(CheckBoxDemo2AElementDisplayed==true)
        {
        	System.out.println("CheckBoxDemo2A is Displayed");
        }
        else
        {
			System.out.println("CheckBoxDemo2A is not Displayed");
		}
        
        boolean CheckBoxDemo2AElementEnabled = CheckBoxDemo2AElement.isEnabled();
        if(CheckBoxDemo2AElementEnabled==true)
        {
        	System.out.println("CheckBoxDemo2A is Enabled");
        }
        else
        {
			System.out.println("CheckBoxDemo2A is not Enabled");
		}
        
        boolean CheckBoxDemo2AElementselected = CheckBoxDemo2AElement.isSelected();
        if(CheckBoxDemo2AElementselected==true)
        {
        	System.out.println("CheckBoxDemo2A is selected");
        }
        else
        {
			System.out.println("CheckBoxDemo2A is not selected");
		}
        CheckBoxDemo2ADisplayedElement.click();
        
        boolean CheckBoxDemo2Aselected1= CheckBoxDemo2AElement.isSelected();
        if (CheckBoxDemo2Aselected1==true) 
        {
			System.out.println("CheckBoxDemo2A is selected1");
		}
        else
        {
			System.out.println("CheckBoxDemo2A is selected1");
		}
       
	}

	}


