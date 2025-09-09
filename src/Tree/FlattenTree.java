package Tree;
//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/?envType=problem-list-v2&envId=tree
//Leetcode-114
public class FlattenTree {
    public static TreeNode flattenTree(TreeNode root){
       if (root==null) return null;
       TreeNode temp=root;
       while (temp!=null){
           if (temp.left!=null){
               TreeNode rightMost=temp.left;
               while (rightMost.right!=null){
                   rightMost=rightMost.right;
               }
               rightMost.right=temp.right;
               temp.right=temp.left;
               temp.left=null;
           }
           temp=temp.left;
       }
       return root;
    }
}
