package introduction;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BigBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//span[text()='View All']")).click();
		
		String[] itemsNeeded= {"Banana","Carrot","Curry Leaves"};
		
		addItems(driver,itemsNeeded);
	}
		
		public static  void addItems(WebDriver driver,String[] itemsNeeded)

		{
		int j=0;
		List<WebElement> prods=driver.findElements(By.xpath("//div[@class='break-words h-10 w-full']"));
		for(int i=0;i<prods.size();i++)
		{
			String[] name=prods.get(i).getText().split("-");
			String formattedName=name[0].trim();
			System.out.println(formattedName);
			List itemsList=Arrays.asList(itemsNeeded);
			if(itemsList.contains(formattedName))
			{
				j++;
				
			//driver.findElements(By.xpath("//div[@class='relative flex flex-col w-full lg:h-8 xl:h-9 overflow-hidden']")).get(i).click();
			driver.findElements(By.cssSelector("div[class='grid relative grid-flow-col gap-x-6'] div div:nth-child(2) div:nth-child(1) div:nth-child(5) div:nth-child(1) div:nth-child(2)")).get(i).click();
				
				if(j==itemsNeeded.length)
			{
				break;
			}
			}
			
		}

	}

}
