package homework7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
        Set<T> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }
}
