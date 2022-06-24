package com.demo.trivials;

import java.util.Arrays;

public class CodeChallenge {

	public static void main(String[] args) {
		// m4();
		// System.out.println(m5(8));
		m6();
	}

	public static void m1() {
		System.out.println("*\n**\n***\n****\n*****");
	}

	public static void m2(int x) {
		/*
		 * A school has following rules for grading system: a. Below 25 - F b. 25 to 45
		 * - E c. 45 to 50 - D d. 50 to 60 - C e. 60 to 80 - B f. Above 80 - A Ask user
		 * to enter marks and print the corresponding grade.
		 */

		if (x < 25) {
			System.out.println("F");
		} else if ((x >= 25) && (x < 45)) {
			System.out.println("E");
		} else if ((x >= 45) && (x < 50)) {
			System.out.println("D");
		} else if ((x >= 50) && (x < 60)) {
			System.out.println("C");
		} else if ((x >= 60) && (x < 80)) {
			System.out.println("B");
		}
	}

	public static void m3() {
		int x = 2;
		int y = 5;
		int z = 0;
		/*
		 * If x = 2 y = 5 z = 0 then find values of the following expressions: a. x == 2
		 * b. x != 5 c. x != 5 && y >= 5 d. z != 0 || x == 2 e. !(y < 10)
		 */

		if (x == 2)
			System.out.println(" x has value 2");
		else
			System.out.println(" x has a value other than 2 ");

		if (x != 5)
			System.out.println(" x value is other than 5");
		else
			System.out.println(" x value is 5 ");

		if (x != 5 && y >= 5)
			System.out.println(" x value is other than 5 and y has value 5 or more than 5");
		else
			System.out.println(" x  value is 5 and y has value which is less than 5");

		if (z != 0 || x == 2)
			System.out.println("either z has value more than 0 or x has 2 value");
		else
			System.out.println("either z has value  0 or x has value more than 2");

		if (!(y < 10))
			System.out.println("Y has greater value than 10");
		else
			System.out.println("Y is less than 10");

	}

	public static void m4() {
		boolean flag = false;

		for (int i = 1; i < 6; i++) {

			// if (i <= 1 || i <= 2 || i <= 3 || i <= 4 || i <= 5)

			System.out.println(" ");
			if (!flag) {
				for (int k = i; k <= 6; k++) {
					System.out.print(" ");
					flag = true;
				}
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
				flag = false;
			}

			// System.out.println("\n");
		}
	}

	public static boolean m5(int x) {

		boolean prime = true;
		if (x > 1) {
			for (int i = 2; i < x; i++) {
				if (x % i == 0) {
					prime = false;
					break;
				}
			}
		} else {
			prime = false;
		}
		return prime;
	}

	public static void m6() {

		int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] b = new int[10];
		System.out.println(a.length);
		int j = 0;
		for (int i = a.length-1; i > 0; i--) {
			b[j] = a[i];
			j++;
		}
		System.out.println(Arrays.toString(b));
	}

}
