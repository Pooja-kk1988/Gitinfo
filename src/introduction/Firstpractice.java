package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firstpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\prasa\\Documents\\geckodriver-v0.34.0-win64.exe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyaca");
		driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
		driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		driver.findElement(By.cssSelector("button.signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9876543212");
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		
		//driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
		driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		
		driver.close();


	}

}
