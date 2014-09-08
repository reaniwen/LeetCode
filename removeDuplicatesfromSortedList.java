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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode checkPoint = head;
        while(checkPoint.next != null){
            if(checkPoint.val == checkPoint.next.val){
                checkPoint.next = checkPoint.next.next;
            }
            else{
                checkPoint = checkPoint.next;
            }
        }
        return head;
    }
}