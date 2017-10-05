package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractWebDriver {

	protected static WebDriver driver;
	
	protected  WebDriver getDriver(){
		
		if(driver==null){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adminindia\\workspace\\Demo\\Jars\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		return driver;
	}
	
	
	
}
