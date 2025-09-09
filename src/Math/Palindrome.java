package Math;

public class Palindrome {
    public static boolean isPalindrome(int num){
        int temp=0;
        int val=num;
        while (num>0){
            temp=temp*10+temp%10;
            num/=10;
        }
        if (val==temp) return true;
        return false;
    }
}
