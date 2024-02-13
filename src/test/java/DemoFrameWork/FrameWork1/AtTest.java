package DemoFrameWork.FrameWork1;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AtTest {
	WebDriver driver;
  @Test
  public void Setup() {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("https://jpetstore.aspectran.com/account/signonForm");
  }
  
  @Test
  public void Login() {
	  driver.findElement(By.xpath("//a[text()='Sign In]")).click();
	  driver.findElement(By.xpath("//input[contains(@name,'userna')]")).sendKeys("j2ee");
	  driver.findElement(By.xpath("//input[contains(@name,'password')]")).clear();
	  driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys();
			  
	  
  }
  
  @AfterMethod
  public void teardown() {
  driver.quit();
	  }
}
