package EasyProblems;

import java.util.Stack;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = 43;

        System.out.println(reverse(num));
    }

    public static int reverse(int x) {

        Stack myStack = new Stack();
        String intStr = Integer.toString(x);
        String reversedStr = "";
        String negativeReversed = "";


        for (int i = 0; i < intStr.length(); i++) {
            myStack.push(intStr.charAt(i));
        }
        for (int i = 0; i < intStr.length(); i++) {
            reversedStr += myStack.pop();
        }

        if (reversedStr.charAt(reversedStr.length() - 1) == '-') {
            negativeReversed = "-";
            negativeReversed += reversedStr.substring(0, reversedStr.length() - 1);
            if (Integer.parseInt(negativeReversed) < Integer.MIN_VALUE) {
                return 0;
            }
            return Integer.parseInt(negativeReversed);
        }

        if (Integer.parseInt(reversedStr) > Integer.MAX_VALUE) {
            return 0;
        }

        return Integer.parseInt(reversedStr);
    }
}
