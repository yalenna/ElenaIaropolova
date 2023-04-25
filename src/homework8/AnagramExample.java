package homework8;

import java.util.Arrays;

public class AnagramExample {
    public static void main(String[] args) {
        AnagramFunction anagramFunction = (word1, word2) -> {
            if (word1.length() != word2.length()) {
                return false;
            }
            char[] w1 = word1.toCharArray();
            char[] w2 = word2.toCharArray();
            Arrays.sort(w1);
            Arrays.sort(w2);
            return Arrays.equals(w1, w2);
        };
        String word1 = "roza";
        String word2 = "azor";
        System.out.println(word1 + " " + word2 + " are anagrams - " + anagramFunction.isAnagram(word1, word2));
    }
}