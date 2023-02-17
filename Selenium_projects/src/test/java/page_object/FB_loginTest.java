package page_object;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FB_loginTest {

	public WebDriver driver;
  
	FB_loginpage fl;
	
        
		@BeforeTest
	   @Parameters("browser")
	public	void setup(String br)
	{
	    if(br.equals("chrome"))
	    {
	    	driver=new ChromeDriver();
	    }
	    else if(br.equals("edge"))
	    {
	    	driver=new EdgeDriver();
	    }
	    else
	    {
	    	driver=new FirefoxDriver();
	    }
		
		//WebDriverManager.chromedriver().setup();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	public	void login() {
		
		fl=new FB_loginpage(driver);
		fl.setUserName("9503200610");
		
		fl.setPassword("9503200");
		
		fl.clickSubmit();
		

	}
	
	@AfterTest	public void tearDown() {
	driver.quit();
	}
	

	
	
}
