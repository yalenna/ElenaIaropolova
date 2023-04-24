package homework7;

import java.util.Stack;

public class Task6 {
    public static boolean check(String s) {
        Stack<Character> result = new Stack<Character>();
        for (char buf : s.toCharArray()) {
            if (buf == '(') {
                result.push(buf);
            } else if (buf == ')') {
                if (result.isEmpty() || result.peek() != '(') {
                    return false;
                }
                result.pop();
            }
        }
        return result.isEmpty();
    }

    public static void main( String[] args ) {
        String s1 = "(Should(be)true)";
        String s2 = "((This)should)be false)))))";

        System.out.println(check(s1));
        System.out.println(check(s2));
    }
}