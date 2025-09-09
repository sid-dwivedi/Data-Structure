package Tree;
import java.util.Arrays;
//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/?envType=problem-list-v2&envId=tree
//Leetcode-105
public class PreorderAndInorderBT {
    public static TreeNode buildTree(int []preOrder,int []inOrder){
        if (preOrder.length==0) return null;
        int val=preOrder[0];
        int index=0;
        for (int i = 0; i < inOrder.length; i++) {
            if (inOrder[i]==val) {
                index=i;
            }
        }
        TreeNode root=new TreeNode(val);
        root.left=buildTree(Arrays.copyOfRange(preOrder,1,index+1),Arrays.copyOfRange(inOrder
        ,0,index));
        root.right=buildTree(Arrays.copyOfRange(preOrder,index+1,preOrder.length),Arrays.copyOfRange(inOrder,index+1,inOrder.length));
        return root;
    }
}
