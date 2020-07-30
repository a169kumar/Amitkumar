package HandlingDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectClass {
	
	public static void main (String[] args) {
System.setProperty("webdriver.chrome.driver","F:\\Selenium Library\\chromedriver.exe");
//System.setProperty("webdriver.chrome.driver", "F:\\Selenium Library\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.facebook.com");
	
	Select sl= new Select(driver.findElement(By.id("day")));
List<WebElement > l=	sl.getOptions();
System.out.println(l.size());
     
for(int i=0;i<l.size();i++) {
	System.out.println(l.get(i).getText());
}
}
}