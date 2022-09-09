package Testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class practice 
{
	
	@Test
	public void Usercreation() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.kushwah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/login");
		
		driver.findElement(By.xpath("//button[@id='newUser']")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Nikhil");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Kushwah");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("nikhil");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Nikhil@123");
		driver.findElement(By.xpath("//button[@id='register']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='gotologin']")).click();
	}
	
	@Test
	public void DragnDrop()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.kushwah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		
		Actions act=new Actions(driver);
		act.clickAndHold(source).moveToElement(target).release().build().perform();
		
		
		driver.findElement(By.xpath("//a[@id='droppableExample-tab-preventPropogation']")).click();
		
		WebElement source2=driver.findElement(By.xpath("//div[@id='dragBox']"));
		WebElement target2=driver.findElement(By.xpath("//div[@id='greedyDropBoxInner']"));
		
		act.clickAndHold(source2).moveToElement(target2).release().build().perform();
	}
	
	@Test
	public void Selections()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.kushwah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/selectable");
		
		driver.findElement(By.xpath("//li[text()='Cras justo odio']")).click();
		driver.findElement(By.xpath("//li[text()='Porta ac consectetur ac']")).click();
	}

	

}
