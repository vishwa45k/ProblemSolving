/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root== null|| root.left==null || root.right==null)
        {
            return root;
            
        }
        Queue<Node> q= new ArrayDeque<>();
        q.add(root);
        while(q.size()>0)
        {
            ArrayList<Node> al=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                Node temp=q.remove();
                al.add(temp);
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
                
            }
            for(int i=0;i<=al.size()-2;i++)
            {
                Node t1=al.get(i);
                Node t2=al.get(i+1);
                t1.next=t2;
            }
        }
        return root;
    }
}