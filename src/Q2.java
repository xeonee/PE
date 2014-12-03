/*
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
   1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
   By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
   ANS: 
 */
public class Q2 {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c = 0;
		int sum = 0;
		
		while(sum <= 4000000){
			c = b+a;
			b = c+a;
			a = b+c;
			sum += c;
		}
		
		System.out.println(sum);
	}

}
