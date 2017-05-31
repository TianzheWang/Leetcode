/**
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int x) {
		this.val = x;
	}
}
*/

/*
Inorder direction: left->root->right
*/

public class Solution {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode curr = root;

		while (curr != null || !stack.isEmpty()) {
			if (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}
			else {
				TreeNode tmp = stack.pop();
				result.add(tmp.val);
				curr = tmp.right;
			}
		}
		return result;
	}
}