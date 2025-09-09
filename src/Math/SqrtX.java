package Math;
//https://leetcode.com/problems/sqrtx/description/?envType=problem-list-v2&envId=math
//Leetcode-69
public class SqrtX {
    public static int sqrt(int x){
        int low=1;
        int high=x;
        while (low<=high){
            long mid=low+(high-low)/2;
            long val=mid*mid;
            if (val<=x) low=(int)mid+1;
            else high=(int)mid-1;
        }
        return high;
    }
}
