
package com.usky.test.number;

public class NumberTest {
	
	public static void main(String[] args) {
		System.out.println(Integer.valueOf("32") == new Integer(32));
		System.out.println(Integer.valueOf("1000") == new Integer(1000));
		Integer i1 = 32;
		Integer i2 = 1000;
		Integer i3 = new Integer(i1);
		System.out.println(Integer.valueOf("32") == i1);
		System.out.println(Integer.valueOf("1000") == i2);
		System.out.println(i3 == i1);
		System.out.println(Integer.valueOf("32") == Integer.valueOf("32"));
	}
	
}
