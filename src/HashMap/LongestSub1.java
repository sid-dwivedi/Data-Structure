package HashMap;

import java.util.HashSet;
import java.util.Set;

public class LongestSub1 {

    public int lengthOfLongestSubstring(String str){
        Set<Character> set=new HashSet<>();
        int max=0;
        int left=0;
        for(int right=0;right<str.length();right++){
            while (set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            int len=right-left+1;
            max=Math.max(len,max);
        }
        return max;
    }
}
