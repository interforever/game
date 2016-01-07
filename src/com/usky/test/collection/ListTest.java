
package com.usky.test.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		addNullTest();
		iteratorTest();
		subListTest();
	}
	
	private static void addNullTest() {
		List<String> list = new ArrayList<String>();
		list.add(null);
		list.add("a");
		list.add(null);
		System.out.println(list.size());
	}
	
	private static void iteratorTest() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer i = iterator.next();
			if (i % 3 == 0) {
				iterator.remove();
			} else {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	private static void subListTest() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> subList1 = list.subList(0, 4);
		List<Integer> subList2 = list.subList(4, 5);
		for (Integer i : subList1) {
			System.out.println(i);
		}
		System.out.println();
		for (Integer i : subList2) {
			System.out.println(i);
		}
	}
	
}
