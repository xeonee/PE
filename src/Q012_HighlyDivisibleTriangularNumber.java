import java.util.ArrayList;
import java.util.List;

public class Q012_HighlyDivisibleTriangularNumber {
	public static List<Integer> lst = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		generateTriangularNumber(Integer.MAX_VALUE);
	}


	private static void generateTriangularNumber(int i) {
		int x = 0;
		
		for (int j = 1; j <= i; j++) {
			int count = 0;
			x = (j*(j+1))/2;
			for (int k = 1; k <= Math.sqrt(x); k++) {
				if(x%k == 0)
					count++;
			}
			if(count >= 500){
				System.out.println(x);
				break;
			}
		}
	}
}
