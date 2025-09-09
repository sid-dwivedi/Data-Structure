package Tree;
//https://leetcode.com/problems/same-tree/?envType=problem-list-v2&envId=depth-first-search
//Leetcode-100
public class SameTree {
    public static boolean sameTree(TreeNode p,TreeNode q){
       if (p==null&&q==null) return true;
       if (p==null||q==null) return false;
       if (p.value!=q.value) return false;
       return sameTree(p.left,q.left)&&sameTree(p.right,q.right);
    }
}
