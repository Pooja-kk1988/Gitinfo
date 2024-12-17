package newProgs;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class New125onwards {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		
		//Switch new window or Tab
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		driver.get("https://courses.rahulshettyacademy.com/courses/");
		String courses=driver.findElements(By.xpath("//div[@class='course-listing-title']")).get(6).getText();
		driver.switchTo().window(parentId);
		WebElement name=driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courses);
		
		//Take screenshot of webelement
		File file=name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
		
		//Height and Width
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		

	}

}
