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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root == null){
            return result;
        }
        Stack<TreeNode> treeStack = new Stack<TreeNode>();
        Stack<Integer> timesStack = new Stack<Integer>();
        treeStack.push(root);
        timesStack.push(0);
        while(!treeStack.isEmpty()){
            TreeNode currNode = treeStack.pop();
            int currTime = timesStack.pop();
            if(currTime == 0){
                treeStack.push(currNode);
                timesStack.push(1);
                if(currNode.right != null){
                  treeStack.push(currNode.right);
                  timesStack.push(0);
                }
                if(currNode.left != null){
                    treeStack.push(currNode.left);
                    timesStack.push(0);
                }
            }
            else{
                result.add(currNode.val);
            }
        }
        return result;
    }
}