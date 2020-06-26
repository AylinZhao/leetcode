/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
    	ListNode nxt_node = node.next;
    	int nxt_val = nxt_node.val;
    	node.val = nxt_val;
    	ListNode nxt_nxt_node = nxt_node.next;
    	node.next = nxt_nxt_node;
    	return;
    }
}