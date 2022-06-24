package com.interview.overriding;

public class ExtendedOR extends BaseOR{
	
	
	@Override
	public void calculateIntrest(int a, int b) {
		
		int sum= a*b/100*15;
		System.out.println(sum);
	
	}
	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return super.sub(a, b);
	}
	

}
