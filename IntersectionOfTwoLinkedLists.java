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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        int dif = getLength(headA) - getLength(headB);
        if(dif > 0){
            //length of headA is longer than headB;
            while(dif>0){
                headA = headA.next;
                dif--;
            }
        }
        else if(dif < 0){
            //length of headB is longer than headA;
            while(dif<0){
                headB = headB.next;
                dif++;
            }
        }
        while(headA.val != headB.val){
            if(headA.next == null){
                return null;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    public int getLength(ListNode head){
        int length = 0;
        while(head != null){
            head = head.next;
            length++;
        }
        return length;
    }
}