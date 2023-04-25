package homework8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        try {
            Set<String> uniqueWords;
            try (BufferedReader reader = new BufferedReader(new FileReader("./src/Homework7/Resources/poem.txt"))) {
                uniqueWords = reader.lines()
                        .flatMap(line -> Arrays.stream(line.split("\\s+")))
                        .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase())
                        .filter(word -> !word.isEmpty())
                        .collect(Collectors.toSet());
            }
            System.out.println("Result: " + uniqueWords);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}