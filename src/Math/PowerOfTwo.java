package Math;
//https://leetcode.com/problems/power-of-two/description/?envType=problem-list-v2&envId=math
//Leetcode-231
public class PowerOfTwo {
    public static boolean pow(int num){
        if (num==0) return false;
        while (num!=1){
            if (num%2!=0) return false;
            num/=2;
        }
        return true;
    }
}
