package String;
import java.util.HashSet;
import java.util.Set;
//https://leetcode.com/problems/longest-substring-without-repeating-characters/?envType=problem-list-v2&envId=string
//Leetcode-3
public class LongestSubstringWithoutRepeating {
    public static int longest(String str){
        Set<Character> set=new HashSet<>();
        int left=0;
        int max=0;
        for (int right=0;right<str.length();right++){
            while (set.contains(str.charAt(right))){
                set.remove(str.charAt(left++));
            }
            set.add(str.charAt(right));
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}
