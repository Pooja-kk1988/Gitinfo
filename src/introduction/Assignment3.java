package introduction;

import java.time.Duration;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.Firefox.driver", "C:\\Users\\prasa\\Documents\\geckodriver-v0.34.0-win64.exe");
		// driver.manage().window().maximize();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rahulshettyacademy ");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("learning");

		// driver.findElement(By.xpath("//div[@class='form-check-inline']/label[2]
		// //span[@class='checkmark']")).click();
		//driver.findElement(By.cssSelector("input[value='user']")).click();
		driver.findElement(By.xpath("//label[2]//span[@class='checkmark']")).click();

		/*
		 * // Thread.sleep(1000); Alert alert=driver.switchTo().alert();
		 * System.out.println(alert.getText()); //driver.switchTo().alert().accept();
		 * driver.switchTo().alert().getText(); driver.switchTo().alert().accept();
		 */

		WebDriverWait waitFor = new WebDriverWait(driver, Duration.ofSeconds(5));
		waitFor.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#okayBtn")));

		driver.findElement(By.cssSelector("#okayBtn")).click();
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
		 * 
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		 * 
		 * driver.findElement(By.id("okayBtn")).click();
		 */

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form-control")));

		Thread.sleep(1000);
		WebElement option = driver.findElement(By.xpath("//select[@class='form-control']"));

		Select dropdown = new Select(option);
		dropdown.selectByIndex(0);

		// driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.cssSelector("#signInBtn")).click();

	}

}
