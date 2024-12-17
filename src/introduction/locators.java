package introduction;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class locators {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new FirefoxDriver();
				System.setProperty("webdriver.Firefox.driver", "C:\\Users\\prasa\\Documents\\geckodriver-v0.34.0-win64.exe");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
				
				driver.findElement(By.id("inputUsername")).sendKeys("Pooja");
				
				driver.findElement(By.name("inputPassword")).sendKeys("hello123");
				
				driver.findElement(By.className("signInBtn")).click();
				
			System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
			
			driver.findElement(By.linkText("Forgot your password?")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sam");
			
			driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sam@sa.com");
			
			driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
			
			driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sam@gmail.com");
			
			driver.findElement(By.xpath("//form/input[3]")).sendKeys("9809878909");
			
			driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
			
			
			System.out.println(driver.findElement(By.cssSelector("form p")).getText());
			
			driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Pooja");//Constructing cssselector using ID
			
			driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");//using partialtext
			
			driver.findElement(By.id("chkboxOne")).click();
			
			//driver.findElement(By.cssSelector("button.signInBtn")).click();
			driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
			
			
			//driver.findElement(By.xpath("//button[contains(@class,'go-to-login-btn')]")).click();
			

			
			
			
	}

}
