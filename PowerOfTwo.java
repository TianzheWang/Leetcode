/**
Idea: Move one bit left and back to compare, since power of two 
is 1000... in binary.
*/

public class Solution {
	public boolean isPowerOfTwo(int n) {
		if (n <= 0) return false;
		while (n > 2) {
			int change = (n >> 1) << 1;
			if (n != change) return false;
			n = n >> 1;
		}
		return true;
	}
}