package J10.com.demo.oops.abstraction;

public abstract class SendSMS {

	boolean connectionFlag;
	boolean DNDFlag;
	boolean TelecomRulesFlag;
	
	
	//*********************** Abstract Methods *************************************
	abstract public void eastablishConnectionWithYourTower();

	abstract public void destroyConnectionWithYourTower();
	
	
	//*********************** Concrete Methods *************************************
	public void sendSMS() {

		if (connectionFlag == true) {
			System.out.println("Operator can send SMS");
		} else {
			System.out.println("Operator can not send SMS");
		}

	}

	public void checkForDND() {

		if (DNDFlag == true) {
			System.out.println("DND is set and workind");
		} else {
			System.out.println("DND is not Set");
		}

	}

	public void checkForTelecomRules() {

		if (TelecomRulesFlag == true) {
			System.out.println("All telecom rules implemented");
		} else {
			System.out.println("All Telecom rules not implemented");
		}

	}
}
