package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\prasa\\Documents\\geckodriver-v0.34.0-win64.exe");
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        
        //System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
        driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
        driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
       
        
        /* WebElement box=driver.findElement(By.cssSelector("input[id='checkBoxOption1']"));
        
        if (box.isSelected()) {

        	box.click();

         System.out.println("box selected");
        	//Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());

        	 }else {

        	System.out.println("box is already deselected");*/
        
       
        System.out.println( driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        

	}

}
