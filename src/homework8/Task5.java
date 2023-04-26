package homework8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("./src/resources/poem.txt"))) {
            String text = reader.lines()
                    .map(line -> line.replaceAll("[.,;]", " ").toLowerCase())
                    .collect(Collectors.joining(" "));

            Map<String, Long> wordCount = Arrays.stream(text.split("\\s+"))
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

            wordCount.forEach((word, count) -> System.out.println(word + ": " + count));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}