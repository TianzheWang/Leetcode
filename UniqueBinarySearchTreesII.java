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
	public List<TreeNode> generateTrees(int n) {
		if (n == 0) return new ArrayList<>();
		return generateTrees(1, n);
	}

	private List<TreeNode> generateTrees(int start, int end) {
		List<TreeNode> result = new ArrayList<>();
		if (start > end) {
			result.add(null);
			return result;
		}

		for (int i = start; i < end + 1; i++) {
			List<TreeNode> leftNodes = generateTrees(start, i - 1);
			List<TreeNode> rightNodes = generateTrees(i + 1, end);
			for (TreeNode leftNode : leftNodes) {
				for (TreeNode rightNode : rightNodes) {
					TreeNode root = new TreeNode(i);
					root.left = leftNode;
					root.right = rightNode;
					result.add(root);
				}
			}
		}
		return result;
	}
}