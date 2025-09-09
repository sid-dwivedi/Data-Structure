package Tree;
//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/?envType=problem-list-v2&envId=tree
//Leetcode-116
public class PopulatingNextRight {
    public static TreeNode connect(TreeNode root){
       if (root==null) return null;
       TreeNode leftMost=root;
       while (leftMost.left!=null){
           TreeNode current=leftMost;
           while (current!=null){
               current.left.next=current.right;
               if (current.next!=null) current.right.next=current.next.left;
               current=current.next;
           }
           leftMost=leftMost.left;
       }
       return root;
    }
}
