package introduction;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		/*driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Brinjal");
		driver.findElement(By.xpath("//div[@class='product-action']/button[@type='button']")).click();
		driver.findElement(By.cssSelector(".cart-icon")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		*/
		
		
		String[] ItemsList= {"Brocolli","Cauliflower","Cucumber","Beetroot"};
		
		addItems(driver,ItemsList);
		driver.findElement(By.cssSelector(".cart-icon")).click();
		
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		
	}
		
		public static  void addItems(WebDriver driver,String[] ItemsList)

    	{
			int j=0;
		List<WebElement> prodlist=driver.findElements(By.cssSelector("h4.product-name"));
		
		
		for(int i=0;i<prodlist.size();i++)
		{
			
			
			String[] name=prodlist.get(i).getText().split("-");
			String formattedName=name[0].trim();
			System.out.println(formattedName);
			List ItemsNeededList=Arrays.asList(ItemsList);
			if(ItemsNeededList.contains(formattedName))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==ItemsList.length)
				{
					break;
				}
			}
			
		}
		
		
		
		
		}

}
