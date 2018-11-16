package complex5;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class C5iamfeelinglucky {
	

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kkatta\\Downloads\\1\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http:\\www.google.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("lst-ib")).sendKeys("opentext");
	Thread.sleep(2000);
	WebElement dropDown=driver.findElement(By.xpath("//*[@id='sbse0']/div[2]"));
	Actions action=new Actions(driver);
	action.moveToElement(dropDown).build().perform();
	Thread.sleep(3000);
	//dropDown.findElement(By.id("sbse0")).findElement(By.tagName("a")).click();
	String name=driver.findElement(By.className("sbqs_a")).getText();
	Thread.sleep(1000);
	System.out.println(name+"is opened for link "+dropDown.getText());
	driver.findElement(By.className("sbqs_a")).click();
	System.out.println("And the url of the page is "+driver.getCurrentUrl());

	Thread.sleep(1000);
	driver.close();
	}
}