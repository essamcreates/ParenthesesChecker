import java.util.Stack;

public class ParenthesesChecker {

    public boolean checkParentheses(String testString) {

        Stack<Character> stack = new Stack<>();

        for (char c : testString.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false; // Found a closing parenthesis without a matching opening parenthesis
                }
                stack.pop(); // Found a matching pair of parentheses, pop the opening parenthesis from the stack
            }
        }

        return stack.isEmpty(); // Check if all opening parentheses were matched


    }

}


