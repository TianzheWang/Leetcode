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
	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums.length == 0) return null;
		return sortedArrayToBST(nums, 0, nums.length - 1);
	}

	private TreeNode sortedArrayBST(int[] nums, int start, int end) {
		if (start > end) return null;
		TreeNode root = new TreeNode(nums[(start + end) / 2]);
		root.left = sortedArrayBST(nums, start, (start + end) / 2 - 1);
		root.right = sortedArrayBST(nums, (start + end) / 2 + 1, end);
		return root;
	}
}