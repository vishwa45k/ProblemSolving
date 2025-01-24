/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {

       List<Integer> result=new ArrayList<>();
       if(root==null)
       {
        return result;
       }
       Queue<TreeNode> a=new LinkedList<>();
       a.add(root);
       while(!a.isEmpty())
       {
        int size=a.size();
        for(int i=0;i<size;i++)
        {
            TreeNode current=a.poll();
            if(i==size-1)
            {
                result.add(current.val);
            }
            if(current.left!=null)
            {
                a.add(current.left);
            }
             if(current.right!=null)
            {
                a.add(current.right);
            }
        }
       }
       return result; 
    }
}