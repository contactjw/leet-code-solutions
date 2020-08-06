package EasyProblems;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthesis {
    public static void main(String[] args)
    {
        String expr = "{}()[]";
        if (isValid(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }

    public static boolean isValid(String s) {
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack = new ArrayDeque<Character>();

        // Traversing the Expression
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                // Push the element in the stack
                stack.push(x);
                continue;
            }

            // IF current current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;

            switch (x) {
                case ')':
                    x = stack.pop();
                    if (x == '{' || x == '[')
                        return false;
                    break;

                case '}':
                    x = stack.pop();
                    if (x == '(' || x == '[')
                        return false;
                    break;

                case ']':
                    x = stack.pop();
                    if (x == '(' || x == '{')
                        return false;
                    break;
            }
        }

        // Check Empty Stack
        return (stack.isEmpty());
    }
}
