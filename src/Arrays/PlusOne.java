package Arrays;

public class PlusOne {
    public static int []plusOne(int[]arr){
        for (int i = arr.length-1; i>=0; i--) {
            if(arr[i]!=9){
                arr[i]+=1;
                return arr;
            }else arr[i]=0;
        }
        int ans[]=new int[arr.length+1];
        arr[0]=1;
        return ans;
    }
}
