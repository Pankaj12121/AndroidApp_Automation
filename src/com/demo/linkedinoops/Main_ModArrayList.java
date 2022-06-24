package com.demo.linkedinoops;

public class Main_ModArrayList {

	public static void main(String[] args) {
		ModArrayList modList = new ModArrayList();
		modList.add(10);
		modList.add(20);
		modList.add(30);
		modList.add(40);
		System.out.println(modList.getUsingMod(-1));
		System.out.println(modList.getUsingMod(2));
		System.out.println(modList.getUsingMod(40));
	}

}
