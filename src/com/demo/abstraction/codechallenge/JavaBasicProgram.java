package com.demo.abstraction.codechallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaBasicProgram {

	/*
	 * Write a program to print Quotient and Remainder of a division of two numbers.
	 * The values of Dividend and Divisor should be accepted from the user.
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		quotientAndReminder();
		yearWeekDay();
		GSTCalc();
		calculateCircleRadius();

	}

	public static void quotientAndReminder() {
		int dividend = 2334, divisor = 343;

		int quotient = dividend / divisor;
		int remainder = dividend % divisor;

		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
	}

	/*
	 * Write a program to accept the number of days from the user and display it
	 * after converting the days into number of years, months and days.
	 */

	public static void yearWeekDay() {
		int m = 0, year, week, day;
		Scanner s = new Scanner(System.in);
		System.out.println("Number of days:" + m);
		m = s.nextInt();
		year = m / 365;
		m = m % 365;
		System.out.println("No. of years:" + year);
		week = m / 7;
		m = m % 7;
		System.out.println("No. of weeks:" + week);
		day = m;
		System.out.println("No. of days:" + day);
	}

	/*
	 * A shopkeeper offers a 10% discount on the printed price of a Digital
	 * Camera.However, a customer has to pay 6% GST on the remaining amount.Write a
	 * program in Java to calculate the amount to be paid by the customer taking the
	 * printed price as an input.
	 */

	public static void GSTCalc() throws NumberFormatException, IOException {
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		double a;
		double dis, ra, st, pa;
		System.out.println("Enter the marked price of the camera");
		a = Double.parseDouble(in.readLine());
		dis = 30.0 / 100.0 * a;
		ra = a - dis;
		st = 6.0 / 100.0 * a;
		pa = ra + st;
		System.out.println("paid amount=" + pa);

	}

	/*
	 * Write a program to find the perimeter of a circle whose diameter is given by
	 * the user.
	 */

	public static void calculateCircleRadius() {
		double radius = 7.5;

		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;

		System.out.println("Perimeter is = " + perimeter);
		System.out.println("Area is = " + area);

	}

}
