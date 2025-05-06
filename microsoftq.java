//abc output 2//

// import java.util.*;
// public class microsoftq {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         if(str.length() >= 2){
//             char first = str.charAt(0);
//             char last = str.charAt(str.length() - 1);
            
//             int firstascii = (int) first;
//             int lastascii = (int) last;

//             int different = lastascii - firstascii;
//             System.out.println(different);
//         }
//     }
// }


//abcd output 4//

// import java.util.Scanner;

// public class microsoftq {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Take string input from user
//         System.out.print("Enter a string: ");
//         String input = scanner.nextLine();

//         int total = 0;
//         int length = input.length();

//         // Loop through the string from both ends
//         for (int i = 0; i < length / 2; i++) {
//             char left = input.charAt(i);                      // character from start
//             char right = input.charAt(length - 1 - i);        // character from end

//             int diff = right - left;                          // calculate difference
//             total += diff;                                    // add difference to total

//             // Print the difference for each pair (optional)
//             System.out.println("Pair: '" + left + "' and '" + right + "' → Difference: " + diff);
//         }

//         // Final total
//         System.out.println("Total sum of differences: " + total);

//         scanner.close();
//     }
// }

//cba out as 2 not -2

import java.util.Scanner;

public class microsoftq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take string input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int total = 0;
        int length = input.length();

        // Loop through the string from both ends
        for (int i = 0; i < length / 2; i++) {
            char left = input.charAt(i);                      // character from start
            char right = input.charAt(length - 1 - i);        // character from end

            // Calculate positive difference
            int diff = right - left;
            if (diff < 0) {
                diff = -diff;  // Make the difference positive
            }

            total += diff;                                    // add difference to total

            // Print the difference for each pair (optional)
            System.out.println("Pair: '" + left + "' and '" + right + "' → Difference: " + diff);
        }

        // Final total
        System.out.println("Total sum of differences: " + total);

        scanner.close();
    }
}
