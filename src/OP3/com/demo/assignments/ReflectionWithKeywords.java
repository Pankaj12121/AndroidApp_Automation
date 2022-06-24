package OP3.com.demo.assignments;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionWithKeywords {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String step1 = "Login";
		String step2 = "crateOrder";
		String step3 = "EditOrder";
		String step4 = "DeleteOrder";
		
		Method method= ReflectionWithKeywords.class.getMethod(step1, String.class);
		method.invoke(method);

	}

	public static void Login(String arg) {

		System.out.println("Login to the app-" + arg);

	}

	public static void crateOrder(String arg) {

		System.out.println("Create order in the app-" + arg);

	}

	public static void EditOrder(String arg) {

		System.out.println("Edit order in the app-" + arg);

	}

	public static void DeleteOrder(String arg) {

		System.out.println("Cancel order in the app-" + arg);

	}

}
