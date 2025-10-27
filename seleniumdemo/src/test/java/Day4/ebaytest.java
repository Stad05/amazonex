package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ebaytest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.ebay.com");
		
		driver.manage().window().maximize();
		
	WebElement searchbox =	driver.findElement(By.id("gh-ac"));
	
	Dimension d = searchbox.getSize();
	System.out.println("Height is : "+d.height);
	System.out.println("Width is : "+d.width);
	
	Point p = searchbox.getLocation();
	System.out.println("X is : "+p.x);
	System.out.println("Y is : "+p.y);
	
	boolean d1 = searchbox.isDisplayed();
	System.out.println("Display ? : "+d1);
	
	searchbox.isSelected();
	
	String tag = searchbox.getTagName();
	
	System.out.println("tag name = "+tag);
	
	String css = searchbox.getCssValue("font-family");
	System.out.println("Css value = "+css);
	
	String id = searchbox.getAttribute("id");
	System.out.println("attribute = "+id);

	searchbox.click();
	searchbox.sendKeys("books");
	
	WebElement btn = driver.findElement(By.id("gh-search-btn"));
	boolean b1 = btn.isEnabled();
	System.out.println("Enabled ? : "+b1);
	
	
		
	}

}
