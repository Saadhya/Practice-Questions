import java.util.*;

public class PrintSeven {

  public static void printLonelyNumbers(int[] arr, int n) {
    Arrays.sort(arr);

    for (int i = 0; i < n; i++) {
      if (i == 0) {
        if (arr[i + 1] - arr[i] > 1) {
          System.out.println(arr[i]);
        }
      } else if (i == n - 1) {
        if (arr[i] - arr[i - 1] > 1) {
          System.out.println(arr[i]);
        }
      } else {
        if (arr[i + 1] - arr[i] > 1 && arr[i] - arr[i - 1] > 1) {
          System.out.println(arr[i]);
        }
      }
    }
  }

  public static boolean isIncreasing(int[] arr, int n) {
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] > arr[i + 1]) { // next element should not be smaller
        return false;
      }
    }

    return true;
  }

  public static boolean isDecreasing(int[] arr, int n) {
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] < arr[i + 1]) { // next element should not be larger
        return false;
      }
    }

    return true;
  }

  public static boolean isMonotonic(int[] arr, int n) {
    boolean isIncreasing = isIncreasing(arr, n);
    boolean isDecreasing = isDecreasing(arr, n);

    return isDecreasing || isIncreasing;
  }

  public static int findTotalWater(int[] arr, int n) {
    int[] lmax = new int[n];

    int max = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      lmax[i] = max;
    }

    int[] rmax = new int[n];
    max = 0;
    for (int i = n - 1; i >= 0; i--) {
      max = Math.max(max, arr[i]);
      rmax[i] = max;
    }

    int ans = 0;
    for (int i = 0; i < n; i++) {
      int lb = lmax[i]; // step 1
      int rb = rmax[i]; // step 2

      int min = Math.min(lb, rb); // step 3
      int currentWater = min - arr[i]; // step 4
      ans = ans + currentWater; // adding to the final answer
    }

    return ans;
  }

  public static int countTotalOccurrences(int[][] arr) {
    int count = 0;

    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[0].length; col++) {
        if (arr[row][col] == 7) {
          count++;
        }
      }
    }

    return count;
  }

  public static int getSumOfRow(int[][] arr) {
    int sum = 0;
    int[] oneArray = arr[1];

    for (int i = 0; i < oneArray.length; i++) {
      sum = sum + oneArray[i];
    }

    return sum;
  }

  public static int[][] getTranspose(int[][] arr) {
    int n = arr.length; // number of rows
    int m = arr[0].length; // number of cols

    int[][] ans = new int[m][n];

    for (int i = 0; i < ans.length; i++) {
      for (int j = 0; j < ans[0].length; j++) {
        ans[i][j] = arr[j][i];
      }
    }

    return ans;
  }

  public static void printSpiral(int[][] arr) {
    int n = arr.length;
    int m = arr[0].length;

    int sc = 0;
    int sr = 0;
    int er = n - 1;
    int ec = m - 1;

    int col = 0;
    int row = 0;

    while (sc <= ec && sr <= er) { // till when my range is valid
      // col downwards -> printing starting column
      col = sc;
      for (row = sr; row <= er; row++) {
        System.out.print(arr[row][col] + " ");
      }
      sc++;

      // row towards right -> printing end row
      row = er;
      for (col = sc; col <= ec; col++) {
        System.out.print(arr[row][col] + " ");
      }
      er--;

      // col upwards -> printing end column
      col = ec;
      for (row = er; row >= sr; row--) {
        System.out.print(arr[row][col] + " ");
      }
      ec--;

      // row towards left
      row = sr;
      for (col = ec; col >= sc; col--) {
        System.out.print(arr[row][col] + " ");
      }
      sr++;

      System.out.println();
    }
  }

  // public static void main(String[] args){
  //     int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

  //     // int[][] ans = getTranspose(arr);

  //     // // printing ans
  //     // for(int i=0; i<ans.length; i++){
  //     //     for(int j=0; j<ans[0].length; j++){
  //     //         System.out.print(ans[i][j]+" ");
  //     //     }
  //     //     System.out.println();
  //     // }

  //     printSpiral(arr);

  // }
  public static void main(String args[]) {
    // System.out.println(countSeven(arrT));
    // System.out.println(sumOfrow(arrT));
    int arrT = { { 4, 9, 10 }, { 5, 7, 11 }, { 3, 6, 2 } };

    // int ans = transpose(arrT);
    // for (int row = 0; row < arr.length; row++) {
    //   for (int col = 0; col < arr[0].length; col++) {
    //     System.out.println(ans[row][col] + " ");
    //   }
    //   System.out.println();
    // }
    // System.out.println(transpose(arrT));
    printspiral(arrT);
  }

  public static int countSeven() {
    // int count = 0;
    // for (int row = 0; row < arr.length; row++) {
    //   for (int col = 0; col < arr[0].length; col++) {
    //     if (arr[row][col] == 7) {
    //       count++;
    //     }
    //   }
    // }
  }

  //   public static void printspiral(int arr[][]) {
  //     int n = arr.length;
  //     int m = arr[0].length;
  //     int sc = 0;
  //     int sr = 0;
  //     int er = n - 1;
  //     int ec = m - 1;
  //     int col = 0;
  //     int row = 0;
  //     while (sc <= ec && sr <= er) {
  //       col = sc;
  //       for (row = ec; row >= sc; row--) {
  //         System.out.println(arr[row][col] + "");
  //       }
  //       ec--;

  //       row = er;
  //       for (col = er; col >= sr; col--) {
  //         System.out.println(arr[row][col] + "");
  //       }

  //       col = ec;
  //       for (row = er; row >= sr; row--) {
  //         System.out.println(arr[row][col] + "");
  //       }
  //       ec--;
  //       row = sr;
  //       for (col = ec; col >= sc; col--) {
  //         System.out.println(arr[row][col] + "");
  //       }
  //       System.out.println();
  //     }
  //   }

  public static int[][] transpose(int[][] arr) {
    int n = arr.length;
    int m = arr[0].length;

    int[][] ans = new int[m][n];
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[0].length; col++) {
        ans[row][col] = arr[col][row];
      }
    }
  }
}
