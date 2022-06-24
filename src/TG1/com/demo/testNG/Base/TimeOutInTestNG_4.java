package TG1.com.demo.testNG.Base;

import org.testng.annotations.Test;

public class TimeOutInTestNG_4 {
	//time is in milliseconds, here this test case will execute for max 3sec if it will not 
	//complete in 3sec then it will be failed.
	@Test(timeOut=3000,groups={"TestNG","demo","sprint12","TC002","timeout"}) 
	public void thisTestShouldPass() throws InterruptedException{
		System.out.println("This test case should pass");
		Thread.sleep(1000); //wait for 1 sec
	}
	//here this test case will execute for max 5sec if it will not complete in 5sec then it will be failed.
	@Test(timeOut=5000,groups={"TestNG","demo","sprint13","TC003","timeout"})  
	public void thisTestShouldFail(){
		System.out.println("This test case should fail");
		while(true); //this loop is never going to end as condition is always true
	}
}


