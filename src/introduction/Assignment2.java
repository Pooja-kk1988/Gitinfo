package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\prasa\\Documents\\geckodriver-v0.34.0-win64.exe");
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        
        
        
        driver.findElement(By.xpath("//div/input[@name='name']")).sendKeys("Pooja");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gpna.kanta@gmail.com");
        driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys("Poojakanta");
        driver.findElement(By.cssSelector("#exampleCheck1")).click();
        
           WebElement option=driver.findElement(By.id("exampleFormControlSelect1"));
           Select dropdown=new Select(option);
          
           Thread.sleep(1000);
           dropdown.selectByVisibleText("Female");
           System.out.println(dropdown.getFirstSelectedOption().getText());
           
           driver.findElement(By.xpath("//div/input[@id='inlineRadio1']")).click();
           Thread.sleep(1000);
           
           driver.findElement(By.cssSelector("input[type='date']")).sendKeys("22/11/2024");
           driver.findElement(By.xpath("//input[@value='Submit']")).click();
          // System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
           System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
           

          // System.out.println(driver.findElement(By.xpath("//strong[contains(text(),'Success!')]")).getText());
           
           Thread.sleep(1000);
         
	}
	
	
  
}


   