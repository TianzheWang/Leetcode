public class Solution {
	public int reverse(int x) {
		int result = 0;
		while (x != 0) {
			int tmp = result * 10 + x % 10;
			x = x / 10;

			if (tmp / 10 != result) {
				result = 0;
				break;
			}

			result = tmp;
		}
		return result;
	}
}