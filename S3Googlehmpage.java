package samples3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S3Googlehmpage {
	
public static void main(String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kkatta\\Downloads\\1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(1000); 
		
		boolean dis=driver.findElement(By.xpath(".//*[@id='sb_ifc0']")).isDisplayed();
		if(dis)
		{
			System.out.println("GOOGLE SEARCH BOX IS PRESENT");
		}
		else
		{
			System.out.println("GOOGLLE SEARCH BOX IX NOT PRESENT");
		}
		
		String str1=driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).getAttribute("value");
		String str3=driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[2]")).getAttribute("value");
		
		//WE CAN USE NAME also instead of x-path.
		//String g_search=driver.findElement(By.name("btnK")).getAttribute("value");
		//String g_lucky=driver.findElement(By.name("btnI")).getAttribute("value");
		
		String str2="Google Search";
		if(str1.equals(str2))
			System.out.println("GOOGLE SEARCH BUTTON IS PRESENT");
		else
			System.out.println("GOOGLE SEARCH IS NOT FOUND");
		
		
		String str4="I'm Feeling Lucky";
		if(str3.equals(str4))
			System.out.println("I'M FEELING LUCKY BUTTON IS PRESENT");
		else
			System.out.println("I'M FEELING LUCKY BUTTON IS NOT FOUND");

		
		
		driver.close();

	}
}

