package TG1.com.demo.testNG.Base;

import org.testng.annotations.Test;

public class MultipleTimeRunTestNG_6 {
	int i=0;
	
	@Test(invocationCount=10,groups={"TestNG","demo","TC005","invocationCount"})
	public void runMultipleTimes(){
		i++;
		System.out.println("run this test multiple time & counter is "+i);
        System.out.println("Thread Id: "+Thread.currentThread().getId());
	}
}


