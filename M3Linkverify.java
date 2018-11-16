package medium3;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M3Linkverify {
	
	public static void main(String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kkatta\\Downloads\\1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	
		//first link 
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("atpworldtour",Keys.ENTER);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[4]/div/div[4]/div/div/h3/a")).click();
		String url_of_link1=driver.getCurrentUrl();
		System.out.println(url_of_link1);
		//Thread.sleep(1000);
		
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).clear();
		
		//second  link
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("opentext",Keys.ENTER);
		Thread.sleep(500);
		
		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div/div[8]/div/div/h3/a")).click();
		String url_of_link2=driver.getCurrentUrl();
		System.out.println(url_of_link2);
		//Thread.sleep(1000);
		
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).clear();
		
		
		//third link
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("microsoft",Keys.ENTER);
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[4]/div/div[5]/div/div/h3/a")).click();
		String url_of_link3=driver.getCurrentUrl();
		System.out.println(url_of_link3);
		Thread.sleep(1000);
		
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).clear();
		
		
		
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).clear();
		
		//fourth link
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("yahoo",Keys.ENTER);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[4]/div/div[5]/div/div/h3/a")).click();
		Thread.sleep(1000);
		
		String url_of_link4=driver.getCurrentUrl();
		System.out.println(url_of_link4);
		Thread.sleep(1000);
		
		//fifth link
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("google",Keys.ENTER);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[4]/div/div[7]/div/div/h3/a")).click();
		Thread.sleep(1000);
		
		String url_of_link5=driver.getCurrentUrl();
		System.out.println(url_of_link5);
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).clear();
		driver.close();
		 
	}
}
