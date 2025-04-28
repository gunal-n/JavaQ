
import java.util.Scanner;

//print n number in reaves//

// import java.util.Scanner;

// public class Recursion {
//     public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        Printn(n);
//     }
//     public static void Printn(int n) {
//         if(n == 0) 
//         return ;
//         System.out.print(n + " ");
//         Printn(n - 1);
//     }
// }

//print 1 to n //

// import java.util.Scanner;

// public class Recursion {
//     public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int a = 1;
//        Printn(n , a);
//     }
//     public static void Printn(int n, int a) {
//         if(a > n) 
//         return ;
//         System.out.print(a + " ");
//         Printn(n, a + 1);
//     }
// }

// import java.util.Scanner;

// public class Recursion {
//     public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        Printn(n);
//     }
//     public static void Printn(int n) {
//         if(n == 0) 
//         return ;
//         Printn(n - 1);
//         System.out.print(n + " ");
        
//     }
// }

//Sum of first N natural numbers//
// import java.util.Scanner;

// public class Recursion {
//     public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int b = Sum(n);
//        System.out.println(b);
//     }
//     public static int Sum(int n){
//         if(n == 0) return 0;
//         return n + Sum( n - 1 );
//     }
// }

//5+4=9;9+3=12..//
// public class Recursion {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();
//         Printn(n, 0);
//     }

//     public static int Printn(int n, int b) {
//         if (n == 0)
//             return b;
//         b = b + n;
//         System.out.print(b + " ");
//         return Printn(n - 1, b);
//     }
// }

//Factorial of a number (n!)//

// import java.util.Scanner;

// public class Recursion {
//     public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int b = Fact(n);
//        System.out.println(b);
//     }
//     public static int Fact(int n){
//         if(n == 0) return 1;
//         return n * Fact( n - 1 );
//     }
// }

//Power function (calculate xⁿ)//

// import java.util.Scanner;

// public class Recursion {
//     public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int pow = s.nextInt();
//        int b = Power(n , pow);
//        System.out.println(b);
//     }
//     // public static int Power(int n, int pow){
//     //     if(pow == 0) return 1;
//     //     return n * Power(n , pow - 1);
//     // }

// //Same in O(n)//

// public static int Power(int n, int pow) {
//     if (pow == 0) 
//         return 1;
//     int halfPower = Power(n, pow/2);
//     if (pow % 2 == 0) {
//         return halfPower * halfPower;
//     } else {
//         return n * halfPower * halfPower;
//     }
// }
// }

//Print array elements using recursion//

// class Recursion{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int [] a = {1 , 2 , 3 , 4 , 5 , 6};
//         oneby(a, 0);
//     }
//     public static void oneby(int a[], int index){
//         if(index == a.length) return;

//             System.out.println(a[index]);
//             oneby( a , index + 1);

//     }
// }


