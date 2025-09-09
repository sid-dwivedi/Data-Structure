package Tree;
//https://leetcode.com/problems/binary-tree-inorder-traversal/?envType=problem-list-v2&envId=depth-first-search
//Leetcode-94
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InOrder {

    public static List<Integer>inOrder(TreeNode root){
       List<Integer>result=new ArrayList<>();
       helper(root,result);
       return result;
    }
    public static void helper(TreeNode root,List<Integer>result){
        if (root==null) return;
        helper(root.left,result);
        result.add(root.value);
        helper(root.right,result);

    }
}
