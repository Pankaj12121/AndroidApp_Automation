package J11.com.demo.oops.interfaces;

public class AddPolicyRider implements PolicyInterface{

	@Override
	public void LaunchBrowser(String Chrome) {
		switch (Chrome) {
		case "mozilla":

			System.out.println("Launch Browser- Mozilla");
			break;

		case "ie":

			System.out.println("Launch Browser- IE");
			break;

		case "Chrome":

			System.out.println("Launch Browser- Chrome");
			break;

		}
		
	}
	@Override
	public void countryScope(String country) {
		System.out.println(country);
		
	}
	public static void main(String[] args) {
		AddPolicyRider apr= new AddPolicyRider();
		apr.addPolicyRider(maxRiderSumAssured, minRiderSumAssured);
		apr.countryScope(country);
	}

}
