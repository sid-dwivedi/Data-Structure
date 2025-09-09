package Tree;
//https://leetcode.com/problems/sum-root-to-leaf-numbers/?envType=problem-list-v2&envId=tree
//Leetcode-129
public class SumRootToLeaf {
    public static int sumNumber(TreeNode root){
        return helper(root,0);
    }
    public static int helper(TreeNode root,int sum){
        if (root==null) return 0;
        sum=sum*10+root.value;
        if (root.left==null&&root.right==null) return sum;
        return helper(root.left,sum)+helper(root.right,sum);
    }
}
