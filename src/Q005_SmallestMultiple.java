/*
 * 	2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Q5 {

	public static void main(String[] args) {
		
		int n = 11;
		while(true){
			boolean flag = true;
			for (int i = 1; i <= 100; i++) {
				if(n%i != 0){
					flag = false;
					break;
				}
				flag = flag && true;
			}
			if(flag)
				break;
			n++;
		}
		System.out.println(n);
	}
}
