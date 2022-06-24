package OP3.com.demo.assignments;

public class BasicAssignments {

	public static void main(String[] args) {
		/*
		 *//********** Write a Java program to print the result of the following basic math operations.	 *//*
		System.out.println(-5 + 8 * 6);
		System.out.println((55+9) % 9);
		System.out.println(20 + -3*5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		  *//********* Write a Java program to check whether Java is installed on your computer.   *//*
		System.out.println("\nJava Version: "+System.getProperty("java.version"));
		System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
		System.out.println("Java Home: "+System.getProperty("java.home"));
		System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
		System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
		System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");

		   *//********* Write a Java program to print the odd numbers from 1 to 99. Prints one number per line.		    *//*
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}	
		    *//*********** Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.	*//*
		if (10 % 2 == 0) {
			System.out.println("its a even number "+1); 
		}
		else {
			System.out.println("its a odd number "+0); 
		}
		     *//******Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both*//*
		System.out.println("\nDivided by 3: ");		
		for (int i=1; i<100; i++) {
			if (i%3==0) 
				System.out.print(i +", ");			
		}			

		System.out.println("\n\nDivided by 5: ");
		for (int i=1; i<100; i++) {
			if (i%5==0) System.out.print(i +", ");			
		}

		System.out.println("\n\nDivided by 3 & 5: ");			
		for (int i=1; i<100; i++) {
			if (i%3==0 && i%5==0) System.out.print(i +", ");			
		}
		System.out.println("\n");*/
		/*----------------------------------------find the greatest and greatest number------------------------------------	*/
		int num1=25;
		int num2=785;
		int num3=87;
		if (num1 > num2)
			if (num1 > num3)
				System.out.println("The greatest: " + num1);
			else
				System.out.println("The smallest: " + num1);

		if (num2 > num1)
			if (num2 > num3)
				System.out.println("The greatest: " + num2);
			else
				System.out.println("The smallest: " + num2);

		if (num3 > num1)
			if (num3 > num2)
				System.out.println("The greatest: " + num3);
			else
				System.out.println("The smallest: " + num3);
		/*------------------------------------print day name using switchcase-------------------------------*/
		int day=3;
		String dayName = "";
		switch (day) {
		case 1: dayName = "Monday"; break;
		case 2: dayName = "Tuesday"; break;
		case 3: dayName = "Wednesday"; break;
		case 4: dayName = "Thursday"; break;
		case 5: dayName = "Friday"; break;
		case 6: dayName = "Saturday"; break;
		case 7: dayName = "Sunday"; break;
		default:dayName = "Invalid day range";


		}

		System.out.println(dayName);

		/*-------------------------------print prime numbers-------------------------------------*/
		int[] primenumbers={1,3,5,7,9,11,13,15,17,19,21,23,25,27,29};

		for(int pm:primenumbers){
			System.out.println("prime number is "+pm);
		}

		/*-----------------------------------print my address---------------------------------------*/
		String[] address={"palava city","shil phata","nilje","Dombivali","East","421204"};

		for(String add:address){
			System.out.println("My Residential address is "+add);
		}
		/*-------------------------------------elseif and forEach to print pass fail of student----------------*/
		int A = 69;
		int B= 55;
		int C=45;
		int D= 25;
		int AA=85;
		int[] marks= {A,B,C,D,AA}; 
		for(int mark:marks){
			if(mark < 35)
				System.out.println("You are failed bcoz marks obtained are "+D);
			else if( mark < 50)
				System.out.println("You are passed and got third class bcoz marks obtained are "+C);
			else if( mark < 60)
				System.out.println("You are passed and got second class bcoz marks obtained are "+B);
			else if( mark < 70)
				System.out.println("You are passed and got first class bcoz marks obtained are "+A);
			else
				System.out.println("You are passed and got distinction bcoz marks obtained are "+AA);
		}
/*------------------------------------------find odd number count till the value 10-----------------------*/
		int counter = 0;
		  
		  for(int i=0; i < 11; i++){
		   if(i % 2 == 0)
		    continue;
		   System.out.println(i);
		   counter++;
		  }
		  
		  System.out.println("Total number of odd numbers from 0 to 10 is " + counter);
		 

		/*-------------------------------------leap year--------------------------------------------------*/
		int year =2004;

		if (year%400==0)
		{
			System.out.println(year + " is a leap year");
		}
		else
		{
			System.out.println(year + " is not a leap year");
		}
		/*------------------------------------overloaded constructors--------------------------------------*/
 /*int width,height;
		 
		 Test(){
		  width = 0;
		  height = 0;
		 }

		 Test(int h){
		  width = height = h;
		 }

		 Test(int w, int h){
		  width = w;
		  height = h;
		 }

		 public static void main(String args[]){
			 Test b1 = new Test();
			 Test b2 = new Test(15);
			 Test b3 = new Test(15, 25);
		  
		  System.out.println(b1.width +"\t"+b1.height);
		  System.out.println(b2.width +"\t"+b2.height);
		  System.out.println(b3.width +"\t"+b3.height);
		*/
		/*-----------------------Write a program to display natural number of sum upto 28 and and then break-----------------------------*/

		int i=0, n=28, sum=0;
		{

			System.out.print("Input number n: "+n);  


			System.out.println("The first n natural numbers are : "+i);

			for(i=1;i<=n;i++)
			{
				System.out.println(i);
				sum+=i;
				System.out.println("the value of sum is: "+ sum);
				if(sum==n)
					break;
			}
			System.out.println("The Sum of Natural Number upto "+n+ " terms : " +sum);

		}
		/*----------------   CReate a pyramid of natural numbers---------------------------*/
		{
			int k,j,nn=10;

			for(k=1;k<=nn;k++)
			{
				for(j=1;j<=k;j++)
					System.out.print(j);

				System.out.println("");
			}
		}

	}
}






