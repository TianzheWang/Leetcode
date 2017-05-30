/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/*
2->4->3 + 5->6->4 = 7->0->8
*/
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode initial = new ListNode(0);
		ListNode curr = initial;
		int carry = 0;

		while (l1 != null || l2 != null) {
			int val1 = l1 == null ? 0 : l1.val;
			int val2 = l2 == null ? 0 : l2.val;
			int sum = carry + val1 + val2;
			curr.next = new ListNode(sum % 10);
			carry = sum / 10;
			if (l1 != null) l1 = l1.next;
			if (l2 != null) l2 = l2.next;
			curr = curr.next;
		}

		if (carry > 0) curr.next = new ListNode(carry);

		return initial.next;
	}
}