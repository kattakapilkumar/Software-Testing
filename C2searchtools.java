package complex2;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2searchtools {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kkatta\\Downloads\\1\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("lst-ib")).sendKeys("opentext",Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.id("hdtb-tls")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='hdtbMenus']/div/div[4]/div")).click();
		
		
		driver.findElement(By.xpath("//*[@id='li_1']/a")).click();
		Thread.sleep(2000);
		
		List <WebElement> alllinks = driver.findElements(By.xpath("//*[@id='rso']//h3/a"));
		
		int count=0,size=alllinks.size();
		for(WebElement i: alllinks)
		{
			if(i.getText().length()>0)
			System.out.println(i.getText());
			if(i.getText().contains("OpenText"))
				count++;
			if(i.getText().length()==0)
					size--;
		}

		if(count==size)
			System.out.println("ALL LINKS CONTAINS OPENTEXT");
		
		else
			System.out.println("SORRY ALL LINKS DOESN'T CONTAIN OPENTEXT");
			
		driver.close();
	}

}
