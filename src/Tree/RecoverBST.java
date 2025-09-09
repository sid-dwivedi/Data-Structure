package Tree;
//https://leetcode.com/problems/recover-binary-search-tree/?envType=problem-list-v2&envId=depth-first-search
//Leetcode-99
public class RecoverBST {
   static TreeNode first=null;
   static TreeNode second=null;
   static TreeNode prev=new TreeNode(Integer.MIN_VALUE);
    public static void recoverTree(TreeNode root){
      inorder(root);
      int temp=first.value;
      first.value= second.value;
      second.value=temp;
    }
    public static void inorder(TreeNode root){
        if (root==null) return;
        inorder(root.left);
        if (first==null&&prev.value>root.value) first=prev;
        if (first!=null&&prev.value>root.value) second=root;
        prev=root;
        inorder(root.right);
    }
}
