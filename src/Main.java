//Task 1: Second Largest and Smallest Element

import java.util.Arrays;
import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {5, 2, 9, 1, 7, 6};
//
//        if (arr.length < 2) {
//            System.out.println("Array should have at least 2 elements.");
//            return;
//        }
//
//        // Sort the array
//        Arrays.sort(arr);
//
//        int secondSmallest = arr[1];
//        int secondLargest = arr[arr.length - 2];
//
//        System.out.println("Second Smallest: " + secondSmallest);
//        System.out.println("Second Largest: " + secondLargest);
//    }
//}


// Task 2: Matrix Multiplication
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter rows and columns of first matrix: ");
//        int r1 = sc.nextInt();
//        int c1 = sc.nextInt();
//        System.out.print("Enter rows and columns of second matrix: ");
//        int r2 = sc.nextInt();
//        int c2 = sc.nextInt();
//
//        if (c1 != r2) {
//            System.out.println("Matrix multiplication not possible. Columns of first must equal rows of second.");
//            return;
//        }
//
//        int[][] mat1 = new int[r1][c1];
//        int[][] mat2 = new int[r2][c2];
//        int[][] result = new int[r1][c2];
//
//        System.out.println("Enter first matrix:");
//        for (int i = 0; i < r1; i++)
//            for (int j = 0; j < c1; j++)
//                mat1[i][j] = sc.nextInt();
//
//        System.out.println("Enter second matrix:");
//        for (int i = 0; i < r2; i++)
//            for (int j = 0; j < c2; j++)
//                mat2[i][j] = sc.nextInt();
//
//        // Matrix multiplication
//        for (int i = 0; i < r1; i++) {
//            for (int j = 0; j < c2; j++) {
//                for (int k = 0; k < c1; k++) {
//                    result[i][j] += mat1[i][k] * mat2[k][j];
//                }
//            }
//        }
//
//        System.out.println("Resultant Matrix:");
//        for (int[] row : result) {
//            for (int val : row) {
//                System.out.print(val + " ");
//            }
//            System.out.println();
//        }
//    }
//}

// TASK 3: Array Equality Test

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        boolean areEqual = Arrays.equals(arr1, arr2);

        if (areEqual) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }
}