package introduction;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Arraycart {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\prasa\\Documents\\geckodriver-v0.34.0-win64.exe");
        //driver.manage().window().maximize();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        
        String[] itemsNeeded= {"Cucumber","Brocolli","B eetroot"};


      
        addItems(driver,itemsNeeded);
        
        //If we want to call a method in the main program then we have to create an object
        //of the main class.
        //If we want to call it directly in the main program then we should use 
        //Static in the method class.It is also called UTILITY
       // Arraycart a=new Arraycart();
       // a.addItems(driver, itemsNeeded);
        
      driver.findElement(By.cssSelector(" img[alt='Cart']")).click();
      driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));


      driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
      driver.findElement(By.cssSelector("button.promoBtn")).click();
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
      
      System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
      


       


        	

        	}

        	public static  void addItems(WebDriver driver,String[] itemsNeeded)

        	{

        	int j=0;

        	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

        	for(int i=0;i<products.size();i++)

        	{

        	//Brocolli - 1 Kg

        	//Brocolli,    1 kg

        	String[] name=products.get(i).getText().split("-");

        	String formattedName=name[0].trim();

        	//format it to get actual vegetable name

        	//convert array into array list for easy search

        	//  check whether name you extracted is present in arrayList or not-

        	List itemsNeededList = Arrays.asList(itemsNeeded);

        	if(itemsNeededList.contains(formattedName))

        	{

        	j++;

        	//click on Add to cart

        	driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

        	if(j==itemsNeeded.length)

        	{

        	break;

        	}

        	}

        	}

        	}



        	}


