import java.util.Scanner;

public class factorial {
    public static int Factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = a.nextInt();
        System.out.println("Factorial of " + n + " is: " + Factorial(n));
    }
}


