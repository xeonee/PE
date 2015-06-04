import java.util.HashMap;
import java.util.Map;

public class Q014_LongestCollatzSequence {

	public static void main(String[] args) {System.out.println(solve(1000000));}
	
    public static long solve(int max) {
        final Map<Long, Long> collatzLengthOf = new HashMap<Long, Long>();
        long longest = 1;
        long longestLength = 1;
        collatzLengthOf.put(1L, 1L);
        
        for (long i = 2; i < max; i++) {
            if (!collatzLengthOf.containsKey(i)) {
                long length = getCollatzSequenceLength(collatzLengthOf, i);
                collatzLengthOf.put(i, length);
                if (length > longestLength) {
                    longestLength = length;
                    longest = i;
                }
            }
        }
        return longest;
    }

    public static long getCollatzSuccessor(long n) {
        return (n % 2 == 0) ? n / 2 : 3 * n + 1;
    }

    private static long getCollatzSequenceLength(Map<Long, Long> collatzLengthOf, long n) {
        Long length = collatzLengthOf.get(n);
        if (length == null) {
            length = 1L + getCollatzSequenceLength(collatzLengthOf, getCollatzSuccessor(n));
        }
        return length;
    }

    
}