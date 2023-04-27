package homework8;

public class Divisible {
    public static void main(String[] args) {
        NumberDivisibleBy31 divisibleBy31 = (a) -> a % 31 == 0;

        int test1 = 31;
        int test2 = 62;
        int test3 = 92;

        System.out.println(test1 + " is divisible by 31: " + divisibleBy31.test(test1));
        System.out.println(test2 + " is divisible by 31: " + divisibleBy31.test(test2));
        System.out.println(test3 + " is divisible by 31: " + divisibleBy31.test(test3));
    }
}