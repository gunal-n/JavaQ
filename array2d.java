import java.util.Scanner;
// public class array2d {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();
//         int m = s.nextInt();
//         int[][] arr = new int[n][m];
        
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < m; j++){
//                 arr[i][j] = s.nextInt();
//             }
//         }

//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < m; j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }


//2D array by using foe each loop//

// public class array2d {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();
//         int m = s.nextInt();
//         int[][] arr = new int[n][m];
        
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < m; j++){
//                 arr[i][j] = s.nextInt();
//             }
//         }

//         for(int[] row : arr){
//             for(int element : row){
//                 System.out.print(element + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//sum in 2D array//

// public class array2d {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();
//         int m = s.nextInt();
//         int[][] arr = new int[n][m];
        
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < m; j++){
//                 arr[i][j] = s.nextInt();
//             }
//         }
//         int sum = 0;

//         for(int[] row : arr){
//             for(int val : row){
//                 sum += val;
//             }
            
//         }
//         System.out.println(sum);
//     }
// }

// output as jagged 2D array
// 1 2 3
// 4
// 5 6 7
// public class array2d {
//     public static void main(String[] args) {
//         int[][] arr = {
//             {1, 2, 3},
//             {4},
//             {7, 8, 9}
//         };

        
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();  
//         }
//     }
// }


//Java Program (User Input for Jagged 2D Array)

public class array2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for number of rows
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int[][] arr = new int[rows][];

        // Input each row with dynamic column size
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of columns for row " + i + ": ");
            int cols = scanner.nextInt();
            arr[i] = new int[cols];

            System.out.println("Enter elements for row " + i + ":");
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // Print the 2D array using nested loop
        System.out.println("\n2D Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
