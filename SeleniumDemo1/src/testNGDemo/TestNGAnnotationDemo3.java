package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

public class TestNGAnnotationDemo3
{
	
  @Test
  public void funA()
  {
	  System.out.println("funA of TestNGAnnotationDemo3");
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("beforeMethod of TestNGAnnotationDemo3");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("beforeClass of TestNGAnnotationDemo3");
  }

  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("beforeTest of TestNGAnnotationDemo3");
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("beforeSuite of TestNGAnnotationDemo3");
  }

}
