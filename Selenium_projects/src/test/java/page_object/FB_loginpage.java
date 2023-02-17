package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FB_loginpage {

	public  WebDriver driver;
	    
		//constructor 
	 public   FB_loginpage(WebDriver driver)
	    {
	    	this.driver=driver;
	    }
		
	    
	    
		//locator/elements
		By txt_Username=By.xpath("//input[@id='email']");
		By txt_password=By.xpath("//input[@id='pass']");
		By btn_suubmit=By.xpath("//button[@id='loginbutton']");
		
		
	   //actions
	public	void setUserName(String username)
		{
			driver.findElement(txt_Username).sendKeys(username);
		}
	public		void setPassword(String password)
		{
			driver.findElement(txt_password).sendKeys(password);
		}
	public	void clickSubmit()
		{
			driver.findElement(btn_suubmit).click();
		}
	
	
		
	
}
