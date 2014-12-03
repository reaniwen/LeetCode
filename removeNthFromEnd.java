/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n == 0)
            return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode pre = newHead;
        int steps = 1;
        while(steps <= n){
            fast = fast.next;
            steps++;
        }
        if(fast == null)
            return head.next;   //in case there is only one element in the list?
        while(fast.next != null){
            pre = pre.next;
            slow = slow.next;
            fast = fast.next;
        }
        if(slow.next != null)
            slow.next = slow.next.next;
        else // slow.next = null, i.e. I have to remove the last node
            pre.next = null;
        return head;
    }
}