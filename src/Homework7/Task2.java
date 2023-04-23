package Homework7;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        try {
            List<String> lines = FileUtils.readFileToList("./src/Homework7/Resources/poem.txt");
            lines.sort(Comparator.comparingInt(String::length));
            for (String s : lines) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}