/*
 * 	A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
	Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Q4 {
	public static void main(String[] args) {
		int max = 0, count = 0;
		
		for (int k = 999; k > 100; k--) {
			for (int k2 = 999; k2 > k; k2--) {
				if(isPalindrom(k*k2) && k*k2 > max){
					max = k*k2;
					break;
				}
				count++;
			}
		}
		System.out.println(max+" "+count);
	}

	private static boolean isPalindrom(int n){
		String str = String.valueOf(n);
		if(new StringBuilder(str).reverse().toString().equals(str)){
			return true;
		}
		return false;
	}
}
