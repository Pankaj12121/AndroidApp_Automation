package J10.com.demo.oops.abstraction;

class Vodafone extends SendSMS{

	 @Override
	 public void eastablishConnectionWithYourTower() {
	 System.out.println("connecting using Vodafone way"); 
	 }

	 @Override
	 public void destroyConnectionWithYourTower() {
	  System.out.println("destroying connection using Vodafone way");
	 }
	 
	}

	