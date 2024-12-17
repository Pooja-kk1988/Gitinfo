package introduction;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Httpscertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		//FirefoxOptions option1=new FirefoxOptions ();
		//option1.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://expred.badssl.com/");
		System.out.println(driver.getTitle());*/
		
		
		ChromeOptions options = new ChromeOptions();

		Proxy proxy = new Proxy();

		proxy.setHttpProxy("ipaddress:4444");

		options.setCapability("proxy", proxy);

		Map<String, Object> prefs = new HashMap<String, Object>();



		prefs.put("download.default_directory", "/directory/path");



		options.setExperimentalOption("prefs", prefs);

		// FirefoxOptions options1 = new FirefoxOptions();

		// options1.setAcceptInsecureCerts(true);

		// EdgeOptions options2 = new EdgeOptions();

		options.setAcceptInsecureCerts(true);

		



		WebDriver driver = new ChromeDriver(options);

		driver.get("https://expired.badssl.com/");

		System.out.println(driver.getTitle());



		}
	}


		
		//using chrome option class
		/*     ChromeOptions options = new ChromeOptions();
options.addExtensions(new File("/path/to/extension.crx"));
ChromeDriver driver = new ChromeDriver(options);
          
         
          
          //Proxy capabilities
          
          ChromeOptions options = new ChromeOptions();

//// Add the WebDriver proxy capability.
Proxy proxy = new Proxy();
proxy.setHttpProxy("myhttpproxy:3337");
options.setCapability("proxy", proxy);

// Add a ChromeDriver-specific capability.
options.addExtensions(new File("/path/to/extension.crx"));
ChromeDriver driver = new ChromeDriver(options);


//Use custom profile
ChromeOptions options = new ChromeOptions();
options.addArguments("user-data-dir=/path/to/your/custom/profile");


//start chrome maximized
 ChromeOptions options = new ChromeOptions();
options.addArguments("start-maximized");

////Using Chrome executable in non standard location
  ChromeOptions options = new ChromeOptions();
options.setBinary("/path/to/other/chrome/binary");

////Block dialogue windows
  ChromeOptions options = new ChromeOptions();
options.setExperimentalOption("excludeSwitches",
     Arrays.asList("disable-popup-blocking"));
     
     
     ////Set download directory
      ChromeOptions options = new ChromeOptions();
Map<String, Object> prefs = new HashMap<String, Object>();
prefs.put("download.default_directory", "/directory/path");
options.setExperimentalOption("prefs", prefs); 
          
          */
		
		

	


