package Arrays;
//https://leetcode.com/problems/missing-number/?envType=problem-list-v2&envId=array
public class MissingNumber {
    public static int missingNumber(int[]arr){
        int xor=0;
        for (int i = 0; i < arr.length; i++) {
            xor^=i;
        }
        for(int num:arr)
            xor^=num;
        return xor;
    }
}
