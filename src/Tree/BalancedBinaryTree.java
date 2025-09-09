package Tree;
//https://leetcode.com/problems/balanced-binary-tree/description/?envType=problem-list-v2&envId=tree
//Leetcode-110
public class BalancedBinaryTree {
    public static boolean balanced(TreeNode root){
        if (root==null) return true;
        return height(root)!=-1;
    }
    public static int height(TreeNode root){
        if (root==null) return 0;
        int left=height(root.left);
        int right=height(root.right);
        int bf=Math.abs(left-right);
        if (bf>1||left==-1||right==-1) return -1;
        return 1+Math.max(left,right);
    }
}
