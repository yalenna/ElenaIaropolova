package homework8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 50, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 8, 50, 32));

        Set<Integer> union = join(set1, set2);
        System.out.println("Union: " + union);

        Set<Integer> intersection = intersection(set1, set2);
        System.out.println("Intersection: " + intersection);
    }

    public static <T> Set<T> join(Set<T> set1, Set<T> set2) {
        return Stream.concat(set1.stream(), set2.stream()).collect(Collectors.toSet());
    }

    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        return set1.stream().filter(set2::contains).collect(Collectors.toSet());
    }
}