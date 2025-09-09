package Tree;
//https://leetcode.com/problems/binary-tree-maximum-path-sum/description/?envType=problem-list-v2&envId=tree
//Leetcode-124
public class BTMaximumPathSum {
    static int total=Integer.MIN_VALUE;
    public int maxPath(TreeNode root){
        helper(root);
        return total;
    }
    public static int helper(TreeNode root){
        if (root==null) return 0;
        int left=helper(root.left);
        int right=helper(root.right);
        int mleft=Math.max(0,left);
        int mright=Math.max(0,right);
        int sum=mleft+mright+ root.value;
        total=Math.max(sum,total);
        return Math.min(left,right)+ root.value;
    }
}
