package DemoFrameWork.FrameWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xmlPractice {
	WebDriver driver;
	
  @Test
  public void testgooggle() throws Exception {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  driver.findElement(By.name("q")).sendKeys("HYRTutorials", Keys.ENTER);
	  System.out.println(driver.getTitle());
	  Thread.sleep(5000);
	  driver.quit();
	
  }
  @Test
  public void testFacebook() throws Exception {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.name("email")).sendKeys("HYRTutorials", Keys.ENTER);
	  System.out.println(driver.getTitle());
	  Thread.sleep(5000);
	  driver.quit();
  }
  @Test
  public void VerifyMyInfo() {
	  System.out.println(driver.findElement(By.id("Employee Details")).isDisplayed());
	  driver.quit();
  }
  @Test
  public void VerifyLogin() {
	  WebElement element= driver.findElement(By.id("Welcome"));
	  System.out.println(element.isDisplayed());
	  System.out.println(element.getText());
	  driver.quit();
  }
  
}
