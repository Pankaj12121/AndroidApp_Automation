package OP1.com.demo.thiskeyword;

public class WithoutThisKeyword {

	int a;
	int b;

	public WithoutThisKeyword(int a, int b){
		this.a=a;
		this.b=b;
	}

	public static void main(String[] args) {

		WithoutThisKeyword obj = new WithoutThisKeyword(10, 20);

		System.out.println(obj.a);
		System.out.println(obj.b);

	}

}



