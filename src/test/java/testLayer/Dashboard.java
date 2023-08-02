package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseHRMClass;
import pompackage.PomDashboard;

public class Dashboard extends BaseHRMClass{

	PomDashboard Pod;
	
	public Dashboard() {
		super();
	}
	
	@BeforeMethod 
	public void initialsetup() {
		initiate();
		screenshots("Login");
		Pod = new PomDashboard();
	}
	
	@Test
	public void dologin() throws InterruptedException {
		Thread.sleep(5000);
		Pod.login();
		Thread.sleep(5000);
		
		Pod.myinfoclick();
		Thread.sleep(2000);

		Pod.clearfname();
		Pod.typfname();
	
		Pod.clearlname();
		Pod.typeLname();
		
		Thread.sleep(2000);
		
	}
	

	
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	
	
	
	
	
}
