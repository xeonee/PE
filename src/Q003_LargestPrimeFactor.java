/*
 * 	The prime factors of 13195 are 5, 7, 13 and 29.
	What is the largest prime factor of the number 600851475143 ?
	ANS: 6857
 */
public class Q3 {

	public static void main(String[] args) {
		long n = 600851475143l ;
		int lastFactor = 0;
		
		if(n%2==0){
			lastFactor = 2;
			n = n/2;
			while(n%2==0){
				n = n/2;
			}
		}
		else {
			lastFactor = 1;
		}
		
		int factor = 3;
		int maxFactor = (int) Math.sqrt(n);
		while(n>1 && factor <= maxFactor){
			if(n%factor==0){
				lastFactor = factor;
				n = n/factor;
				while(n%factor == 0){
					n=n/factor;
				}
				maxFactor= (int) Math.sqrt(n);
			}
			factor=factor+2;
		}
		if(n==1)
		System.out.println(lastFactor);
		else System.out.println(n);
	}
	
}