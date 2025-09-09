package Tree;
//https://leetcode.com/problems/count-complete-tree-nodes/description/?envType=problem-list-v2&envId=tree
//Leetcode-222
public class CountCompleteTree {
    public static int countNode(TreeNode root){
        if (root==null) return 0;
        int left=countNode(root.left);
        int right=countNode(root.right);
        return left+right+1;
    }
}
