package String;
import java.util.Stack;
//https://leetcode.com/problems/valid-parentheses/description/?envType=problem-list-v2&envId=string
//Leetcode-20
public class ValidParenthesis {
    public static boolean valid(String str){
        Stack<Character>stack=new Stack<>();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='[')
                stack.push(str.charAt(i));
            else {
                if (stack.isEmpty()){return false;}
                char peek=stack.pop();
                if ((str.charAt(i)==')'&&peek!='(')||
                        (str.charAt(i)=='}'&&peek!='{')||
                (str.charAt(i)==']'&&peek!='[')) return false;
            }
        }
        System.out.println("NEW ");
        return stack.isEmpty();
    }
}

