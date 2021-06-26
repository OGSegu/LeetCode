package easy;

import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        boolean result = isValid("[[");
        System.out.println(result);
    }

    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> brackets = Map.of('(', ')', '[', ']', '{', '}');
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (brackets.containsKey(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                Character poppedChar = stack.pop();
                if (!brackets.get(poppedChar).equals(ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
