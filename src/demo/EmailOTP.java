package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailOTP
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://testdbtapp.mahaitgov.in/RegistrationLogin/RegistrationLogin");
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("lawon10208@anomgo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"btnGetOTP_Email\"]")).click();
}
}