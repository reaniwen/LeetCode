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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {  
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();  
        if (root == null)  
            return result;  
        Queue<TreeNode> queue = new LinkedList<TreeNode>();  
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();  
        queue.add(root);  
          
        while (!queue.isEmpty()){  
            ArrayList<TreeNode> tempList = new ArrayList<TreeNode>();  
            ArrayList<Integer> tempValueList = new ArrayList<Integer>();  
            
            while (!queue.isEmpty()){  
                TreeNode node = queue.remove();  
                tempList.add(node);  
                tempValueList.add(node.val);  
            }  
            list.add(tempValueList);  
              
            for (int i=0; i<tempList.size(); ++i){  
                TreeNode node = tempList.get(i);  
                if (node.left != null){  
                    queue.add(node.left);  
                }  
                if (node.right != null){  
                    queue.add(node.right);  
                }  
            }  
        }  
        return list;  
    }  
}