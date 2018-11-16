package medium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class M1Errorsign {
	
	
	public static void main(String args[]) throws InterruptedException{

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kkatta\\Downloads\\1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		
		
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("identifierId")).sendKeys("cse.13123d");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(1000);
		
		String str1 = driver.findElement(By.xpath(".//*[@id='view_container']/form/div[2]/div/div[1]/div[1]/div/div[2]/div[2]")).getText();
		String str2 = "Couldn't find your Google Account";
	
		if(str1.equals(str2))
			{
					System.out.println("error message is displayed corretly when invalid username is given");
			}
		else
		{
			System.out.println("erroe messages are displayed incorrectly");
		}
	
		
		driver.navigate().refresh();
		
		driver.findElement(By.id("identifierId")).sendKeys("cse.13a");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("cse13a@1sdf2345");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		Thread.sleep(1000);
		
		
		String str3 = driver.findElement(By.xpath("//*[@id=\"password\"]/div[2]/div[2]")).getText();
		System.out.println(str3);
		//String str4 = "Wrong password. Try again";
		
		/*if(str3 == "Wrong password. Try again.")
			{
				System.out.println("error message is displayed corretly when invalid password is given");
			}
		else
			{
				System.out.println("erroe message  displayed incorrectly");
			}
		*/
		
		
		driver.close();
	}
}
