package Tree;
//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/?envType=problem-list-v2&envId=tree
//Leetcode -108
public class SortedArrayToBST {
    public static TreeNode SortedArrayToBT(int []arr){
            if (arr.length==0) return null;
            return helper(arr,0,arr.length-1);
    }
    public static TreeNode helper(int []arr,int start,int end){
        if (start>end) return null;
        int mid=(start+end)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=helper(arr,start,mid-1);
        root.right=helper(arr,mid+1,end);
        return root;
    }
}
