package TG1.com.demo.testNG.Base;

import org.testng.annotations.Test;

public class SkipTestCase_3 {
	
		@Test                            
		public void defaultEnabled(){
			System.out.println("by default enabled=true");
		}
		@Test(enabled=true)
		public void trueEnabled(){
			System.out.println("hard coded enabled=true");
		}
		@Test(enabled=false)
		public void falseEnabled(){
			System.out.println("this test case will be skipped because enabled=false");
		}
	}




