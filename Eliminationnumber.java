
import java.util.Scanner;

class Eliminationnumber{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int b = lastRemaining(n);
        System.out.println(b);
    }
    public static  int lastRemaining(int n) {
        if(n == 1) return 1;
        return 2*(n/2 + 1 - lastRemaining(n/2));
    }
}