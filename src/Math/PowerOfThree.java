package Math;
//https://leetcode.com/problems/power-of-three/description/?envType=problem-list-v2&envId=math
//Leetcode-326
public class PowerOfThree {
    public static boolean pow(int n){
        if (n<=0) return false;
        while (n%3==0) n/=3;
        return n==1;
    }
}
