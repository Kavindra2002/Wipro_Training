package String_QuestionsHW;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String input = "{[()]}";
        if (isValidParentheses(input)) {
            System.out.println("The string has valid parentheses.");
        } else {
            System.out.println("The string has invalid parentheses.");
        }
    }

    public static boolean isValidParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == '}' && top != '{') || (ch == ']' && top != '[') || (ch == ')' && top != '(')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
