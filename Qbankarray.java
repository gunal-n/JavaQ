// 01.Find the Largest and Smallest Element
// import java.util.Scanner;

// public class MaxMinArray {
//     public static void main(String[] args) {
//         int[] arr = {12, 45, 2, 67, 33};
//         int max = arr[0], min = arr[0];

//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > max) max = arr[i];
//             if (arr[i] < min) min = arr[i];
//         }

//         System.out.println("Max: " + max);
//         System.out.println("Min: " + min);
//     }
// }

// 02.Reverse an Array
// public class ReverseArray {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};

//         System.out.println("Original:");
//         for (int num : arr) System.out.print(num + " ");

//         System.out.println("\nReversed:");
//         for (int i = arr.length - 1; i >= 0; i--) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// 03.Sort an Array in Ascending Order
// import java.util.Arrays;

// public class SortArray {
//     public static void main(String[] args) {
//         int[] arr = {5, 2, 9, 1, 3};
//         Arrays.sort(arr);

//         System.out.println("Sorted array:");
//         for (int num : arr) System.out.print(num + " ");
//     }
// }

// 04.Check if Array Contains a Specific Element
// public class SearchElement {
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40};
//         int key = 30;
//         boolean found = false;

//         for (int num : arr) {
//             if (num == key) {
//                 found = true;
//                 break;
//             }
//         }

//         System.out.println("Element " + key + (found ? " found." : " not found."));
//     }
// }

// 5. ➕ Sum and Average of Array Elements
// public class SumAverage {
//     public static void main(String[] args) {
//         int[] arr = {4, 8, 6, 10};
//         int sum = 0;

//         for (int num : arr) sum += num;

//         double average = (double) sum / arr.length;

//         System.out.println("Sum: " + sum);
//         System.out.println("Average: " + average);
//     }
// }

// 6. ❌ Remove Duplicates from an Array
// import java.util.*;

// public class RemoveDuplicates {
//     public static void main(String[] args) {
//         int[] arr = {2, 3, 4, 2, 3, 5};
//         Set<Integer> set = new LinkedHashSet<>();

//         for (int num : arr) set.add(num);

//         System.out.println("Array without duplicates:");
//         for (int num : set) System.out.print(num + " ");
//     }
// }

// 7. 🔀 Merge Two Arrays
// import java.util.Arrays;

// public class MergeArrays {
//     public static void main(String[] args) {
//         int[] a = {1, 2, 3};
//         int[] b = {4, 5, 6};

//         int[] merged = new int[a.length + b.length];

//         for (int i = 0; i < a.length; i++) merged[i] = a[i];
//         for (int i = 0; i < b.length; i++) merged[a.length + i] = b[i];

//         System.out.println("Merged array:");
//         System.out.println(Arrays.toString(merged));
//     }
// }

// 8. 🔢 Count Frequency of Each Element
// public class FrequencyCount {
//     public static void main(String[] args) {
//         int[] arr = {2, 3, 2, 4, 3, 2};
//         int[] freq = new int[arr.length];
//         int visited = -1;

//         for (int i = 0; i < arr.length; i++) {
//             if (freq[i] == visited) continue;

//             int count = 1;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] == arr[j]) {
//                     count++;
//                     freq[j] = visited;
//                 }
//             }
//             freq[i] = count;
//         }

//         System.out.println("Element | Frequency");
//         for (int i = 0; i < freq.length; i++) {
//             if (freq[i] != visited)
//                 System.out.println("   " + arr[i] + "    |    " + freq[i]);
//         }
//     }
// }

// 9. 🥈 Find the Second Largest Element
// public class SecondLargest {
//     public static void main(String[] args) {
//         int[] arr = {12, 35, 1, 10, 34, 1};
//         int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

//         for (int num : arr) {
//             if (num > first) {
//                 second = first;
//                 first = num;
//             } else if (num > second && num != first) {
//                 second = num;
//             }
//         }

//         System.out.println("Second largest: " + second);
//     }
// }

// 10. 🔁 Left Rotate an Array by 1 Position
// public class LeftRotate {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int first = arr[0];

//         for (int i = 0; i < arr.length - 1; i++) {
//             arr[i] = arr[i + 1];
//         }
//         arr[arr.length - 1] = first;

//         System.out.println("After rotation:");
//         for (int num : arr) System.out.print(num + " ");
//     }
// }

// 11.Check if target number exists in array
// import java.util.Scanner;

// public class FindTarget {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input array size
//         System.out.print("Enter the number of elements: ");
//         int n = scanner.nextInt();

//         int[] arr = new int[n];

//         // Input array elements
//         System.out.println("Enter " + n + " integers:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         // Input target number
//         System.out.print("Enter the target number: ");
//         int target = scanner.nextInt();

//         boolean found = false;

//         // Search for target in array
//         for (int num : arr) {
//             if (num == target) {
//                 found = true;
//                 break;
//             }
//         }

//         if (found) {
//             System.out.println("Target number " + target + " is found in the array.");
//         } else {
//             System.out.println("Target number " + target + " is NOT found in the array.");
//         }

//         scanner.close();
//     }
// }

// 12.Java Program: Print Index of Target Number
// import java.util.Scanner;

// public class TargetIndexFinder {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input array size
//         System.out.print("Enter number of elements: ");
//         int n = scanner.nextInt();

//         int[] arr = new int[n];

//         // Input array elements
//         System.out.println("Enter " + n + " integers:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         // Input target number
//         System.out.print("Enter the target number: ");
//         int target = scanner.nextInt();

//         // Search for the target and print index
//         boolean found = false;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] == target) {
//                 System.out.println("Target " + target + " found at index: " + i);
//                 found = true;
//                 break; // Stop after finding the first match
//             }
//         }

//         if (!found) {
//             System.out.println("Target " + target + " not found in the array.");
//         }

//         scanner.close();
//     }
// }

// 13.ASCII Value of a Character
// import java.util.Scanner;

// public class AsciiValue {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input character
//         System.out.print("Enter a character: ");
//         char ch = scanner.next().charAt(0); // Takes first character of input

//         // Get ASCII value
//         int ascii = (int) ch;

//         System.out.println("The ASCII value of '" + ch + "' is: " + ascii);

//         scanner.close();
//     }
// }

// 14.ASCII Value of First Character in a String
// import java.util.Scanner;

// public class FirstCharAscii {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input string from user
//         System.out.print("Enter a string: ");
//         String str = scanner.nextLine();

//         // Check if string is not empty
//         if (!str.isEmpty()) {
//             char firstChar = str.charAt(0);       // Get first character
//             int ascii = (int) firstChar;          // Convert to ASCII value
//             System.out.println("First character: '" + firstChar + "'");
//             System.out.println("ASCII value: " + ascii);
//         } else {
//             System.out.println("String is empty!");
//         }

//         scanner.close();
//     }
// }

// 15.Find Two Indices That Add Up to Target
// import java.util.Scanner;

// public class TwoSumIndices {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input array size
//         System.out.print("Enter number of elements: ");
//         int n = scanner.nextInt();

//         int[] arr = new int[n];

//         // Input array elements
//         System.out.println("Enter " + n + " integers:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         // Input target number
//         System.out.print("Enter the target number: ");
//         int target = scanner.nextInt();

//         // Find two indices whose values add up to target
//         boolean found = false;
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[i] + arr[j] == target) {
//                     System.out.println("Target " + target + " is the sum of elements at indices: [" + i + ", " + j + "]");
//                     found = true;
//                     break;
//                 }
//             }
//             if (found) break;
//         }

//         if (!found) {
//             System.out.println("No two elements found that add up to the target.");
//         }

//         scanner.close();
//     }
// }

