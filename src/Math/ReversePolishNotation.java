package Math;
//https://leetcode.com/problems/evaluate-reverse-polish-notation/description/?envType=problem-list-v2&envId=math
//Leetcode-150
import java.util.Stack;
public class ReversePolishNotation {
    public static int reverse(String []token){
        String operator="+-/*";
        Stack<Integer>stack=new Stack<>();
        for (int i = 0; i < token.length; i++) {
            if (token[i].equals("+")) stack.push(stack.pop()+stack.pop());
            else if (token[i].equals("-")) {
                int num2=stack.pop();
                int num1=stack.pop();
                stack.push(num1-num2);
            } else if (token[i].equals("/")) {
                int num2=stack.pop();
                int num1=stack.pop();
                stack.push(num1/num2);
            } else if (token[i].equals("*")) stack.push(stack.pop()*stack.pop());
            else
                stack.push(Integer.parseInt(token[i]));

        }
        return stack.pop();
    }
}
