package String;
//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=problem-list-v2&envId=string
//Leetcode-28
public class FirstOccurrenceInString {
    public static int strStr(String p,String up){
        for (int i = 0; i <p.length() ; i++) {
            if (p.charAt(i)==up.charAt(0)){
                if (helper(p,up,i)==true) return i;
            }
        }
        return -1;
    }
    public static boolean helper(String p,String up,int index){
        int n1=p.length();
        int n2=up.length();
        for (int i = 0; i <n2; i++) {
            if (index>=n1) return false;
            if (p.charAt(index++)!=up.charAt(i)) return false;
        }
        return true;
    }
}
