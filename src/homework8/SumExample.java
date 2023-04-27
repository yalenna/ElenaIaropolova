package homework8;

public class SumExample {
    public static void main(String[] args) {
        SumFunction sumFunction = (a, b) -> a + b;
        System.out.println("Sum of 2 and 3 is " + sumFunction.sum(2, 3));
    }
}