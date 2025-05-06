
// public class array1 {
//     public static void main(String[] args) {
//         int [] arr = { 20, 40, 100, 30, 80, 96, 55};
//         int max = 0;
//         for(int i = 0; i < arr.length; i++){
//         if(arr[i] > max){
//             max = arr[i];
//         }
//     }
//     System.out.println(max);
//     }
// }

// public class array1 {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();
//         int [] arr = new int[n];

//         for(int i = 0; i < n; i++){
//             arr[i] = s.nextInt();
//         }

//         int max = 0;
//         for(int i = 0; i < arr.length; i++){
//         if(arr[i] > max){
//             max = arr[i];
//         }
//     }
//     System.out.println(max);
//     }
// }

//min number in array//

// public class array1 {
//     public static void main(String[] args) {
//         int [] arr = {33,1,66,7,1,23};
//         int min = arr[0];
//         for(int i = 1; i < arr.length; i++){
//         if(arr[i] < min){
//             min = arr[i];
//         }
//     }
//     System.out.println(min);
//     }
// }



// public class array1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Ask user for number of elements
//         System.out.print("Enter the number of elements: ");
//         int n = scanner.nextInt();
        
//         int[] arr = new int[n];

//         // Take array input from user
//         System.out.println("Enter " + n + " elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         // Initialize min to first element
//         int min = arr[0];
//         for (int i = 1; i < arr.length; i++) {  // start from i=1 since min is arr[0]
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }

//         System.out.println("Minimum element is: " + min);

        
//     }
// }

//Sum of right side element//

// class array1{
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40};
//         int sum = 0;
//         for(int i = arr.length - 1; i >= 0; i--){
//             int temp = arr[i];
//             arr[i] = sum;
//             sum = sum + temp;
//         }
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] +" ");
//         }
//     }
// }

//Sum of left side element//

// class array1{
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40};
//         int sum = 0;
//         for(int i = 0; i < arr.length ; i++){
//             int temp = arr[i];
//             arr[i] = sum;
//             sum = sum + temp;
//         }
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] +" ");
//         }
//     }
// }

//second larger number in array // 

// class array1{
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 4, 70};
//         int larger = Integer.MIN_VALUE;
//         int sec = Integer.MIN_VALUE;
//         for(int i = 0; i < arr.length ; i++){
//             if(arr[i] > larger){
//                 sec = larger;
//                 larger = arr[i];
//             }
//             else if ( arr[i] > sec && arr[i] != larger) {
//                 sec = arr[i];
//             }
//         }
//         System.out.println(larger);
//         System.out.print(sec);
//     }
// }

// Array reavising//

// import java.util.Scanner;

// class array1 {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         System.out.print("Enter number of elements: ");
//         int n = s.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter " + n + " elements:");
//         for(int i = 0; i < n; i++) {
//             arr[i] = s.nextInt();
//         }

//         System.out.println("Reversed array:");
//         for(int i = n - 1; i >= 0; i--) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

//element array reves//

// import java.util.Scanner;

// class array1 {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         System.out.print("Enter number of elements: ");
//         int n = s.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter " + n + " elements:");
//         for(int i = 0; i < n; i++) {
//             arr[i] = s.nextInt();
//         }

//         int start = 0;
//         int end = n -1;
//         while(start<end){
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
        
//         for(int i = 0; i < n; i++) {
//            System.out.print(arr[i] + ""); 
//         }

//     }
// }


//Traget in array//
// import java.util.*;
// class array1{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         System.out.print("Enter number of elements: ");
//         int n = s.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter " + n + " elements:");
//         for(int i = 0; i < n; i++) {
//             arr[i] = s.nextInt();
//         } 
        
//         System.out.println("Taraget");
//         int t = s.nextInt();



//     }
// }