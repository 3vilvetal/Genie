package test.flash;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.adobe.genie.executor.Genie;
import com.adobe.genie.executor.LogConfig;
import com.adobe.genie.genieCom.SWFApp;
import com.adobe.genie.executor.components.GenieButton;

public class TestFlashGame {
	
	private FirefoxDriver driver;
	WebDriverWait wait;
	Actions actions;
	
	@Before
	public void before(){
		driver = new FirefoxDriver();
		this.wait = new WebDriverWait(driver, 120);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://vk.com");
	}
	
	@Test
	public void testHelloWorld(){
		
		//login to vk.com
		driver.findElement(By.id("quick_email")).sendKeys("login");
		driver.findElement(By.id("quick_pass")).sendKeys("password");
		driver.findElement(By.id("quick_login_button")).click();
		
		//add game flirt
		driver.findElement(By.xpath(".//div[@id='side_bar']//span[contains(.,'Applications')]")).click();
		driver.findElement(By.xpath(".//div[@id='apps']//input")).sendKeys("ФлиртоМания");
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(".//div[@id='apps_search_cat_wrap']//div[@class='apps_cat_info']//a//span[1]"), "ФлиртоМания"));
		
		driver.findElement(By.xpath(".//div[@id='apps_search_cat_wrap']//div[@class='apps_cat_info']//a//span[1]")).click();
		driver.findElement(By.xpath(".//div[@class='box_x_button']")).click();
		
		//start work with flash
		LogConfig log = new LogConfig();
		Genie genie = null;
		
		try {
			genie = Genie.init(log);
			
			//connect to application: insert application name
			SWFApp application = genie.connectToApp("[object MiniLoader]");
			Thread.sleep(10000);
			
			//click on few buttons
			new GenieButton("SP^Flirt:::FP^VKLeadsWindow:::SE^WindowCloseButton::PX^2::PTR^0::IX^4::ITR^0", application).click();
			new GenieButton("SP^Flirt:::FP^ValentineSendPopup:::SE^WindowCloseButton::PX^1::PTR^0::IX^6::ITR^0", application).click();
			
		} catch ( Exception e) {
			e.printStackTrace();
		}
	}

	@After
	public void after() {
		driver.close();
	}
}
