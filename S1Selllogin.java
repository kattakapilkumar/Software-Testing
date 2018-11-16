package aslogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1Selllogin{
	
	public static void main(String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kkatta\\Downloads\\1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("identifierId")).sendKeys("cse.13a");
		Thread.sleep(1000);
		//driver.findElement(By.id("Email")).sendKeys("c");Thread.sleep(250);
		//driver.findElement(By.id("Email")).sendKeys("s");Thread.sleep(250);
		//driver.findElement(By.id("Email")).sendKeys("e");Thread.sleep(250);
		//driver.findElement(By.id("Email")).sendKeys(".");Thread.sleep(250);
		//driver.findElement(By.id("Email")).sendKeys("1");Thread.sleep(250);
		//driver.findElement(By.id("Email")).sendKeys("3");Thread.sleep(250);
		//driver.findElement(By.id("Email")).sendKeys("a");Thread.sleep(250);
		driver.findElement(By.xpath(" //*[@id=\"identifierNext\"]/content/span")).click();
		Thread.sleep(1000);
		//driver.findElement(By.id("Passwd")).sendKeys("cse.13a@12345");
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("cse13a@12345");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		//driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[2]/div[4]/div[1]/a/span")).click();
		Thread.sleep(1000);
		String str1=driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[2]/div[4]/div[2]/div[1]/div/div[1]")).getText();
		//System.out.println(verify);
		String str2="students cse";
		if(str1.equals(str2))
			System.out.println("LOGIN VERIFIED");
		else
			System.out.println("LOGIN FAILED");
		
		driver.close();
	
	}

}