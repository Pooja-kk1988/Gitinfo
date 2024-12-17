package introduction;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Mye2e {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\prasa\\Documents\\geckodriver-v0.34.0-win64.exe");
        //driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
        
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
       
        List<WebElement> dropdown=driver.findElements(By.xpath("//li[@class='ui-menu-item'] //a"));
       
        for(WebElement opt:dropdown)
        {
        	if(opt.getText().equalsIgnoreCase("India"))
        	{
        		opt.click();
        		break;
        	}
        	
        }
        
        
        
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
        //driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.xpath("//a[@value='DEL']")).click();
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        
        
   
       // driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();
        
        driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-hover']")).click();
        
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
        {
        	System.out.println("Its disabled");
        	Assert.assertTrue(true);
        }
        else
        {Assert.assertTrue(false);
        }
        
        
       
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
          
        driver.findElement(By.id("divpaxinfo")).click();
        for(int i=1;i<5;i++)
        {
        	driver.findElement(By.id("hrefIncAdt")).click();
        	
        }
        
        
        driver.findElement(By.id("btnclosepaxoption")).click();
        
        
        
        WebElement staticoptions=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select option=new Select(staticoptions);
        option.selectByIndex(3);
        
        
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}
	
	
	
	
	
	
	
	

	}


