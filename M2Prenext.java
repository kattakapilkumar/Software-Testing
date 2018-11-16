package medium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class M2Prenext {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kkatta\\Downloads\\1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");

		driver.findElement(By.id("lst-ib")).sendKeys("atpworldtour");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"sbse0\"]/div[2]")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//*[@id=\"pnnext\"]/span[2]")).click();
		Thread.sleep(1000);
	
	
		int current_page_no =Integer.parseInt(driver.findElement(By.xpath(".//*[@id='nav']/tbody/tr/td[3]")).getText());
		Thread.sleep(1000);
		//System.out.println(current_page_no);
		System.out.println(current_page_no);
	
		
		driver.findElement(By.xpath("//*[@id=\"nav\"]/tbody/tr/td[4]/a")).click();
		Thread.sleep(1000);
		
		
		int current_page_no1=Integer.parseInt(driver.findElement(By.xpath("//*[@id=\"nav\"]/tbody/tr/td[4]")).getText());
		Thread.sleep(1000);
		System.out.println(current_page_no1);
		
		driver.findElement(By.xpath("//*[@id=\"pnprev\"]/span[2]")).click();
		Thread.sleep(1000);
		
		int pres_page_no=Integer.parseInt(driver.findElement(By.xpath("//*[@id=\"nav\"]/tbody/tr/td[3]")).getText());
		Thread.sleep(1000);
		System.out.println(pres_page_no);
		
		
		
		//driver.close();
	}
}
	
