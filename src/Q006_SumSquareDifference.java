/*
 * The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)^2 = 55^2 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

1+2+3+4+5....+n = n(n+1)/2
1^2 +2^2 +3^2 +n^2 = n(2n+1)(n+1)/6

 */
public class Q6 {

	public static void main(String[] args) {
		int sumOfHumdredNumbers = 100*101/2;
		int sumOfSquareOfHumdredNumbers = (100)*(201)*(101)/6;
				
		System.out.println(sumOfHumdredNumbers*sumOfHumdredNumbers-sumOfSquareOfHumdredNumbers);
	}

}
