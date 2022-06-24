package J2.com.demo.variables;

public class ImplementationClassVariables {
	static String newStudent="Tom";
	static int newMarks= 90;
	static int salesbonus=1000;
	static int rollNo=305;
	static String studentName="Harry";
	
	public static void main(String[] args) {
/*************************************Instance***********************************************************/
		InstanceVariables instanceVar= new InstanceVariables(newStudent);
		instanceVar.setMarks(newMarks);
		instanceVar.printStud();
/*************************************Local***********************************************************/
		LocalVariables localVar= new LocalVariables();
		
		localVar.salary(salesbonus);
		
/*************************************static***********************************************************/
		StaticVariables staticVar= new StaticVariables(rollNo,studentName);
		String collegeName=StaticVariables.college + " cambridge, UK";
		staticVar.display(collegeName);
		
	}
}
