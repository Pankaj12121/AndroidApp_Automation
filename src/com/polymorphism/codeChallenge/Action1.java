package com.polymorphism.codeChallenge;

public class Action1 extends Base{

	public Action1(String Prank) {
		super.prank(Prank);
		Prank=Prank+" really?";
		prank(Prank);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void talk(String day) {
		super.talk(day);
	}

}
