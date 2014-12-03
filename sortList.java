/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        return mergesort(head);
    }
    public ListNode mergesort(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        //get the middle node
        ListNode walker = head;
        ListNode runner = head;
        while(runner.next != null && runner.next.next != null){
            walker = walker.next;
            runner = runner.next.next;
        }
        //cut into two list
        ListNode new2 = walker.next;
        walker.next = null;
        ListNode new1 = head;
        new1 = mergesort(new1);
        new2 = mergesort(new2);
        return merge(new1, new2);
    }
    public ListNode merge(ListNode h1, ListNode h2) {
        ListNode result = new ListNode(0);              //init a list
        result.next = h1;
        ListNode pre = result;
        while(h1 != null && h2 != null){
            if(h1.val < h2.val){
                h1 = h1.next;
            }
            else{
                //insert between pre and pre.next(which is h1)
                ListNode next = h2.next;
                h2.next = h1;       //could use both this and h2.next = pre.next;But I think pre.next is better
                pre.next = h2;
                h2 = next;
            }
            pre = pre.next;
        }
        //here is important, link the end of h1 to h2
        if( h2 != null){
            pre.next = h2;  //couldn't use h1.next = h2;
        }
        return result.next;
    }
}