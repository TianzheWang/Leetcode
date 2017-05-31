/**
public TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int x) {
		this.val = x;
	}
}
*/

/**
Postorder direction: left->root->right
*/

public class Solution {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		if (root == null) return result;

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.peek();
			if (node.left == null && node.right == null) {
				stack.pop();
				result.add(node.val);
			}
			if (node.right != null) {
				stack.push(node.right);
				node.right = null;
			}
			if (node.left != null) {
				stack.push(node.left);
				node.left = null;
			}
		}

		return result;
	}
}