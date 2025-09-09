package String;
//https://leetcode.com/problems/longest-common-prefix/description/?envType=problem-list-v2&envId=string
//Leetcode-14
import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestString(String[] str){
        StringBuilder result=new StringBuilder();
        Arrays.sort(str);
        char []first=str[0].toCharArray();
        char []last=str[str.length-1].toCharArray();
        for (int i = 0; i < first.length; i++) {
            if (first[i]!=last[i]){
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }
}
