package pageclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	public static WebDriver driver;
	public String browser = "chrome";

	 public Baseclass(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Study\\\\Framework\\\\chromedriver78\\\\chromedriver.exe");
		 driver=new ChromeDriver();
<<<<<<< HEAD
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
=======
		 thread.sleep(3000);
>>>>>>> branch 'master' of https://github.com/QVCAutomation1/QVC.git
		 driver.get("http://demo.guru99.com/V4/");
		 driver.close();
		 
	}

}
