import java.math.BigInteger;

public class Q016_PowerDigitSum {
	public static void main(String[] args) {
		System.out.println(run());
	}
	
	public static String run() {
		String temp = BigInteger.ONE.shiftLeft(1000).toString();
		int sum = 0;
		for (int i = 0; i < temp.length(); i++)
			sum = sum + Integer.parseInt(String.valueOf(temp.charAt(i)));
		return Integer.toString(sum);
	}
	
}