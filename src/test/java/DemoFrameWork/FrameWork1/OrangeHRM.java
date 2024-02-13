package DemoFrameWork.FrameWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM {
	WebDriver driver;
	
  @Test
  public void LaunchApp() {
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.orangehrm.com/");
    }
  @Test
  public void EnterLogInDetails() {
	  driver.findElement(By.id("txtusername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("Admin123");
	  driver.findElement(By.id("btnLogin")).click();
	   }
  @Test
  public void NavigateToMyInfo() {
	  driver.findElement(By.id("menu_pim_viewMyDetails")).click();
   }
  @Test
  public void VerifyMyInfo() {
	  System.out.println(driver.findElement(By.id("Employee_Details")).isDisplayed());
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
