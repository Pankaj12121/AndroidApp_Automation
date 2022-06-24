package J11.com.demo.oops.interfaces;

public interface PolicyInterface {
	
	public int policyMaxAge=60;
	public int policyMinAge=18;
	public int maxSumAssured=100000000;
	public int minSumAssured=10000;
	public String country="India";
	public int maxRiderSumAssured=5000000;
	public int minRiderSumAssured=15000;
	
	
	public void LaunchBrowser(String Chrome);
	
	public default void issuePolicy(int policyMaxAge,int policyMinAge,int maxSumAssured) {
		System.out.println(policyMaxAge);
		System.out.println(policyMinAge);
		System.out.println(maxSumAssured);

		
	}
	
	public default void addPolicyRider(int maxRiderSumAssured,int minRiderSumAssured) {
		
		System.out.println("Max Rider Sum Assured is "+maxSumAssured);
		System.out.println("Minimum Rider Sum Assured is "+minSumAssured);
		
	}
	
	public void countryScope(String country);
}
