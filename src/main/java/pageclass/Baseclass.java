package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	public static WebDriver driver;
	public String browser = "chrome";

	 public Baseclass(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Study\\\\Framework\\\\chromedriver78\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://demo.guru99.com/V4/");
		 driver.quit();
		 
	}

}
