package DemoFrameWork.FrameWork1;

import org.testng.annotations.Test;

public class Priority {
  @Test(priority=1, groups="odd")
  public void One() {
	  System.out.println("one");
	  
  }
  @Test(priority=2, groups="even")
  public void two() {
	  System.out.println("two");
  }
  @Test(priority=3, groups="odd")
  public void three() {
	  System.out.println("three");
  }
  @Test(priority=4, groups="even")
  public void four() {
	  System.out.println("four");
  }
  @Test(priority=5, groups="odd")
  public void five() {
	  System.out.println("five");
  }
}
