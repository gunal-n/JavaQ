import java.util.Scanner;


// 10 divided number back the array //
class array {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int[] a = {1,8,30,2,40,5,10};
        int[] b = new int[a.length];
        int index = 0;

        // First, copy elements not divisible by 10
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 10 != 0) {
                b[index++] = a[i];
            }
        }

        // Then, copy elements divisible by 10
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 10 == 0) {
                b[index++] = a[i];
            }
        }

        // Now print all elements
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}


