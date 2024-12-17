package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class chkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\prasa\\Documents\\geckodriver-v0.34.0-win64.exe");
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
        System.out.println(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_SeniorCitizenDiscount']")).isSelected());
        
        
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());//we are fetching more then one element so we are using findelements
        
        
        //Radiobutton-and calender
        
        
       // System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
       System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
        {
        	 System.out.println("Enabled");
        	 Assert.assertTrue(true);
        }
        else
        {
        	Assert.assertTrue(false);
        }
        }
        //driver.findElement(By.id("divpaxinfo")).click();
	}
	//input[id='ctl00_mainContent_btn_FindFlights']


