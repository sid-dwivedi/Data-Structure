package Tree;
//https://leetcode.com/problems/maximum-depth-of-binary-tree/description/?envType=problem-list-v2&envId=depth-first-search
//Leetcode-104
public class MaxDepthBT {
    public static int maximumDepthOfBST(TreeNode root){
        if (root==null)
            return 0;
        return Math.max(maximumDepthOfBST(root.left),maximumDepthOfBST(root.right))+1;
    }
}
