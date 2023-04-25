package homework8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./src/Homework7/Resources/output.txt"))) {
            List<String> lines = FileUtils.readFileToList("./src/Homework7/Resources/input.txt");

            Collections.reverse(lines);

            writer.write(lines.stream().collect(Collectors.joining(System.lineSeparator())));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}