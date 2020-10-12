/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode p = head; 
        ListNode pre = head;
        while (p !=  null) {
            if (p.val >= x) {
                break;
            }
            pre = p;
            p = p.next;
        }
        ListNode q = p;
        ListNode qre = p;
        // System.out.println(q.val);

        while (q != null) {
            if (q.val < x) {
                int value = q.val;
                q = q.next;
                qre.next = q;
                ListNode k = new ListNode(value);
                if (pre == p) {
                    k.next = p;
                    pre = k; 
                    head = k;   
                } else {
                    pre.next = k;
                    k.next = p;
                    pre = k; 
                }
                continue;
            }
            qre = q;
            q = q.next;
        }
        return head;
    }
}
