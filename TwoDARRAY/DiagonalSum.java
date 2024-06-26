package TwoDARRAY;

public class DiagonalSum {
    public static int printSum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;
        // bruteforce approach- TC = O(n^2)
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j <= n - 1; j++) {
        // // for pd
        // if (i == j) {
        // sum += matrix[i][j];
        // }
        // // for bd
        // if ((i + j) == (n - 1)) {
        // sum += matrix[i][j];
        // }
        // }
        // }

        // optimistic approach- O(n)
        for (int i = 0; i < n; i++) {
            // for pd
            sum += matrix[i][i];
            // for bd
            // for odd matrix-
            if (i != n - 1 - i)
                sum += matrix[i][n - i - 1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                // { 13, 14, 15, 16 },
        };
        System.out.println(printSum(matrix));
    }
}
