/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	Find the sum of all the primes below two million (2000000).
	
	Answer: 142913828922
 */

package com.projecteuler.solutions;

public class Q010_SummationOfPrimes {

	public static void main(String[] args) {
		long count  = 0;
		for (int i = 1; i <= 2000000; i++) {
			if(Library.isPrime(i)){
//			System.out.println(i);
			count += i; 
			}
		}
		System.out.println("Sum of Prime Numbers: "+count);
	}
	
	private static boolean isPrime(int a){
		if(a == 1){
			return false;
		}
		int i=1;
		while(i<a){
			if(i==1) {
				i=i+2;
				continue;
			}
			if(a%i == 0){
				return false;
			}
			i=i+2;
		}
		return true;
	}

}
