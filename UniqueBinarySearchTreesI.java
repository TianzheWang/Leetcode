/**
public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int x) {
		this.val = x;
	}
}
*/

public class Solution {
	public int numTrees(int n) {
		int[] dynamic = new int[n + 1];
		dynamic[0] = 1;
		dynamic[1] = 1;
		for (int i = 2; i < n + 1; i++) {
			for (int j = 0; j < i; j++) {
				dynamic[i] += dynamic[j] * dynamic[i - j - 1];
			}
		}
		return dynamic[n];
	}
}