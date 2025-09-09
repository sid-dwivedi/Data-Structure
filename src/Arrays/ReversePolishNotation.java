package Arrays;

import java.util.Stack;

public class ReversePolishNotation {
    public static int reversePolish(String []arr){
        String operator="+-/*";
        Stack<Integer>stack=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            String token = arr[i];
            if (token.equals("+"))
                stack.push(stack.pop()+stack.pop());
            else if (token.equals("*"))
                stack.push(stack.pop()*stack.pop());
            else if (token.equals("-")){
                int n1=stack.pop();
                int n2=stack.pop();
                stack.push(n2-n1);
            } else if (token.equals("/")) {
                int n1=stack.pop();
                int n2=stack.pop();
                stack.push(n2/n1);
            }else stack.push(Integer.parseInt(token));
        }
        return stack.pop();
    }
}
