package com.polymorphism.codeChallenge;

public class Driver {
public static void main(String[] args) {
	Action2 pa= new Action2(" not funny ");
	
	Base b1= new Action1(" really funny, ");
	b1.talk("Monday");
	Base b2= new Action2(" really great, ");
	b2.talk("Tuesday");
}
}
