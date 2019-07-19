package SeleniumSamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//1.Firefox driver
		//geko driver
		
		/* System.setProperty("webdriver.gecko.driver", "V:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); //launch Firefox
		
		driver.get("http://www.google.com"); //Enter URL */
		
		//2.Chrome browser
		
		System.setProperty("webdriver.chrome.driver", "V:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //Launch Chrome
		
		driver.get("http://www.google.com"); //Enter URL
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//validation point
		
		if(title.equals("Google")) {
			System.out.println("Correct title");
		} else
		{
			System.out.println("Incorrect Title");
		}
		
		System.out.println(driver.getCurrentUrl());
		driver.quit(); // to close or quit the browser
		
		
		
		
		
		
		
		
		

	}

}
