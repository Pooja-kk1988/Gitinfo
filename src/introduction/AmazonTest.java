package introduction;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");
		
		Actions a=new Actions(driver);
        WebElement move=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        a.moveToElement(move).build().perform();
        a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("mobile").doubleClick().build().perform();
        
        
        List<WebElement> screenSize=driver.findElements(By.xpath("//ol/li/div/a/div/div[@class='s-suggestion discover-tr-suggestion']"));
        System.out.println(screenSize);
        List<WebElement> filteredList= screenSize.stream().filter(s->s.getText().contains("Up to 3.9 in")).collect(Collectors.toList());
      
        
        System.out.println(filteredList);
        
        
        
      
	}
	
}
        	
     