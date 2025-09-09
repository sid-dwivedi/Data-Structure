package Math;
//https://leetcode.com/problems/climbing-stairs/description/?envType=problem-list-v2&envId=math
//Leetcode-70
public class ClimbingStairs {
    public static int climbing(int n){
        if (n==1) return 1;
        int[]dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i <dp.length; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
