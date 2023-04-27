package homework8;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        try {
            List<String> lines = FileUtils.readFileToList("./src/resources/poem.txt");
            List<String> sortedLines = lines.stream()
                    .sorted(Comparator.comparingInt(String::length))
                    .collect(Collectors.toList());
            sortedLines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}