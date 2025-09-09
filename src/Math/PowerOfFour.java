package Math;
//https://leetcode.com/problems/power-of-four/description/?envType=problem-list-v2&envId=math
//Leetcode-342
public class PowerOfFour {
    public static boolean pow(int n){
        if (n<=0) return false;
        while (n%4==0) n/=4;
        return n==1;
    }
}
