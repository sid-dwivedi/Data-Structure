package Tree;
//https://leetcode.com/problems/path-sum/description/?envType=problem-list-v2&envId=tree
//Leetcode-112
public class PathSum {
    public static boolean pathSum(TreeNode root,int target){
        if (root==null) return false;
        if (root.value==target&&root.left==null&&root.right==null) return true;
        return pathSum(root.left,target-root.value)||pathSum(root.right,target-root.value);
    }
}
