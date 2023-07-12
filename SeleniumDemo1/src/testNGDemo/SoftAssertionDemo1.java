package testNGDemo;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo1 
{
	
  @Test
  public void funA() 
  {
	  System.out.println("funA of SoftAssertionDemo1");
	  
	  SoftAssert sAssert = new SoftAssert();
	  sAssert.assertEquals("RBG","RBG");
	  System.out.println("TestCase1 Done");
	  
	  sAssert.assertEquals("RBG","technologies");
	  System.out.println("TestCase2 Done");
	  
	  sAssert.assertNotEquals("RBG","technologies");
	  System.out.println("TestCase3 Done");
	  
	  sAssert.assertNotEquals("RBG","RBG");
	  System.out.println("TestCase4 Done");
	  
	  sAssert.assertAll();
	  System.out.println("TestCase5 Done");
  }
  
}
