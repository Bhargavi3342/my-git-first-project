package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotationDemo4
{
	
  @Test
  public void funA()
  {
	  System.out.println("funA of TestNGAnnotationDemo4");
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("beforeMethod of TestNGAnnotationDemo4");  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("afterMethod of TestNGAnnotationDemo4");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("beforeClass of TestNGAnnotationDemo4");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("afterClass of TestNGAnnotationDemo4");
  }

  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("beforeTest of TestNGAnnotationDemo4");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("afterTest of TestNGAnnotationDemo4");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("beforeSuite of TestNGAnnotationDemo4");
  }

  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("afterSuite of TestNGAnnotationDemo4");
  }

}
