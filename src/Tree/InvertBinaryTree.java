package Tree;
//https://leetcode.com/problems/invert-binary-tree/description/?envType=problem-list-v2&envId=tree
//Leetcode-226
public class InvertBinaryTree {
    public static TreeNode invert(TreeNode root){
        if (root==null) return null;
        TreeNode leftNode=invert(root.left);
        TreeNode rightNode=invert(root.right);
        root.left=rightNode;
        root.right=leftNode;
        return root;
    }
}
