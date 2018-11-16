package urlverify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class S5Urlchecking {
	
	public static void main(String args[]) throws InterruptedException{

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kkatta\\Downloads\\1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("lst-ib")).sendKeys("atpworldtour");
		Thread.sleep(1000);
	
		
		driver.findElement(By.xpath("//*[@id=\"sbse0\"]/div[2]")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/h3/a")).click();
		Thread.sleep(1000);

		String str1=driver.getCurrentUrl();
		String str2="http://www.atpworldtour.com/";
		
		if(str1.equals(str2))
		{
			System.out.println("URL MATCHED");
		}
		else
		{
			System.out.println("URL IS NOT MATCHING");
		}
	
		driver.close();
	}
}