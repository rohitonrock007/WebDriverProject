package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FBlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe" );//chrome
		WebDriver driver = new ChromeDriver();

//		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");//firefox

//		WebDriver driver = new FirefoxDriver();


				driver.get("https://www.facebook.com/");
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
				
//				
				
				WebElement Username = driver.findElement(By.xpath("//Input[@name='email']"));
				WebElement Password = driver.findElement(By.xpath("//Input[@id='pass']"));
				WebElement Loginbtn = driver.findElement(By.xpath("//button[@name='login']"));
				Username.sendKeys("xyz@gmail.com");
				Password.sendKeys("Abc@12345");
				Loginbtn.click();
				
	}

}
