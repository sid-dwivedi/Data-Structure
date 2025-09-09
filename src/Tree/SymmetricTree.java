package Tree;
//https://leetcode.com/problems/symmetric-tree/description/?envType=problem-list-v2&envId=depth-first-search
//Leetcode-101
import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    public static boolean isSymmetricTree(TreeNode root){
       Queue<TreeNode>queue=new LinkedList<>();
       queue.add(root.left);
       queue.add(root.right);
       while (!queue.isEmpty()){
            TreeNode first=queue.poll();
            TreeNode second=queue.poll();
            if (first==null&&second==null) continue;
            if (first==null||second==null) return false;
            if (first.value!=second.value) return false;
            queue.add(first.left);
            queue.add(second.right);
            queue.add(first.right);
            queue.add(second.left);
       }
       return true;
    }
}
