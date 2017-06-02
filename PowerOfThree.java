/**
This is a standard form of finding integer's power.
*/

public class Solution {
	public boolean isPowerOfThree(int n) {
		if (n == 1) return true;
		while (n > 0) {
			int m = n % 3;
			if (m == 0) {
				n = n / 3;
				if (n == 1) return true;
			}
			else return false;
		}
		return false;
	}
}