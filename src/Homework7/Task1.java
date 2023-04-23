package Homework7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./src/Homework7/Resources/output.txt"))) {
            List<String> lines = FileUtils.readFileToList("./src/Homework7/Resources/input.txt");

            for (int i = lines.size() - 1; i >= 0; i--) {
                writer.write(lines.get(i));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}