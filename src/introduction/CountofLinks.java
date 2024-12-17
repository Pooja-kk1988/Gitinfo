package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountofLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//1.Give me the count of links  on the page
		//2.count of Footer section
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footer=driver.findElement(By.id("gf-BIG"));//limiting web driver scope 	
		
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		//3. again limiting the web driver scope
		
		WebElement columndriver=footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//click on each link in the column
		
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			
			String clickOnTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnTab);
			Thread.sleep(5000L);
		}
		//opens all the tabs
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
			
			while(it.hasNext())//hasNext will check whether the next window is present
			{
			driver.switchTo().window(it.next());//will actually move to next window
			System.out.println(driver.getTitle());
		}
		
		
		
	}

}

/*import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Exerc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.ebay.com/");
		//Count of the Link in the Entire Page
	//	System.out.println("Links in the Page");
	//System.out.println(driver.findElements(By.tagName("a")).size());
	//Count of links in the footer section of the page
	WebElement footer=driver.findElement(By.xpath(".//*[@id='glbfooter']"));
	//System.out.println("Links in the footer section");
	//System.out.println(footer.findElements(By.tagName("a")).size());
	WebElement col=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
	//System.out.println("Links in the 2nd coloumn of the section");
	//System.out.println(col.findElements(By.tagName("a")).size());
	String Beforeclicking = null;
	String Afterclicking;
	for(int i=0;i<col.findElements(By.tagName("a")).size();i++)
	{
	
		
		if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
		{
			Beforeclicking = driver.getTitle();
		
			col.findElements(By.tagName("a")).get(i).click();
			break;
			}
	}
	Afterclicking =driver.getTitle();
	if(Beforeclicking!=Afterclicking)
	{
		if(driver.getPageSource().contains("sitemap"))
	
			System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
		
}
	                   
	}



 */


