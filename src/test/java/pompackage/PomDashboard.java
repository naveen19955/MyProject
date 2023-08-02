package pompackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseHRMClass;

public class PomDashboard extends BaseHRMClass{
	

	@FindBy(name="username")
    WebElement Username;
	@FindBy(name="password") WebElement Password;
	@FindBy(css="#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button")
	WebElement Loginbtn;
	
	@FindBy(linkText="My Info") WebElement Myinfo;
	@FindBy(name="firstName")
	WebElement Fname;
	@FindBy(name="lastName") 
	WebElement Lname;
	
	public PomDashboard() {
		PageFactory.initElements(driver, this);
	}
	
	public void login() {
		Username.sendKeys("Admin");
		Password.sendKeys("admin123");
		Loginbtn.click();
	}
	
	public void myinfoclick() {
		Myinfo.click();
	}
	
	public void clearfname() {
		Fname.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	}
	
	public void typfname() {
		Fname.sendKeys("Naveen");
	}
	
	public void clearlname() {
		Lname.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	}
	
	public void typeLname() {
		Lname.sendKeys("Kaushik");
	}

}
