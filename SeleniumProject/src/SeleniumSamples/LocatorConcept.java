package SeleniumSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "V:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //Launch Chrome
		
		driver.get("https://reg.ebay.com/reg/PartialReg?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fwww.ebay.com%2F&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fwww.ebay.com%252F");
		
		//1.id
		driver.findElement(By.id("firstname")).sendKeys("VimridhSai");
		driver.findElement(By.id("lastname")).sendKeys("Marimuthu");
		//2.name
		driver.findElement(By.name("email")).sendKeys("vidhyasai3003@gmail.com");
		driver.findElement(By.id("PASSWORD")).sendKeys("Test123");
		//3.class name
		driver.findElement(By.className("btn btn--primary")).click();
		
		//link text
		
		driver.findElement(By.linkText("Create a business account")).click();
		
		
		
		
		
		
		
		

	}

}
