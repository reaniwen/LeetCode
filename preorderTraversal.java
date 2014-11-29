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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null){
            return result;
        }
        Stack<TreeNode> noodStack = new Stack<TreeNode>();
        noodStack.push(root);
        while(!noodStack.isEmpty()){
            TreeNode currNode = noodStack.pop();
            result.add(currNode.val);
            if(currNode.right != null){
                noodStack.push(currNode.right);
            }
            if(currNode.left != null){
                noodStack.push(currNode.left);
            }
        }
        return result;
    }
}