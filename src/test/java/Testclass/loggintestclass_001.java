package Testclass;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageclass.Baseclass;
import pageclass.pageclassobject;

public class loggintestclass_001 {
	Baseclass bp;
	pageclassobject po;

	loggintestclass_001() {
		po = new pageclassobject();
	
	}

	@Test
	public void logginuser() {
		po.logginuser.sendKeys("deva1234");

	}

	@Test
	public void paassword() {
		po.password.sendKeys("987654321");
	}

	@Test
	public void logginclick() {
		po.logginbtn.click();
		System.out.println("sakthi");
	}
	
}
