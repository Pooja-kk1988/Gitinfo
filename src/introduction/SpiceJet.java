package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		
		
		driver.findElement(By.xpath("//i[@class='fa fa-calendar']")).click();
		driver.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']/input[@type='text']")).click();
		driver.findElement(By.xpath("//a/span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
		
		List<WebElement> months=driver.findElements(By.xpath("//td/a[@class='ui-state-default ng-tns-c58-10 ng-star-inserted']"));
		
		months.get(8).click();

	}

}
