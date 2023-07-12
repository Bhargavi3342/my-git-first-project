package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo2
{
	
  @Test
  public void funA() 
  {
      System.out.println("funA of HardAssertionDemo2");
	  
	  String expectedData = "RBG";
	  String actualData = "RBG";
	  Assert.assertEquals(actualData, expectedData, "Data is not matching");
	  System.out.println("funA Done");
	  
  }
  @Test
  public void funB()
  {
	  System.out.println("funB of HardAssertionDemo2");
	  
	  String expectedData = "RBG";
	  String actualData = "RBG";
	  Assert.assertEquals(actualData, expectedData, "Data is not matching");
	  System.out.println("funB Done");
  }
}
