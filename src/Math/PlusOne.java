package Math;
//https://leetcode.com/problems/plus-one/?envType=problem-list-v2&envId=math
//Leetcode-66
public class PlusOne {
    public static int[] plusOne(int[]arr){
        for (int i = arr.length-1; i >=0; i--) {
            if (arr[i]!=9){
                arr[i]=arr[i]+1;
                return arr;
            }
            arr[i]=0;
        }
        int []ans=new int[arr.length+1];
        ans[0]=1;
        return ans;
    }
}
