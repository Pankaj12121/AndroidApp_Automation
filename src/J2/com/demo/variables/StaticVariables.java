package J2.com.demo.variables;

public class StaticVariables {
	int rollno;  
	String name;  
	static String college ="ITS"; 
	

	public StaticVariables(int r,String n){  
		rollno = r;  
		name = n;  
	}  
	public void display (String collegeName){
		college=college+collegeName;
		System.out.println(rollno+" "+name+" "+collegeName);
	} 
	 
	public void display (){	
		System.out.println(rollno+" "+name+" "+college);
	}  
	public static void main(String args[]){  
		StaticVariables s1 = new StaticVariables(111,"Karan");  
		StaticVariables s2 = new StaticVariables(222,"Aryan");  
		s1.display();  
		s2.display();  
	}  
}  



