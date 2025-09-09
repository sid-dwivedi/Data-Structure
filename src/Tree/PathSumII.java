package Tree;
//https://leetcode.com/problems/path-sum-ii/?envType=problem-list-v2&envId=tree
//Leetcode-113
import java.util.ArrayList;
import java.util.List;
public class PathSumII {
    public static List<List<Integer>>pathSum(TreeNode root,int target){
        List<List<Integer>>result=new ArrayList<>();
        dfs(root,target,0,new ArrayList(),result);
        return result;
    }
    private static void dfs(TreeNode root,int target,int sum,List<Integer>temp,List<List<Integer>> result){
        if (root==null) return;
        temp.add(root.value);
        sum+=root.value;
        if (root.left==null&&root.right==null&&sum==target) result.add(new ArrayList(temp));
        dfs(root.left,target,sum,temp,result);
        dfs(root.right,target,sum,temp,result);
        temp.remove(temp.size()-1);
    }
}
