package com.polymorphism.codeChallenge;

public class Action2 extends Action1 {
	String Prank;

	public Action2(String Prank) {
		super(Prank);
		Prank="it's "+Prank;
		this.Prank = Prank;
		prank(Prank);

	}
	@Override
	public void talk(String day) {
		super.talk(day);
	}

}
