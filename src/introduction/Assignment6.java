package introduction;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//WebElement chk=driver.findElement(By.xpath("//legend[contains(text(),'Checkbox Example')]"));
		driver.findElement(By.cssSelector("#checkBoxOption3")).click();
		System.out.println(driver.findElement(By.cssSelector("#checkBoxOption3")).isEnabled());
		WebElement chk=driver.findElement(By.xpath("//div[@class='right-align']/fieldset/label[3]"));
        
		 // String result=chk.getAttribute("for");
		String result=chk.getText();
		  System.out.println(result);
		  
		  driver.findElement(By.cssSelector("#dropdown-class-example")).sendKeys(result);
		  
		driver.findElement(By.cssSelector("#name")).sendKeys(result);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		Thread.sleep(2000);
		 System.out.println(driver.switchTo().alert().getText()); 
	        driver.switchTo().alert().accept();
		  
		  
		  
        
	}

}
