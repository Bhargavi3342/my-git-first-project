package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotationDemo2
{
	
  @Test
  public void funA() 
  {
	  System.out.println("funA of TestNGAnnotationDemo2");
  }
  
  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("afterMethod of TestNGAnnotationDemo2");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("afterClass of TestNGAnnotationDemo2");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("afterTest of TestNGAnnotationDemo2");
  }

  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("afterSuite of TestNGAnnotationDemo2");
  }

}
