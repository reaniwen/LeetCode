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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int depth = calDepth(root);
        if(depth == -2){
            return false;
        }
        return true;
    }
    public int calDepth(TreeNode node) {
        if(node == null){
            //System.out.println("depth of this node is 0");
            return 0;
        }
        int left = calDepth(node.left);
        int right = calDepth(node.right);
        if(left == -2 || right == -2){
            return -2;
        }
        if(Math.abs(left - right)>1){
            //System.out.println("inblanced");
            return -2;
        }else{
            int depth = Math.max(left,right)+1;
            //System.out.println("depth of"+ node.val +" is " + depth);
            return depth;
        }
    }
}