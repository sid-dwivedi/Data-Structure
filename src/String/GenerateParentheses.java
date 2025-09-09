package String;
import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/generate-parentheses/?envType=problem-list-v2&envId=string
//Leetcode-22
public class GenerateParentheses {
    public static List<String>generate(int n){
        List<String>result=new ArrayList<>();
        helper(result,n,0,0,"");
        return result;
    }
    public static void helper(List<String>result,int n,int o,int c,String up){
        if (up.length()==2*n){
            result.add(up);
            return;
        }
        if (o<n) helper(result,n,o+1,c,up+"(");
        if (c<o) helper(result,n,o,c+1,up+")");
    }
}
