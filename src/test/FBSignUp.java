package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe" );//chrome
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		WebElement Create = driver.findElement(By.xpath("//*[text()='Create New Account']"));
		Create.click();
		
		Thread.sleep(5000);
		WebElement FirstName = driver.findElement(By.cssSelector("input[name=firstname]"));
		WebElement LastName = driver.findElement(By.cssSelector("input[name=lastname]"));
		WebElement Mobile = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		WebElement Newpswd = driver.findElement(By.xpath("//input[@data-type='password']"));
		FirstName.sendKeys("Rohit");
		LastName.sendKeys("Sharma");
		Mobile.sendKeys("8010414500");
		Newpswd.sendKeys("*****");
	
		
String strGender = "Male";
        
        //input[@value='1']
        //input[@value='2']
        //input[@value='-1']
        
        //label[text()='Male']/following-sibling::input
        //label[text()='Female']/following-sibling::input
        //label[text()='Custom']/following-sibling::input
        
        String genXpath = "//label[text()='" + strGender + "']/following-sibling::input";  //Dynamic Xpath(Radio Button)
        
        WebElement gen = driver.findElement(By.xpath(genXpath));
        gen.click();
	
List<WebElement> Months = driver.findElements(By.xpath("//select[@title='Month']/option"));//dropdown
        
        for(WebElement elm : Months) {
            
            System.out.println(elm.getText());
            
          }
        
	WebElement CurrMonth = driver.findElement(By.xpath("//select[@title='Month']/option[@selected='1']"));
		
		System.out.println("Current Month " + CurrMonth.getText());
		
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select ddDay = new Select(Day);
		ddDay.selectByVisibleText("25");
		
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select ddMonth = new Select(Month);
		ddMonth.selectByVisibleText("Jul");
		
		WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select ddYear = new Select(Year);
		ddYear.selectByVisibleText("1990");
        
        
        driver.close();
	}

}
