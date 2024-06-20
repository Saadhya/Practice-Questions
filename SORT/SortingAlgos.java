import java.util.Arrays;
import java.util.Collections;

public class SortingAlgos {
    // sorted & unsorted= put the values from unsorted to sorted array by placing
    // the values at the right place.
    public static void insertionSort(Integer arr[]) {
        // 0 to 3rd element- counting turns
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding out the correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }

    }

    public static void selectionSort(int arr[]) {
        // 0 to 3rd element- counting turns
        for (int i = 0; i < arr.length - 1; i++) {
            // for sorted array
            int minpos = i;

            // unsorted array starts here
            for (int j = i + 1; j < arr.length; j++) {
                // if (arr[minpos] < arr[j]) { -used to go decreasing order
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            // swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubble(int arr[]) {
        for (int turns = 0; turns < arr.length - 1; turns++) {
            for (int j = 0; j < arr.length - 1 - turns; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 3, 2 };
        printArr(arr);
        // bubble(arr);
        // selectionSort(arr);
        insertionSort(arr);

        // inbuilt sort
        // Arrays.sort(arr);
        // Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);
    }

    // using this method for reverse order
    public static int compare(int a, int b) {
        // a-b = -ve
        // a==b = 0
        // a>b= +ve
        return b - a; // for reverse order
        // return a-b; // for inc order
    }
}
