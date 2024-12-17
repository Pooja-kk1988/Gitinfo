package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class updateddropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\prasa\\Documents\\geckodriver-v0.34.0-win64.exe");
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        /*int i=1;
        while(i!=0 && i<5)
        {
        driver.findElement(By.id("hrefIncAdt")).click();
        i++;
        }
        while(i!=0)
        {
        i--;
        driver.findElement(By.xpath("//*[@id='hrefDecAdt']")).click(); 
        }}*/
        
        
        
       
        	
        for(int i=1;i<5;i++)
       {
        	 driver.findElement(By.id("hrefIncAdt")).click();
       }
        
          // Decrement the number of adults by 1

        //driver.findElement(By.xpath(".//*[@id='hrefDecAdt']")).click(); 
        
        
        
        /* This code is for selecting the Adult and Child
         
         
         for(int i=0;i<3;i++ )			    
{			      
    driver.findElement(By.xpath(".//*[@id='hrefIncAdt']")).click();        			    
}		    
int j=0;			    
for(j=0;j<2;j++ )			    
{			      
      driver.findElement(By.xpath(".//*[@id='hrefIncChd']")).click();           			    
}			    
if(j==3)			    
{			      
     driver.findElement(By.xpath(".//*[@id='hrefIncChd']")).click();			    
}			    
Thread.sleep(4000);			    
driver.findElement(By.xpath("//*[@id='btnclosepaxoption']")).click();	


    
       */
        
        Thread.sleep(1000);	
        
       driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        

	}

}
