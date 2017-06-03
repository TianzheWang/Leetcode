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

/*
Use double only to pass some test cases. Better use integer to make it looks uniform.
*/

public class Solution {
	public boolean isValidBST(TreeNode root) {
		return isValidBST(root, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
	}

	public boolean isValidBST(TreeNode root, double max, double min) {
		if (root == null) return true;
		if (root.val <= min || root.val >= max) return false;
		return isValidBST(root.left, root.val, min) && isValidBST(root.right, max, root.val);
	}
}