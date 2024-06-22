package comprehension.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProcessDiscoverPage {
	 public static WebDriver driver=null;

	    @BeforeTest
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	    }
	    
	    @Test
	    public void loginPage() throws InterruptedException {
	    	driver.manage().window().maximize();
	        driver.get("https://www.automationanywhere.com/");
	        Thread.sleep(5000);
	        if(driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).isDisplayed()) {
	        	driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
	        }
	        
	        Actions actions = new Actions(driver);
	      actions.moveToElement(driver.findElement(By.xpath("//a[text()='Products']"))).build().perform();
	      Thread.sleep(3000);
	      actions.moveToElement(driver.findElement(By.xpath("//a[text()='Process Discovery']"))).click().build().perform();
	      Thread.sleep(5000);
	      Assert.assertEquals(driver.getCurrentUrl().toString(), "https://www.automationanywhere.com/products/process-discovery");
	      System.out.println(driver.getCurrentUrl().toString());
	    }
	    
	    
	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	    }
}
