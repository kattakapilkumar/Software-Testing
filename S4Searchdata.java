package simples4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class S4Searchdata {
	
	public static void main(String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kkatta\\Downloads\\1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.id("lst-ib")).sendKeys("opentext");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"sbse0\"]/div[2]")).click();
		Thread.sleep(1000);
		String str1=driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/h3/a")).getText();
		String str2="OpenText: The Leader in Enterprise Information Management";
		if(str1.equals(str2))
		{
			System.out.println("link name is correct");
		}
		else
		{
			System.out.println("link name does not exits");
		}
		
		driver.close();
	}
}
