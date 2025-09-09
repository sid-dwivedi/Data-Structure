package Tree;
//https://leetcode.com/problems/minimum-depth-of-binary-tree/?envType=problem-list-v2&envId=tree
//Leetcode-111
public class MinDepthBT {
    public static int minDepthBT(TreeNode root){
       if (root==null) return 0;
       if (root.left==null) return 1+minDepthBT(root.right);
       if(root.right==null) return 1+minDepthBT(root.left);
       return 1+Math.min(minDepthBT(root.left),minDepthBT(root.right));
    }
}
