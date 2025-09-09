package Tree;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class PreOrder {
//https://leetcode.com/problems/binary-tree-preorder-traversal/?envType=problem-list-v2&envId=tree
//Leetcode-144
    public static List<Integer> preOrderTraversal(TreeNode root){
       List<Integer>result=new ArrayList<>();
       helper(root,result);
       return result;
    }
    public static void helper(TreeNode root, List<Integer>result){
        if (root==null) return;
        result.add(root.value);
        helper(root.left,result);
        helper(root.right,result);
    }
}
