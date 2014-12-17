public class Q014_LongestCollatzSequence {

	public static void main(String[] args) {
		int n = 0;
		int maxI = 0;
		int maxCount = 0;
//		for (int i = 500; i >= 0; i--) {
		for (int i = 1; i <= 9; i++) {
			
			n = i;
			int count = 0;
			while(n > 1){

				if(n%2 == 0)
					n = n/2;
				else
					n = 3*n+1;
				count++;
//				if(n > 1000000)
//					System.out.println(n);
			}
			if(count+1 >= maxCount){
				maxCount = count+1;
				maxI = i;
			}
			//			System.out.println(count+1);
		}
		System.out.println(maxI+" "+maxCount);
	}
}
