import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo2
{

	public static void main(String[] args) 
	{
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.calculator.net/mortgage-calculator.html");
        WebElement CheckBoxDemo2Element = driver.findElement(By.xpath("//*[@id='content']/div[4]/div/table/tbody/tr[6]/td/label/span"));
        
        boolean CheckBoxDemo2ElementDisplayed = CheckBoxDemo2Element.isDisplayed();
        if(CheckBoxDemo2ElementDisplayed==true)
        {
        	System.out.println("CheckBoxDemo2 is Displayed");
        }
        else
        {
			System.out.println("CheckBoxDemo2 is not Displayed");
		}
        boolean CheckBoxDemo2ElementEnabled = CheckBoxDemo2Element.isEnabled();
        if(CheckBoxDemo2ElementEnabled==true)
        {
        	System.out.println("CheckBoxDemo2 is Enabled");
        }
        else
        {
			System.out.println("CheckBoxDemo2 is not Enabled");
		}
        boolean CheckBoxDemo2Elementselected = CheckBoxDemo2Element.isSelected();
        if(CheckBoxDemo2Elementselected==true)
        {
        	System.out.println("CheckBoxDemo2 is selected");
        }
        else
        {
			System.out.println("CheckBoxDemo2 is not selected");
		}
        CheckBoxDemo2Element.click();
	}

	}


