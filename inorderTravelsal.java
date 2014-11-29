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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root == null){
            return result;
        }
        Stack<TreeNode> tempStack = new Stack<TreeNode>();
        Stack<Integer> times = new Stack<Integer>();
        tempStack.push(root);
        times.push(0);
        while (!tempStack.isEmpty()){
            TreeNode currNode = tempStack.pop();
            int currTime = times.pop();
            
            if (currTime == 1){
                result.add(currNode.val);
            }
            if(currTime == 0){
                if(currNode.right != null){
                    tempStack.push(currNode.right);
                    times.push(0);
                }
                tempStack.push(currNode);
                times.push(1);
                if(currNode.left != null){
                    tempStack.push(currNode.left);
                    times.push(0);
                }
            }
        }
        return result;
    }
}