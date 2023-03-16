package Homework2;

/*Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.*/
public class LengthofWord {
    public static int lengthOfLastWord( String s ) {
        {
            s = s.trim();
            int result = s.lastIndexOf(" ");
            if (result == -1) {
                return s.length();
            }
            return s.length() - result - 1;
        }
    }

    public static void main( String[] args ) {
        String a = "  Hello my dear friend    ";
        System.out.println(lengthOfLastWord(a));
    }
}