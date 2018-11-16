package complex3;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class C3advancephase {

		
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\kkatta\\Downloads\\1\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fsettl")).click();
		driver.findElement(By.xpath("//*[@id='advsl']/a")).click();
		driver.findElement(By.xpath("//*[@id='_aKg']")).sendKeys("opentext");
		driver.findElement(By.xpath("//*[@id='_bKg']")).sendKeys("enterprise");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/form/div[5]/div[9]/div[2]/input")).click();
		
		List <WebElement> alllinks = driver.findElements(By.xpath("//*[@id='rso']//h3/a"));
		
		int count=0;
		for(WebElement i: alllinks)
		{
			System.out.println(i.getText());
			
			if((i.getText().contains("OpenText") ||i.getText().contains("OPENTEXT") ||  i.getText().contains("Opentext") )&& !(i.getText().contains("enterprise")))
				count++;
		}
		System.out.println( );
		if(count==alllinks.size())
			System.out.println("ALL LINKS CONTAIN OPENTEXT");
		
		else
			System.out.println("ALL LINKS DOES NOT CONTAIN OPENTEXT");
		driver.close();
	}
	}



