package TwoDARRAY;

import java.util.Scanner;

/**
 * Matrices
 */
public class Matrices {
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at cell (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static int findLargest(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                largest = Math.max(largest, matrix[i][j]);
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        System.out.println("Enter values");
        // user input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // System.out.print(matrix[i][j]);
        // }
        // System.out.println();
        // }
        System.out.println("Enter element to search");
        int findEle = sc.nextInt();
        // search(matrix, findEle);
        System.out.println("found element: " + search(matrix, findEle));
        System.out.println(findLargest(matrix));
        System.out.println(findSmallest(matrix));
        sc.close();
    }

    public static int findSmallest(int[][] matrix) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                smallest = Math.min(smallest, matrix[i][j]);
            }
        }
        return smallest;
        // throw new UnsupportedOperationException("Unimplemented method
        // 'findSmallest'");
    }

}