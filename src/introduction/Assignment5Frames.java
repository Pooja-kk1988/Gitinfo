package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		/*driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(1);
		// driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		// driver.findElement(By.xpath("//frame[@name='frame-left']"));
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());*/
		
		driver.findElement(By.linkText("Nested Frames")).click();

		driver.switchTo().frame("frame-top");

		driver.switchTo().frame("frame-middle");

		System.out.println(driver.findElement(By.id("content")).getText());

	}

//	Manikandan2024

}

