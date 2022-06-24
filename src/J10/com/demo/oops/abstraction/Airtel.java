package J10.com.demo.oops.abstraction;

class Airtel extends SendSMS{

	 @Override
	 public void eastablishConnectionWithYourTower() {
	  System.out.println("connecting using Airtel way");
	 }

	 @Override
	 public void destroyConnectionWithYourTower() {
	  System.out.println("destroying connection using Airtel way");
	 }
}