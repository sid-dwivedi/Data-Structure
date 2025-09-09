package Tree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//https://leetcode.com/problems/binary-tree-right-side-view/?envType=problem-list-v2&envId=tree
//Leetcode-199
public class BTRightSideView {
    public static List<Integer> rightSide(TreeNode root){
        List<Integer>result=new ArrayList<>();
        if (root==null) return result;
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            for (int i = 0; i <size ; i++) {
                TreeNode currentNode=queue.poll();
                if (i==size-1) result.add(currentNode.value);
                if (currentNode.left!=null) queue.offer(currentNode.left);
                if (currentNode.right!=null) queue.offer(currentNode.right);
            }
        }
        return result;
    }
}
