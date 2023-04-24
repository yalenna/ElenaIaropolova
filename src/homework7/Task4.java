package homework7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("./src/Homework7/Resources/poem.txt"))) {

            Set<String> uniqueWords = new HashSet<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    String delPunctuation = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                    if (!delPunctuation.isEmpty()) {
                        uniqueWords.add(delPunctuation);
                    }
                }
            }
            System.out.println("Result: " + uniqueWords);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}