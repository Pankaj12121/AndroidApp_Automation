package OP1.com.demo.thiskeyword;

public class WithThisKeyword {
	int a;
	int b;

	WithThisKeyword(int a, int b){

		this.a=a;
		this.b=b;

	}

	public static void main(String[] args) {

		WithThisKeyword obj = new WithThisKeyword(10, 20);

		System.out.println(obj.a);
		System.out.println(obj.b);

	}

}


