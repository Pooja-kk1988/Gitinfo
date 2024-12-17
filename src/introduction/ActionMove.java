package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\prasa\\Documents\\geckodriver-v0.34.0-win64.exe");
        
        driver.get("https://www.amazon.com/");
        
        
        Actions a=new Actions(driver);
        WebElement move=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
        a.moveToElement(move).build().perform();
        //for shift press we use keydown
        a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
        //to right click we use context
        a.moveToElement(move).contextClick().build().perform(); 
	}

}
