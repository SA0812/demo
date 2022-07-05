package practice1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	
	@Test
	
	@Parameters({"mail","pswrd"})
	
	public void pagelogin(String mail,String pswrd)
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\Automation_Selenium\\Libraries\\chromedriver_win32_103\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.freecrm.com/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		String pagetitle = driver.getTitle();	
		System.out.println(pagetitle);
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(mail);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pswrd);
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		driver.close();
		
	}
	
	
	
	

}
