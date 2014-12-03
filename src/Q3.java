/*
 * 	The prime factors of 13195 are 5, 7, 13 and 29.
	What is the largest prime factor of the number 600851475143 ?
 */
public class Q3 {

	public static void main(String[] args) {
		
		long n = 600851475143l ;
		for (int i = 2; i < n ; i++) {
				if(n%i ==0 && isPrime(i) ){
					System.out.println(i);
				}
		}
		
	}

	
	
	
	
	private static boolean isPrime(int i) {
		if (i == 0) 
			return false;
		if (i == 1 || i == 2)
			return true;
		
		if(i % 2 == 0)
			return false;
					
		for (int j = 3; j < i; j=j+2) {
			if(i % j == 0)
				return false;
		}			

		return true;
	}
}
