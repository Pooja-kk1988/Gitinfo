package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpWait {

	public static void main(String[] args) throws InterruptedException {
		
		String text="Pooja";
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\prasa\\Documents\\geckodriver-v0.34.0-win64.exe");
        //driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
        driver.findElement(By.id("name")).sendKeys(text);
        driver.findElement(By.id("alertbtn")).click();
        System.out.println(driver.switchTo().alert().getText()); 
        driver.switchTo().alert().accept();
        
        //driver.findElement(By.id("name")).sendKeys(text);
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        
        
        
        

	}

}
