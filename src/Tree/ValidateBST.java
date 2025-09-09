package Tree;
//https://leetcode.com/problems/validate-binary-search-tree/description/?envType=problem-list-v2&envId=depth-first-search
//Leetcode-98
public class ValidateBST {
    public static boolean validateBST(TreeNode root) {
        return helper(root, null, null);
    }
    public static boolean helper(TreeNode root,Integer low,Integer high){
        if (root==null) return true;
        if (low!=null&&root.value<low) return false;
        if (high!=null&& root.value>high) return false;
        boolean leftTree=helper(root.left,low,root.value);
        boolean rightTree=helper(root.right,root.value,high);
        return leftTree&&rightTree;
    }
}
