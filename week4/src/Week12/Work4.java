package Week12;

import java.util.Stack;

public class Work4 {
    public static void main(String[] args) {
        System.out.println("ismatch() = " + ismatch("()"));
    }
    public static boolean ismatch(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.pop();
                    if ((ch == ')' && top != '(') ||
                            (ch == ']' && top != '[') ||
                            (ch == '}' && top != '{')) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
