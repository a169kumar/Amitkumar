package HandlingDropDown;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertClass {
  WebDriver driver;
  
	SoftAssert a= new SoftAssert();
	@Test
	public void test1() {
		Assert.assertEquals(12, 13);
		driver.getTitle();
	}
	@Test
	public void test2() {
	//	Assert.assertEquals(13, 13,"This is not matched");
		Assert.assertTrue((9>10),"This is not matched");
		
	}
	
}
