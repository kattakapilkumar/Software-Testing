package medium5;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class M5Sugglink {

	public static void main(String arg[])  throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\kkatta\\Downloads\\1\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("http://www.google.com");
			driver.manage().window().maximize();
			driver.findElement(By.id("lst-ib")).sendKeys("opentext",Keys.ENTER);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id='brs']/g-section-with-header/div[3]/div[2]/p[4]/a")).click();
			Thread.sleep(2000);
			String text=driver.findElement(By.xpath("//*[@id='lst-ib']")).getAttribute("value");
			
			if(text.equals("open text sap"))
				System.out.println("VERFIED LAST LINK CLICKED");
			
			else
				System.out.println("WRONG LINK");
			
			driver.close();
		}
		
}
	

