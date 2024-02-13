package DemoFrameWork.FrameWork1;

import org.testng.annotations.Test;

//class work on depends on method..

public class DependsOn {

  @Test
  public void Login() {
    System.out.println("Login");
   // assert.assertEquals("true", "false");
    
  }
  @Test (dependsOnMethods="Login")
  public void Application() {
	   System.out.println("Application");
  }
  @Test (dependsOnMethods="Application")
  public void Logout() {
	   System.out.println("Logout");
  }
}
