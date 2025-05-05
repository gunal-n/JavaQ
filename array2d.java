import java.util.Scanner;


//2D array user input//

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

public class array2d {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] arr = new int[n][m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = s.nextInt();
            }
        }

        for(int[] row : arr){
            for(int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}