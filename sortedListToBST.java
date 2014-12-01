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
        root = recursion(array, 0, i-1, root);  
        array = null;  
        return root;  
    }  
    public TreeNode recursion(int[] array, int lhs, int rhs, TreeNode root)  
    {  
        if(lhs <= rhs)  
        {  
            int mid = (lhs + rhs) >> 1;  
            root = new TreeNode(array[mid]);  
            root.left = recursion(array, lhs, mid - 1, root.left);  
            root.right = recursion(array, mid + 1, rhs, root.right);  
        }  
        return root;  
    }  
}  