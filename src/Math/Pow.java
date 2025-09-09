package Math;
//https://leetcode.com/problems/powx-n/submissions/1744633771/?envType=problem-list-v2&envId=math
//Leetcode-50
public class Pow {
    public static double pow(double x,int n){
        long N=n;
        if (N<0){
            x=1/x;
            N=-N;
        }
        double ans=1.0;
        while (N>0){
            if (N%2==1) ans*=x;
            x*=x;
            N/=2;
        }
        return ans;
    }
}
