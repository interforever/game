
package com.usky.test.math;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
	
	public static List<Integer> findPrime(int num) {
		return findPrime(1, num);
	}
	
	public static List<Integer> findPrime(int start, int end) {
		List<Integer> primeNumbers = new ArrayList<Integer>();
		for (int i = start; i <= end; i++) {
			
		}
		return primeNumbers;
	}
	
	public static void main(String[] args) {
		List<Integer> primeNumbers = findPrime(1000);
		for (Integer prime : primeNumbers) {
			System.out.println(prime);
		}
	}
	
}
