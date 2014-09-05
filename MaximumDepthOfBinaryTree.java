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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        else if(root.left == null){
            return maxDepth(root.right)+1;
        }
        else if(root.right == null){
            return maxDepth(root.left)+1;
        }
        else{
            int le = maxDepth(root.left);
            int ri = maxDepth(root.right);
            int dep = le>ri ? le+1 : ri+1;
            return dep;
        }
    }
}