package introduction;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Webtablesortstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// Click on column
		// capture all webelements into list
		// capture text of webelements into new original list
		// sort on the original list of step 3-->sorted list
		// compare original list vs sorted list

		driver.findElement(By.xpath("//span[text()='Veg/fruit name']")).click();
		List<WebElement> elementList = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List<String> originalList = elementList.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalList.equals(sortedList));

//In Lambda expression left side argument  is the items present in ur stream 
//and side is what action u have to perform on the element u retrieved from the left side
		List<String> price;

		// scan the name column with getText ->Beans->print the price of the Rice

		do

		{

		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));

		price = rows.stream().filter(s -> s.getText().contains("Rice"))

		.map(s -> getPriceVeggie(s)).collect(Collectors.toList());


		price.forEach(a -> System.out.println(a));

		if(price.size()<1)

		{

		driver.findElement(By.cssSelector("[aria-label='Next']")).click();

		}

		}while(price.size()<1);



		}
	

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String priceVAlue = s.findElement(By.xpath("following-sibling::td[1]")).getText();

		return priceVAlue;
	}

}
