package Arrays;
//https://leetcode.com/problems/majority-element/description/?envType=problem-list-v2&envId=array/
import java.util.Arrays;

public class MajorityElement {
    public static int majorityElement(int []arr){
        Arrays.sort(arr);
        int n=arr.length-1;
        int ans=arr[n/2];
        return ans;
    }
}
