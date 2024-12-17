package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class parent_child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\prasa\\Documents\\geckodriver-v0.34.0-win64.exe");
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());


	}

}
