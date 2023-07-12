package testNGDemo;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGDemo3
{
  @Test
  public void funA() 
  {
	  System.out.println("funA of TestNGDemo3");
  }
  @Test
  public void funB() 
  {
	  System.out.println(0/0);
  }
  @Test
  public void funC() 
  {
	  System.out.println("funC of TestNGDemo3");
	//  throw new Exception();
	  throw new SkipException("TestNG SkipException");
  }
  @Test(enabled=false)
  public void funD() 
  {
	  System.out.println("funD of TestNGDemo3");
  }
}
