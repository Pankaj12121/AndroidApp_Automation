package OP3.com.demo.assignments;

public class EncapsulationImplementation {
	public static void main(String[] args) {
		
	EncapsulationBase personA = new EncapsulationBase();
	EncapsulationBase personB = new EncapsulationBase();

	  /* Setting properties for personA object */
	  personA.setHeight(6);
	  personA.setweight(75);
	  personA.setColor("White");
	  personA.setCountry("India");

	  /* Setting properties for personB object */
	  personB.setHeight(5.5f);
	  personB.setweight(76);
	  personB.setColor("Black");
	  personB.setCountry("America");

	  /* Calling the behaviors and printing the details of personA */
	  System.out.println("PersonA Height is " + personA.getHeight());
	  System.out.println("PersonA Weight is " + personA.getWeight());
	  System.out.println("PersonA color is " + personA.getColor());
	  System.out.println("PersonA country is " + personA.getCountry());
	  System.out.println();

	  /* Calling the behaviors and printing the details of personB */
	  System.out.println("PersonB Height is " + personB.getHeight());
	  System.out.println("PersonB Weight is " + personB.getWeight());
	  System.out.println("PersonB color is " + personB.getColor());
	  System.out.println("PersonB country is " + personB.getCountry());
	 }

}
