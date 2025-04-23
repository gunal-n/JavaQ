//Fibonacci program by recursion.


import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the position (n): ");
        int n = a.nextInt();
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}
