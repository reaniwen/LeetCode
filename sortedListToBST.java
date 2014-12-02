/** 
 * Definition for singly-linked list. 
 * public class ListNode { 
 *     int val; 
 *     ListNode next; 
 *     ListNode(int x) { val = x; next = null; } 
 * } 
 */ 
/** 
 * Definition for binary tree 
 * public class TreeNode {  
 *     int val; 
 *     TreeNode left; 
 *     TreeNode right; 
 *     TreeNode(int x) { val = x; } 
 * } 
 */ 
public class Solution {  
    public TreeNode sortedListToBST(ListNode head) {  
        // IMPORTANT: Please reset any member data you declared, as  
        // the same Solution instance will be reused for each test case.  
        if(head == null)  
            return null;  
        int len = 0;  
        ListNode tmp = head;  
        while(tmp != null)  
        {  
            len++;tmp = tmp.next;  
        }  
        int[] array = new int[len];  
        int i = 0;  
        tmp = head;  
        while(tmp != null)  
        {  
            array[i++] = tmp.val;  
            tmp = tmp.next;  
        }  
        TreeNode root = null;  
        root = recursion(array, 0, i-1);  
        array = null;  
        return root;  
    }  
    public TreeNode recursion(int[] array, int start, int end)  
    {  
        TreeNode root = null;
        if(start <= end)  
        {  
            int mid = (start + end) >> 1;  
            root = new TreeNode(array[mid]);  
            root.left = recursion(array, start, mid - 1);  
            root.right = recursion(array, mid + 1, end);  
        }  
        return root;  
    }  
}  