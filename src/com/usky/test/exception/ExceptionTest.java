
package com.usky.test.exception;

public class ExceptionTest {
	
	static void printException(Exception e) {
		System.out.println("It's exception!");
		if (e instanceof TestException) {
			System.out.println("It's also test exception!");
		}
	}
	
	static void printException(TestException e) {
		System.out.println("It's test exception!");
	}
	
	public static void main(String[] args) {
		try {
			throw new TestException();
		} catch (Exception e) {
			printException(e);
		}
	}
}

class TestException extends Exception {
	
	private static final long serialVersionUID = 6917664311730456324L;
	
}
