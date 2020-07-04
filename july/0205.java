/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode p = l1;
    	ListNode q = l2;
    	ListNode root = new ListNode(0);
    	ListNode res = root;
    	int pre = 0;
    	while (p != null && q != null) {
    		int sum = p.val + q.val + pre;
    		int now = sum % 10;
    		pre = sum / 10;
    		ListNode nxt = new ListNode(now);
    		root.next = nxt;
    		root = nxt;
    		p = p.next;
    		q = q.next;
    	}
    	if (p != null) {
    		while (p != null && pre > 0) {
    			int sum = p.val + pre;
	    		int now = sum % 10;
	    		pre = sum / 10; // pre  == 1
	    		ListNode nxt = new ListNode(now);
	    		root.next = nxt;
	    		root = nxt;
	    		p = p.next;
    		}
    		if (p == null && pre > 0) {
    			ListNode nxt = new ListNode(pre);
    			root.next = nxt;
    		} else if (p != null && pre == 0) {
    			root.next = p;
    		}
    	}
    	else if (q != null) {
    		while (q != null && pre > 0) {
    			int sum = q.val + pre;
	    		int now = sum % 10;
	    		pre = sum / 10; // pre  == 1
	    		ListNode nxt = new ListNode(now);
	    		root.next = nxt;
	    		root = nxt;
	    		q = q.next;
    		}
    		if (q == null && pre > 0) {
    			ListNode nxt = new ListNode(pre);
    			root.next = nxt;
    		} else if (q != null && pre == 0) {
    			root.next = q;
    		}
    	} else if (pre > 0) {
            ListNode nxt = new ListNode(pre);
            root.next = nxt; 
        }
    	return res.next;
	}
}

