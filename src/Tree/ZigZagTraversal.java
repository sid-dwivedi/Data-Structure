package Tree;
//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/?envType=problem-list-v2&envId=tree
//Leetcode-103
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ZigZagTraversal {
    public static List<List<Integer>> zigZagLevelTraversal(TreeNode root) {
      List<List<Integer>>result=new ArrayList<>();
      if (root==null) return result;
      Deque<TreeNode>queue=new LinkedList<>();
      queue.add(root);
      boolean btn=true;
      while (!queue.isEmpty()){
          int levelSize=queue.size();
          List<Integer>levelOrder=new ArrayList<>(levelSize);
          for (int i = 0; i <levelSize; i++) {
              if (btn){
                  TreeNode currentNode =queue.pollFirst();
                  levelOrder.add(currentNode.value);
                  if (currentNode.left!=null) queue.addLast(currentNode.left);
                  if (currentNode.right!=null) queue.addLast(currentNode.right);
              }else {
                  TreeNode currentNode = queue.pollLast();
                  levelOrder.add(currentNode.value);
                  if (currentNode.right != null) queue.addFirst(currentNode.right);
                  if (currentNode.left != null) queue.addFirst(currentNode.left);
              }
          }
          btn=!btn;
          result.add(levelOrder);
      }
      return result;
    }
}
