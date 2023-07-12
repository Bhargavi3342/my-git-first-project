package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo1
{
	
  @Test
  public void funA()
  {
	  System.out.println("funA of HardAssertionDemo1");
	  
	  String expectedData = "RBG";
	  String actualData = "RBG";
	  Assert.assertEquals(actualData, expectedData);
	  System.out.println("funA Done");
  }
  
  @Test
  public void funB()
  {
	  System.out.println("funA of HardAssertionDemo1");
	  
	  String expectedData = "RBG";
	  String actualData = "RBG technologies";
	  Assert.assertEquals(actualData,expectedData);
	  System.out.println("funB Done");
  }
  
  @Test
  public void funC()
  {
	  System.out.println("funA of HardAssertionDemo1");
	  
	  String expectedData = "RBG technologies";
	  String actualData = "RBG";
	  Assert.assertNotEquals(actualData,expectedData);
	  System.out.println("funC Done");
  }
  
  @Test
  public void funD()
  {
	  System.out.println("funA of HardAssertionDemo1");
	  
	  String expectedData = "RBG";
	  String actualData = "RBG";
	  Assert.assertNotEquals(actualData, expectedData);
	  System.out.println("funD Done");
  }
  
  @Test
  public void funE()
  {
	  System.out.println("funE of HardAssertionDemo1");
	  
	  Assert.assertTrue(true);
	  System.out.println("funE Done");
	  
	  
  }
  
  @Test
  public void funF()
  {
	  System.out.println("funF of HardAssertionDemo1");
	  
	  Assert.assertTrue(false);
	  System.out.println("funF Done");
	  
	  
  }
  
  @Test
  public void funG()
  {
	  System.out.println("funG of HardAssertionDemo1");
	  
	  Assert.assertFalse(true);
	  System.out.println("funG Done");
	  
  }
  
  @Test
  public void funH()
  {
	  System.out.println("funH of HardAssertionDemo1");
	  
	  Assert.assertFalse(true);
	  System.out.println("funH Done");
  }
}
	  
	  
  
  

