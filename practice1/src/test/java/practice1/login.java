package practice1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	
	@Test
	
	public void pagelogin()
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\Automation_Selenium\\Libraries\\chromedriver_win32_103\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String pagetitle = driver.getTitle();
		
		
		System.out.println(pagetitle);
		
		driver.close();
		
	}
	
	
	
	

}
