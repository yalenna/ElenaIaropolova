package Homework2;

public class FizzBuzz {


    public static void main( String[] args ) {
        int x = 131;
        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println("fizz-buzz");
        } else if (x % 3 == 0) {
            System.out.println("fizz");
        } else if (x % 5 == 0) {
            System.out.println("buzz");
        } else {
            System.out.println("Conditions are not met");
        }
    }
}

