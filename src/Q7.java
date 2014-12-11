import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 * 	By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

	What is the 10001st prime number?
 */

public class Q7 {

	public static void main(String[] args) {
		System.out.println(listPrime(1000000));
		}

	private static int listPrime(int n) {
		boolean[] primes = new boolean[n];
		Arrays.fill(primes, true);
		primes[0] = primes[1] = false;
		
		for (int i = 2; i < Math.sqrt(n); i++) {
			if(primes[i]){
				for (int j = 2; j*i < n; j++) {
					if(primes[j*i]){
						primes[j*i] = false;
					}
				}
			}
		}
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < primes.length; i++) {
			if(primes[i])
				res.add(i);
		}
		return res.get(10000);
	}

}
