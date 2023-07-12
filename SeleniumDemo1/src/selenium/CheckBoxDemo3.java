package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxDemo3
{
 
	@Test
	public void CheckBoxTest()
	{

        WebDriver driver=new ChromeDriver();
		
		driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
        WebElement CheckBoxDemo3Element = driver.findElement(By.xpath("//input[@type='checkbox'][15]"));
        boolean CheckBoxDemo3ElementDisplayed = CheckBoxDemo3Element.isDisplayed();
        if(CheckBoxDemo3ElementDisplayed==true)
        {
        	System.out.println("CheckBoxDemo3 is Displayed");
        }
        else
        {
			System.out.println("CheckBoxDemo3 is not Displayed");
		}
        
        boolean CheckBoxDemo3ElementEnabled = CheckBoxDemo3Element.isEnabled();
        if(CheckBoxDemo3ElementEnabled==true)
        {
        	System.out.println("CheckBoxDemo3 is Enabled");
        }
        else
        {
			System.out.println("CheckBoxDemo3 is not Enabled");
		}
        
        boolean CheckBoxDemo3Elementselected = CheckBoxDemo3Element.isSelected();
        if(CheckBoxDemo3Elementselected==true)
        {
        	System.out.println("CheckBoxDemo3 is selected");
        }
        else
        {
			System.out.println("CheckBoxDemo3 is not selected");
		}
        CheckBoxDemo3Element.click();
	}

	}


