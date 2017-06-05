public class Solution {
	public TreeNode sortedListToBST(ListNode head) {
		if (head == null) return null;
		List<Integer> list = new ArrayList<>();
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}
		int[] nums = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			nums[i] = list.get(i);
		}
		return sortedListToBST(nums, 0, nums.length - 1);
	}

	private TreeNode sortedListToBST(int[] nums, int start, int end) {
		if (start > end) return null;
		TreeNode root = new TreeNode(nums[(start + end) / 2]);
		root.left = sortedListToBST(nums, start, (start + end) / 2 - 1);
		root.right = sortedListToBST(nums, (start + end) / 2 + 1, end);
		return root;
	}
}