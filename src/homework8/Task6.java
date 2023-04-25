package homework8;

import java.util.Stack;

public class Task6 {
    public static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        return s.chars().allMatch(a -> {
            if (a == '(') {
                stack.push((char) a);
                return true;
            } else if (a == ')') {
                return !stack.isEmpty() && stack.pop() == '(';
            }
            return true;
        }) && stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "(Should(be)true)";
        String s2 = "((This)should)be false)))))";

        System.out.println(check(s1));
        System.out.println(check(s2));
    }
}