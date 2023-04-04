package Homework2;


public class Sqrt {
    public static int mySqrt( int x ) {
        if (x < 0) {
            System.out.println("This integer is negative");
            System.exit(0);
        }

        int counter = 1;
        while (counter <= x / counter) {
            counter++;
        }
        return counter - 1;
    }


    public static void main( String[] args ) {
        int b = 8;
        System.out.println(mySqrt(b));
    }
}