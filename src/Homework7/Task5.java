package Homework7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Task5 {
        public static void main(String[] args) {
            try {
                String text = "";
                BufferedReader reader = new BufferedReader(new FileReader(".\\src\\Homework7\\poem.txt"));
                String line;
                while ((line = reader.readLine()) != null) {
                    text += line.replaceAll("[.,;]", " ").toLowerCase();
                }
                reader.close();

                Map<String, Integer> wordCount = new HashMap<>();
                String[] words = text.split("\\s+");
                for (String word : words) {
                    if (wordCount.containsKey(word)) {
                        wordCount.put(word, wordCount.get(word) + 1);
                    } else {
                        wordCount.put(word, 1);
                    }
                }

                for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }