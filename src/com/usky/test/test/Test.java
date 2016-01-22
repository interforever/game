
package com.usky.test.test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.usky.test.interfaces.TestInterface;

public class Test {
	
	public static void print(String str) {
		try {
			throw new IndexOutOfBoundsException("3");
		} catch (Exception e) {
			e.printStackTrace();
			StackTraceElement ele = e.getStackTrace()[0];
			System.out.println("新HR人员离职信息失败,原因: " + e.getClass().getName() + ": " + e.getMessage() + " at " + ele.getClassName() + "." + ele.getMethodName() + "(" + ele.getLineNumber() + ")");
			System.out.println("123");
		}
		TestInterface testInterface = new TestInterface() {
			
			public String add() {
				return "str" + "Tech";
			}
		};
		str = testInterface.add();
	}
	
	public static void main(String[] args) {
		String s = " a  ";
		String[] ss = s.split(" ");
		for (String sss : ss) {
			System.out.println("123:" + sss);
		}
		int i = 0;
		do {
			if (i % 2 == 0) {
				System.out.println(i + "*");
				continue;
			} else {
				System.out.println(i + "#");
				continue;
			}
		} while (i++ < 5);
		Calendar c = new GregorianCalendar();
		System.out.println(c.get(Calendar.YEAR) + "-" + c.get(Calendar.MONTH) + "-" + c.get(Calendar.DAY_OF_MONTH));
		print("");
	}
}
