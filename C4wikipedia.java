package complex4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C4wikipedia {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kkatta\\Downloads\\1\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("lst-ib")).sendKeys("opentext",Keys.ENTER);
		Thread.sleep(2000);
		
		List <WebElement> alllinks = driver.findElements(By.xpath("//*[@id='rso']//h3/a"));
		String url = null;
		for(WebElement links:alllinks)
			if(links.getText().contains("Wikipedia"))
			{
				 links.click();
				 Thread.sleep(2500);
				 url=driver.getCurrentUrl();
				 break;
			}
		
		String org="https://en.wikipedia.org/wiki/OpenText";
		
		if(url.equals(org))
			System.out.println("LINK NAVIGATED TO WIKIPEDIA");
		else
			System.out.println("LINK DOESN'T NAVIGATED TO WIKIPEDIA");
		
		driver.close();
		
	}

}
