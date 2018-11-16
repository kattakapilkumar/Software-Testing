package complex1;



import java.util.List;


import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;

public class C1firstoccurrence {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kkatta\\Downloads\\1\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("lst-ib")).sendKeys("opentext",Keys.ENTER);
	Thread.sleep(5000);
	
	List <WebElement> alllinks = driver.findElements(By.xpath("//*[@id='rso']//h3/a"));
	
	for(WebElement links:alllinks)
		if(links.getText().indexOf("OpenText")!=0)
		{
		   links.click();
		   break;
		}
	System.out.println("NAVIGATED TO CORRECT URl");
	driver.close();
	}
	

}
