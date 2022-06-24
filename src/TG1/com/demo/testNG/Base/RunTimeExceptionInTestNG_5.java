     
package TG1.com.demo.testNG.Base;

import org.testng.annotations.Test;

public class RunTimeExceptionInTestNG_5 {

	@Test(expectedExceptions = Exception.class)
	public void withException(){
		int a = 5/0;
		System.out.println(a);
	}


	//This test case will fail-

	@Test()
	public void withoutException(){
		int b = 5/0;
		System.out.println(b);
	}
}

