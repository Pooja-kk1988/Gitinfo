package introduction;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myprac2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\prasa\\Documents\\geckodriver-v0.34.0-win64.exe");
        
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        
        String[] itemsNeeded= {"Brocolli","Cauliflower","Cucumber","Beetroot"};
        int j=0;
        List<WebElement> productname=driver.findElements(By.cssSelector("h4.product-name"));
        
        for(int i=0;i<productname.size();i++)
        {
        	
        	String[] name=productname.get(i).getText().split("-");
        	String formattedname=name[0].trim();
        	
        	List itemsNeededList = Arrays.asList(itemsNeeded);
        	
        	if(itemsNeededList.contains(formattedname))
        	{
        		j++;
        		
        		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

        		
        		if(j==itemsNeeded.length)
        		{
        			break;
        		}
        		
        	}
        	
        	
        	
        	
        }
	
	driver.findElement(By.xpath("//a[@class='cart-icon']//img[@alt='Cart']")).click();
	driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//button[text()='PROCEED TO CHECKOUT']"))));
	
	driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//span[@class='promoInfo']"))));
	
	System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
	driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//select[@style='width: 200px;']"))));
	
	WebElement drop=driver.findElement(By.xpath("//select[@style='width: 200px;']"));
	
	Select option=new Select(drop);
	option.selectByValue("India");
	
	driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
	driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	
	
	}
	

}
