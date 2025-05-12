//Square patten//
// import java.util.Scanner;

// public class patten {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int a = s.nextInt();
        
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j <= a; j++){
//                 if(j == 1 || j == a || i == 1 || i == a){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.err.println();
//         }
//     }
// }

//Rigth angle traingle//

// import java.util.Scanner;

//  class patten {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter the size: ");
//         int a = s.nextInt();

//         for (int i = 1; i <= a; i++) {
//             for (int j = 1; j <= i; j++) {
//                 if (j == 1 || i == a || j == i) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  "); 
//                 }
//             }
//             System.err.println();
//         }
//     }
// }


//Invert rigth//

// import java.util.Scanner;

// public class patten {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter the size: ");
//         int a = s.nextInt();

//         for (int i = a; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 if (j == 1 || j == i || i == a) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");  
//                 }
//             }
//             System.err.println();
//         }
//     }
// }


//+ patten//

// import java.util.Scanner;

// public class patten {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter odd size: ");
//         int a = s.nextInt();

//         int mid = (a % 2 == 0) ? (a / 2) : (a + 1) / 2; 

//         for (int i = 1; i <= a; i++) {
//             for (int j = 1; j <= a; j++) {
//                 if (i == mid || j == mid) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.err.println();
//         }
//     }
// }


//X patten//

// import java.util.Scanner;

// public class patten {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int a = s.nextInt();

//         for (int i = 1; i <= a; i++) {
//             for (int j = 1; j <= a; j++) {
//                 if (i == j || j == a - i + 1) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.err.println();
//         }
//     }
// }

//Right angle trangle//
// import java.util.Scanner;

//  class patten {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter the size: ");
//         int a = s.nextInt();

//         for (int i = 1; i <= a; i++) {
//             for (int j = 1; j <= i; j++) {
//                     System.out.print("* ");
//             }
//             System.err.println();
//         }
//     }
// }

//Inverst right//

// import java.util.Scanner;

//  class patten {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter the size: ");
//         int a = s.nextInt();

//         for (int i = 1; i <= a; i++) {
//             for (int j = i; j <= a; j++) {
//                     System.out.print("* ");
//             }
//             System.err.println();
//         }
//     }
// }

//Pramed //

// import java.util.Scanner;

//  class patten {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter the size: ");
//         int a = s.nextInt();

//         for (int i = 1; i <= a; i++) {
//             for (int j = i; j < a; j++) {
//                     System.out.print(" ");
//             }
//             for(int k = 1; k <= (2 * i - 1); k++){
//                 System.out.print("*");
//             }
//             System.err.println();
//         }
//     }
// }

//diman//

// import java.util.Scanner;

//  class patten {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter the size: ");
//         int a = s.nextInt();

//         for (int i = 1; i <= a; i++) {
//             for (int j = i; j < a; j++) {
//                     System.out.print(" ");
//             }
//             for(int k = 1; k <= (2 * i - 1); k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for (int i = a - 1; i >= 1; i--) {
//             for (int j = a; j > i; j--) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= (2 * i - 1); k++) {
//                 System.out.print("*");
//             }
//             System.err.println();
//         }
//     }
// }

//1
//2 6
//3 7 10
//4 8 11 13
//5 9 12 14 15

import java.util.Scanner;

 class patten {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int a = s.nextInt();

        for (int i = 1; i <= a; i++) {
            int num = i;
            int diff = a - 1;
            for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num = num + diff;
                    diff--;
                }
                System.out.println();
        }
    } 
}
