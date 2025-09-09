package Tree;
//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/?envType=problem-list-v2&envId=tree
//Leetcode-107
import java.util.*;

public class LevelOrder2 {
    public static List<List<Integer>>reverseBtmOrder(TreeNode root){
    List<List<Integer>>result=new ArrayList<>();
    if (root==null) return result;
    Queue<TreeNode>queue=new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
        int levelSize=queue.size();
        List<Integer>levelOrder=new ArrayList<>(levelSize);
        for (int i = 0; i < levelSize; i++) {
            TreeNode currentNode=queue.poll();
            levelOrder.add(currentNode.value);
            if (currentNode.left!=null) queue.offer(currentNode.left);
            if (currentNode.right!=null) queue.offer(currentNode.right);
        }
        result.add(levelOrder);
    }
    Collections.reverse(result);
    return result;
    }
}
