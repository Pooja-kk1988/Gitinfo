package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("United");
		Thread.sleep(2000);
		List<WebElement> count=driver.findElements(By.cssSelector(".ui-menu-item"));
		WebElement target=driver.findElement(By.xpath("//ul/li[3]/div[@class='ui-menu-item-wrapper']"));
		System.out.println(count.size());
		 
		for(WebElement option:count)
	        {
	        	if(option.getText().equalsIgnoreCase("United Kingdom (UK)"))
	        	{
	        		
	        		Actions a=new Actions(driver);
	        		a.moveToElement(option).build().perform();
	        		target.click();
	        		
	        		
	        	}	
	        	}
		
		
		
		
	}

}
/*import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;



public class Assignment {



public static void main(String[] args) throws InterruptedException {



// TODO Auto-generated method stub



System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");



    WebDriver driver = new ChromeDriver();

    driver.get("http://qaclickacademy.com/practice.php");

    driver.findElement(By.id("autocomplete")).sendKeys("ind");

    Thread.sleep(2000);

    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 

       

  }     

}*/