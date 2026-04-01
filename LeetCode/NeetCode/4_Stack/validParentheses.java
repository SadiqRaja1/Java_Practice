import java.util.Stack;

public class validParentheses {
    public static void main (String args []) {
        String s = "]";

        System.out.print(checkParentheses(s));
    }

    public static boolean checkParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }else if (!stack.isEmpty()){
                if(s.charAt(i) == ')' && stack.peek() == '('){
                    stack.pop();
                }else if (s.charAt(i) == ']' && stack.peek() == '['){
                    stack.pop();
                }else if (s.charAt(i) == '}' && stack.peek() == '{'){
                    stack.pop();
                }
            }else {
                return false;
            }

        }

            if(!stack.isEmpty()) {
                return false;
            }

        return true;
    }
}