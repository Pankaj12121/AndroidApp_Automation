package J11.com.demo.oops.interfaces;

public class CreatePolicy implements PolicyInterface {

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

	/*public void issuePolicy(int policyMaxAge,int policyMinAge,int maxSumAssured) {
		System.out.println(policyMaxAge);
		System.out.println(policyMinAge);
		System.out.println(maxSumAssured);

		
	}*/
	
	@Override
	public void countryScope(String country) {
		
		System.out.println(country);
		
	}

	public static void main(String[] args) {
		CreatePolicy cr = new CreatePolicy();
		cr.LaunchBrowser("Chrome");
		cr.issuePolicy(policyMaxAge, policyMinAge, maxSumAssured);
		cr.countryScope(country);
	}

	

}
