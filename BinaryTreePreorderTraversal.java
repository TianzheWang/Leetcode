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
Preorder direction: root->left->right
*/

public class Solution {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();

		if (root == null) return result;

		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			result.add(node.val);
			if (node.right != null) stack.add(node.right);
			if (node.left != null) stack.add(node.left);
		}

		return result;
	}
}