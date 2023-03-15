package Homework2;

public class Fibonacci {
    public static int [] getFibonacci(int n) {
        int[] myArray = new int[n];
        myArray[0] = 0;
        if (n > 1) {
            myArray[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            myArray[i] = myArray[i - 1] + myArray[i - 2];
        }
        return myArray;

    }
    public static void main(String[] args) {
        int[] fib = getFibonacci(1);
        for (int i = 0; i < fib.length; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
