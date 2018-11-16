package simple2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S2Signout {
	
	public static void main(String args[]) throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\kkatta\\Downloads\\1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	driver.findElement(By.linkText("Sign in")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("identifierId")).sendKeys("cse.13a");
	Thread.sleep(1000);
	driver.findElement(By.xpath(" //*[@id=\"identifierNext\"]/content/span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("cse13a@12345");
	driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[2]/div[4]/div[1]/a/span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
	String str1=driver.findElement(By.xpath("//*[@id=\"gb_70\"]")).getText();
	String str2="Sign in";
	if(str1.equals(str2))
		System.out.println("LOGGED OUT SUCCESSFULLY");
	else
		System.out.println("LOGOUT FAILED");
	

	
	
	
	
	
	driver.close();
	}
}
