package HandlingDropDown;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;





public class CaptureScreenShot {
	public static void main (String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","F:\\Selenium Library\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver", "F:\\Selenium Library\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.facebook.com");
		TakesScreenshot sc= (TakesScreenshot)driver;
		File fi=sc.getScreenshotAs(OutputType.FILE);
		
       Files.copy(fi, new File("./k.jpg"));
		//Files.copy(fi, new File(""));
       
}
}
