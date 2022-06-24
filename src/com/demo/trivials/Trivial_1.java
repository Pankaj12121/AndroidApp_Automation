package com.demo.trivials;

public class Trivial_1 {

	public static void main(String[] args) {
		long unixTime = System.currentTimeMillis() / 1000L;
		System.out.println(unixTime);
		// ex1();
		// ex2();
		// ex3();
		// ex4();
		// ex5();
		// ex6();
		// ex7();
		// ex8();
		// ex9();
		// ex10();
		// ex11();
		// ex12();
		// ex13();
		// ex14();
		// ex15();
		//ex16();
		//ex17();
		ex18();
	}

	public static void ex1() {
		int a = 1, b = 3;

		while (a <= b) {

			while (b >= 1) {
				System.out.println(a + "" + b);
				b--;
			}

		}
	}

	public static void ex2() {
		for (int i = 3; i <= 4; i++) {
			for (int j = 2; j < i; j++) {
				System.out.print("Bell ");
			}
			System.out.println("Tring Tring");
		}
	}

	public static void ex3() {

		int a = 1, b = 3;
		do {
			do {
				System.out.println(a + "" + b);
				b--;
			} while (b >= 1);
			a++;
		} while (a <= 3);
	}

	public static void ex4() {
		int a = 5, b = 6;
		if ((b = 1) == a)
			System.out.println(b);
		else
			System.out.println(++b);
	}

	public static void ex5() {
		int a = 10, b = 11;

		int c = a++ + (b++);
		int d = a + b;
		int e = a * ++b;
		int f = a * b++;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

	}

	public static void ex6() {
		// What value will be stored in c
		int a = 43, b = 8;
		int c = a / b;
		System.out.println(c);
	}

	public static void ex7() {
		// swap the value of variables
		int a = 20;
		int b = 100;
		int c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);

	}

	public static void ex8() {
		// choose correct answer 1) Exit 2)10 3)ExitBye10 4)Exit10
		int a = 10;
		switch (a++) {
		case 10:
			switch (a--) {
			default:
				System.out.print("Exit");
			case 10:
				System.out.print("Bye");
			}
		default:
			System.out.print(a);
		}

	}

	public static void ex9() {
		// choose correct answer 1) 0 2)18 3)3 4)4
		int a = 9;
		switch (a) {
		case 0:
			a++;
		case 9:
			a += a;
		default:
			a /= 5;
		}
		System.out.println(a);

	}

	public static void ex10() {
		// choose correct answer 1)m=3, n=14 2)m=6, n=14 3)m=6, n=11 4)compile time
		// error
		int m = 2;
		int n = 15;
		for (int i = 1; i < 5; i++) {
		}
		m++;
		--n;
		System.out.println("m : " + m);
		System.out.println("n : " + n);
	}

	public static void ex11() {
		// choose correct answer 1)110 2)90 3)101 4)No output

		int x = 100;
		for (int s = 1; s >= 10; s++) {
			System.out.println("S: " + s);
			System.out.println(x++);
		}
	}

	public static void ex12() {
		// choose correct answer 1)10 2)8 3)infinite loop 4) 2
		int x = 5, y = 50;
		while (x <= y)
			y = y / x;
		System.out.println(y);
	}

	public static void ex13() {
		// choose correct answer (1)3,3 (2)3,4 (3)No output (4) 2,3
		int i = 1;
		while (i++ <= 1) {
			i++;

			System.out.println(i + " in loop");
		}
		System.out.println(i);
	}

	public static void ex14() {
		// choose correct answer (1)10 6 4 3 2 2 1 1 1 1 (2)10 6 4 3 2 1 (3)10 6 3 4 2 5
		// 3 5 2 5 2 1 (4) 10 6 4 3 2 1 1 1
		int s = 1, j = 20;
		do {
			s++;
			System.out.println(j / s + " in Do loop");
			j--;
		} while (s < j);

	}

	public static void ex15() {
		// choose correct answer for last syso print (1)4 (2)0 (3)No optput (4) compile
		// error
		for (int s = 1; s <= 10; s++) {
			// System.out.println(s);
			if (s == 5)
				break;
			System.out.println(++s);

		}
	}

	public static void ex16() {
		// choose correct answer for last syso print (1)13:12 (2)14:11(3)No optput
		// (4)15:10
		int s = 10;
		for (int x = 15; x >= 1; x--) {
			if (x <= s)
				break;
			System.out.println(x + ":" + s++);
		}
	}

	public static void ex17() {

		
		for (int x = 65; x <= 75; x++) {

			if (x / 3 == 0 || x / 5 == 0)
				continue;
			if (x==66)
				continue;
				
			System.out.println(x);

		}

	}
	
	public static void ex18() {
		// choose correct answer for syso (1)5 (2)3 (3)No optput (4)24
		String s="";
		for(int i=2;i<7;i++) {
			if(i==3)
				continue;
			if(i==5)
				break;
			s=s+i;
			
		}
		System.out.println(s);
	}
}
