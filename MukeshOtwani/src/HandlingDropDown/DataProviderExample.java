package HandlingDropDown;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderExample {
	@Test(dataProvider="readData")
	public void createEmployee( String empname, String password, String role, String branch ) throws Throwable {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium Library\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();	
		driver.get("http://primusbank.qedgetech.com/");
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    // driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("//*[@href='Admin_Emp_details.aspx']")).click();
		driver.findElement(By.id("BtnNew")).click();
		driver.findElement(By.id("txtUname")).sendKeys(empname);
		Thread.sleep(2000);
		 //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("txtLpwd")).sendKeys(password);
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("lst_Roles"))).selectByVisibleText(role);
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("lst_Branch"))).selectByVisibleText(branch);
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.findElement(By.id("BtnSubmit")).click();
	
	}
	
	
	
	@DataProvider
	public Object[][]readData() throws Throwable {
	
	FileInputStream fi= new FileInputStream("F:\\Testing SelfParacice Code\\selenium\\ReadExcelFile\\Input\\amit.xlsx");
    Workbook wb= new XSSFWorkbook(fi);
    Sheet s= wb.getSheet("Sheet2");
    int r= s.getLastRowNum();
    System.out.println(r);
    Object data[][]=new Object[r+1][4];
    for(int i=0;i<=r;i++) {
    	data[i][0]=s.getRow(i).getCell(0).getStringCellValue();
    	data[i][1]=s.getRow(i).getCell(1).getStringCellValue();
    	data[i][2]=s.getRow(i).getCell(2).getStringCellValue();
    	data[i][3]=s.getRow(i).getCell(3).getStringCellValue();
    	/*System.out.println(data[i-1][0]);
    	System.out.println(data[i-1][1]);
    	System.out.println(data[i-1][2]);
    	System.out.println(data[i-1][3]);*/
    }
    return data;
}
}
