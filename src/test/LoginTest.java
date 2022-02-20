package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver", "chromedriver.exe" );//chrome
//WebDriver driver = new ChromeDriver();

System.setProperty("webdriver.gecko.driver", "geckodriver.exe");//firefox

WebDriver driver = new FirefoxDriver();


		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
//		WebElement Loginlink = driver.findElement(By.linkText("Log in"));//fIrst locator
		WebElement Loginlink = driver.findElement(By.className("login"));
		Loginlink.click();
		WebElement Username = driver.findElement(By.name("user_login"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement Loginbtn = driver.findElement(By.name("btn_login"));
		Username.sendKeys("xyz@gmail.com");
		Password.sendKeys("Abc@12345");
		Loginbtn.click();
		
		WebElement Rememberme = driver.findElement(By.className("rememberMe"));
		Rememberme.click();
		
		//Verify the Error
		
		WebElement Errormsg = driver.findElement(By.id("msg_box"));
		
		String ActualError = Errormsg.getText();
		String ExpectedError = "The email or password you have entered is invalid.";
		if(ActualError.equals(ExpectedError)) {
			System.out.println("TC Passed");
			
		}else {
			System.out.println("TC Failed");
		}
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are " + links.size());
		
		for(WebElement elm : links) {         //iterarting//for each loop
			System.out.println(elm.getAttribute("href"));
		}
		
//		driver.close();
	}

}
