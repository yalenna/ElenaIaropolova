package Homework2;

/* Given an integer x, return true if x is a palindrome, and false otherwise.
  Follow up: Could you solve it without converting the integer to a string? */
public class Palindrome {
    public static boolean isPalindrome( int x ) {
        int temp = 0;
        int copied = x;
        while (x > 0) {
            temp = temp * 10 + x % 10;
            x = x / 10;
        }
        return copied == temp;
    }

    public static void main( String[] args ) {
        int a = 1234321;
        int b = -5555;
        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome(b));
    }
}