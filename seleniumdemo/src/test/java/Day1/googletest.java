package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	String actualTitle =driver.getTitle();
	
	String expectedTitle = "Googles";
	
/*	if(actualTitle.equalsIgnoreCase(expectedTitle))
	{
		System.out.println("As expected");
	}
	else
		System.out.println("Title not match");
	
	
    String currentURL =   driver.getCurrentUrl();
    String expectedURL = "www.google.com";
    
    if(currentURL.equalsIgnoreCase(expectedURL))
	{
		System.out.println("As expected");
	}
	else
		System.out.println("URL not match"); */
	
	  String pagesource =  driver.getPageSource();
	  System.out.println(pagesource);
	  
	 // driver.close();
	    driver.quit();
    
	
	}

}
