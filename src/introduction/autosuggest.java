package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autosuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\prasa\\Documents\\geckodriver-v0.34.0-win64.exe");
        //driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(1000);
        List<WebElement> options=driver.findElements(By.xpath("//li[@class='ui-menu-item'] //a"));
        //List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for(WebElement option:options)
        {
        	if(option.getText().equalsIgnoreCase("india"))
        	{
        		option.click();
        		break;
        	}
        }
	}

}
