package J6.com.demo.flowcontrol;

public class IfelseClass {

	public static void main(String[] args) {
		/*****************************************plain if condition***********************************/
		int a=3, b=4, c=5, d=3;
		String answer="Yes";
		int negativeNumber = -22;
		boolean isNumber = true;
		int number = 0;
		Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;
		
		if(isNumber)
			System.out.println("It's a number");
		
		if(negativeNumber < 0)
		{
			System.out.println("It's a negative one! Change it.");
			negativeNumber = (-1) *negativeNumber;
			System.out.println(negativeNumber);
		}

	
	/*****************************************plain ifelse condition***********************************/	
	if(isNumber)
		System.out.println("It's a number");
	else
	System.out.println("It's not a number");

	if(negativeNumber < 0)
	{
		System.out.println("It's a negative one! Change it.");
		negativeNumber = (-1) *negativeNumber;
		System.out.println(negativeNumber);
	}else{
		System.out.println("It's a positive one! Change it.");
	}

	
	/*****************************************elseif condition***********************************/	

	
      if (number > 0) {
         System.out.println("Number is positive.");
      }
      else if (number < 0) {
         System.out.println("Number is negative.");
      }
      else {
         System.out.println("Number is 0.");
      } 
   
	/*****************************************Nestedif condition***********************************/	
	  
      if (n1 >= n2) {
         if (n1 >= n3) {
           largestNumber = n1;
         }
         else {
           largestNumber = n3;
         }
      }
      else {
         if (n2 >= n3) {
           largestNumber = n2;
         }
         else {
           largestNumber = n3;
         }
      }

      System.out.println("Largest number is " + largestNumber);
      
      
      if ((a > (b+c)) || (a == d) && !answer.equalsIgnoreCase("YES"))
    	  System.out.println("predicate example");
      else
    	  System.out.println("Retry");
   }
	
	
	
	
		
}