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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        if(root != null){
            return isSym(root.left,root.right);
        }
        return true;
    }
    public boolean isSym(TreeNode left, TreeNode right){
        if (left == null){
            return right == null;
        }
        if (right == null){
            return left == null;
        }
        if (left.val != right.val){
            return false;
        }
        if(!isSym(left.left,right.right)){  //it's confusing here
            return false;
        }
        if(!isSym(left.right,right.left)){
            return false;
        }
        return true;                        //get rid of all the wrong conditon, then the last is right
    }
}