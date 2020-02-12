package pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageclassobject extends Baseclass {
	
	@FindBy(xpath = "//input[@name='uid']")
	public WebElement logginuser;
	@FindBy(xpath = "//input[@name=\'password\']")
	public WebElement password;
	@FindBy(xpath = "//input[@name='btnLogin']")
	public WebElement logginbtn;

	
	
	public pageclassobject() {
		PageFactory.initElements(driver, this);
	}
}
