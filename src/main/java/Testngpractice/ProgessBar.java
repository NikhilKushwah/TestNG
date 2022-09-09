package Testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProgessBar
{
	@Test
	public void  ProgressBar() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.kushwah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/progress-bar");
		
		driver.findElement(By.xpath("//button[@id='startStopButton']")).click();
		Thread.sleep(5000);		
		
		driver.findElement(By.xpath("//button[@id='startStopButton']")).click();
		
	}

}
