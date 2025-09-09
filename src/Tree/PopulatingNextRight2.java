package Tree;
//https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/?envType=problem-list-v2&envId=tree
//Leetcode-117
import java.util.LinkedList;
import java.util.Queue;
public class PopulatingNextRight2 {
    public static TreeNode connect(TreeNode root){
        if (root==null) return null;
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            TreeNode prev=null;
            for (int i = 0; i <size ; i++) {
                TreeNode currentNode=queue.poll();
                if (prev!=null) prev.next=currentNode;
                prev=currentNode;
                if (currentNode.left!=null) queue.offer(currentNode.left);
                if (currentNode.right!=null) queue.offer(currentNode.right);
            }
        }
        return root;
    }
}
