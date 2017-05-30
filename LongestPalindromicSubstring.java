public class Solution {
	public String longestPalindrome(String s) {
		if (s == null || s.length() == 0) return s;

		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length(); i++) {
			String t = palindrome(s, i, i);
			if (t.length() > longest.length()) longest = t;
			t = palindrome(s, i, i + 1);
			if (t.length() > longest.length()) longest = t;
		}

		return longest;
	}

	private String palindrome(String s, int begin, int end) {
		while (begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)) {
			begin--;
			end++;
		}
		return s.substring(begin + 1, end);
	}
}