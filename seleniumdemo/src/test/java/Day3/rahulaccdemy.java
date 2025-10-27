package Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rahulaccdemy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice");

		//WebElement uname =driver.findElement(By.id("inputUsername"));
		
		//uname.sendKeys("STAD");
		
	//	WebElement password = driver.findElement(By.name("inputPassword"));
		//password.sendKeys("123");
		
		
	//	WebElement password = driver.findElement(By.tagName("input[placeholder='Username']"));
	//	password.sendKeys("123");
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("12345");
		
	//WebElement h1 =	driver.findElement(By.tagName("h1"));
	//String text = h1.getText();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Bhagyashree");
	
	//System.out.println(text);
	
	
		
		
		//driver.findElement(By.linkText("Forgot your password?")).click();
	
	     driver.findElement(By.partialLinkText("Forgot")).click();
		
		Thread.sleep(2000);
		
	//	driver.findElement(By.className("go-to-login-btn")).click();
		
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		 for (WebElement links : link) {
	         System.out.println("Link text: " + links.getText());
		

		
		
		
		
		
	}

}
	
}
