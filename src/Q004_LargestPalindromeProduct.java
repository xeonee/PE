/*
 * 	A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
	Find the largest palindrome made from the product of two 3-digit numbers.
	ANS: 906609
 */

public class Q4 {

	public static void main(String[] args) {
		int max = 0, count = 0;
		int a = 999, b = 0, db = 0;

		while(a >= 100){
			if(a%11==0){
				b = 999;
				db = 1;
			}
			else {
				b = 990;
				db = 11;
			}

			while(b>=a){
				if(a*b <= max)
					break;
				if(isPalindrom(a*b))
					max = a*b;
				b = b - db;
				count++;
			}
			a--;
		}
		System.out.println(max+" "+count);

	}
	public static void main1(String[] args) {
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
