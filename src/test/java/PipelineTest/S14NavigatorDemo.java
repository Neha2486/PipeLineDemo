package PipelineTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class S14NavigatorDemo {

	WebDriver driver;
	
	@Test
	public void WD() throws InterruptedException {
		System.setProperty( "webdriver.gecko.driver","C:\\Program Files\\GeckoDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		//navigate to another url 
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		//navigate to again first url
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		
		//navigate again to second url
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		// again open same url
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		System.out.println("this is navigation page");
}
}
