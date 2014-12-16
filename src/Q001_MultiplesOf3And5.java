
/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * ANS: 233168
 */

public class Q1 {

	public static void main(String[] args) {
		System.out.println(sumDivisibleBy(3)+sumDivisibleBy(5)-sumDivisibleBy(15));
	}
	
	public static long sumDivisibleBy(int n){
	 long p = 0; 
	 long target = 1000;
		p=target/n;
	 return n*(p*(p+1)) / 2;
	}
}
