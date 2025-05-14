// ✅ 1. Using Division Method

// import java.util.Scanner;

// public class binary {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a decimal number: ");
//         int num = sc.nextInt();

//         StringBuilder binary = new StringBuilder();
//         int n = num;
//         if (n == 0) {
//             binary.append("0");
//         } else {
//             while (n > 0) {
//                 binary.insert(0, n % 2);
//                 n = n / 2;
//             }
//         }

//         System.out.println("Binary (using division method): " + binary.toString());
//     }
// }

// ✅ 2. Using Subtraction (Positional Value) Method

// import java.util.Scanner;

// public class binary {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a decimal number: ");
//         int num = sc.nextInt();

//         if (num == 0) {
//             System.out.println("Binary (using subtraction method): 0");
//             return;
//         }

//         StringBuilder binary = new StringBuilder();
//         int power = 0;

//         while (Math.pow(2, power) <= num) {
//             power++;
//         }
//         power--;

//         while (power >= 0) {
//             int value = (int) Math.pow(2, power);
//             if (num >= value) {
//                 binary.append("1");
//                 num -= value;
//             } else {
//                 binary.append("0");
//             }
//             power--;
//         }

//         System.out.println("Binary (using subtraction method): " + binary.toString());
//     }
// }

// ✅ 3. Using Java Built-in Function

// import java.util.Scanner;

// public class binary{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a decimal number: ");
//         int num = sc.nextInt();

//         String binary = Integer.toBinaryString(num);
//         System.out.println("Binary (using built-in method): " + binary);
//     }
// }