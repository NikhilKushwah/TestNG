package Testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Menu {

	@Test
	public void Menu()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.kushwah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/menu");
		
		WebElement menu= driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		WebElement item=driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(menu).build().perform();
		act.moveToElement(item).build().perform();

	}

}
