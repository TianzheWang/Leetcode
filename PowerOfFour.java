public class Solution {
	public boolean isPowerOfFour(int num) {
		if (num <= 0) return false;
		if (num == 1) return true;
		while (num >= 4) {
			int m = num % 4;
			if (m == 0) {
				num = num / 4;
				if (num == 1) return true;
			}
			else return false;
		}
		return false;
	}
}