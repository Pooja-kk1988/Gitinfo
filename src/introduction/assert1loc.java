package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class assert1loc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
				System.setProperty("webdriver.Firefox.driver", "C:\\Users\\prasa\\Documents\\geckodriver-v0.34.0-win64.exe");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));/*this is helpful when nothing is present in that page and want to move to other page.
				if like "P" tag we are searching in next page and we have not given any thread.sleep then it will search in 
				the current page instead of next page*/
				String password = getPassword(driver);
				
				String name="Rahul";
				
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
				
				driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
				
				driver.findElement(By.name("inputPassword")).sendKeys(password);
				
				driver.findElement(By.className("signInBtn")).click();
				Thread.sleep(1000);
				
				System.out.println(driver.findElement(By.tagName("p")).getText());
				
				Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
				Assert.assertEquals(driver.findElement(By.cssSelector("h2")).getText(), "Hello " +name+",");
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
				//driver.findElement(By.xpath("//button[text()='Log Out']")).click();
				driver.close();
	}
	public static String getPassword(WebDriver driver) throws InterruptedException



	{

	driver.get("https://rahulshettyacademy.com/locatorspractice/");

	driver.findElement(By.linkText("Forgot your password?")).click();

	Thread.sleep(1000);

	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

	String passwordText =driver.findElement(By.cssSelector("form p")).getText();

	//Please use temporary password 'rahulshettyacademy' to Login.

	String[] passwordArray = passwordText.split("'");

	// String[] passwordArray2 = passwordArray[1].split("'");

	// passwordArray2[0]

	String password = passwordArray[1].split("'")[0];

	return password;

	//0th index - Please use temporary password

	//1st index - rahulshettyacademy' to Login.



	//0th index - rahulshettyacademy

	//1st index - to Login.





	}













	}

