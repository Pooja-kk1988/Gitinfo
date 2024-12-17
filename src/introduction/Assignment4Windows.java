package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment4Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		

		
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		
		
		
		
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
        Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> id=windows.iterator();
		
		String ParentId=id.next();
		
		String ChildId=id.next();
		
		
		driver.switchTo().window(ChildId);
		System.out.println(driver.findElement(By.cssSelector(".example")).getText());
		
		driver.switchTo().window(ParentId);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());
		
		
		

	}

}
