package medium4;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class M4Searchsugg {
	
	public static void main(String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kkatta\\Downloads\\1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		
		driver.findElement(By.id("lst-ib")).sendKeys("opentext",Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement idlink=driver.findElement(By.id("brs"));
		String name=idlink.findElement(By.className("card-section")).getText();
	
		
		String name1[]=name.split("\n");
		
		for(int i=0;i<name1.length;i++)
			System.out.println(name1[i]);
		
		
		int count=0;
		for(int i=0;i<name1.length;i++)
			if(name1[i].contains("open text") || name1[i].contains("opentext"))
				count++;
		
		
		if(count==name1.length)
			System.out.println("OPEN TEXT IS PRESENT IN ALL LINKS");
		
		else
			System.out.println("OPEN TEXT IS NOT PRESENT IN ALL LINKS");
				
		driver.close();
	}
}