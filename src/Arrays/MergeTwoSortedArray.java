package Arrays;
//https://leetcode.com/problems/merge-sorted-array/?envType=problem-list-v2&envId=array
public class MergeTwoSortedArray {
    public static void merge(int []arr1,int m,int []arr2,int n){
        int p=m-1;
        int q=n-1;
        int k=m+n-1;
        while(q>=0){
            if(p>=0&&arr1[p]>arr2[q])
                arr1[k--]=arr1[p--];
            else
                arr1[k--]=arr2[q--];
        }
    }
}
