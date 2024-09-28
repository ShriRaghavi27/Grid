package SeleniumGrid;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid_BrowserTestParallel {
	WebDriver driver;
  @Test
  public void BrowserTest(String bname) throws MalformedURLException, InterruptedException {
	  if(driver.equals("chrome"))
	  {
		  ChromeOptions cap=new ChromeOptions();
		  driver=new RemoteWebDriver(new URL("http://localhost:4444"),cap);
		  System.out.println("Chrome browser connected");
	  }
	  else if(driver.equals("firefox"))
	  {
		  FirefoxOptions cap=new FirefoxOptions();
		  driver=new RemoteWebDriver(new URL("http://localhost:4444"),cap);
		  System.out.println("firefox browser connected");
	  }
	  else if(driver.equals("edge"))
	  {
		  EdgeOptions cap=new EdgeOptions();
		  driver=new RemoteWebDriver(new URL("http://localhost:4444"),cap); 
		  System.out.println("edge browser connected");
	  }
	  Thread.sleep(5000);
	  driver.get("https://www.google.com/");
	  System.out.println(driver.getTitle());
	  Thread.sleep(15000);
	  driver.quit();
	  
  }
}
