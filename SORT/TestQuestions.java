// descending sorting
public class TestQuestions {
    public static void bubbleSort(int arr[]) {
        for (int turns = 0; turns < arr.length; turns++) {
            // outer arr= for turns
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // two arrays- sorted & sorted
    public static void selectionSort(int arr[]) {
        for (int turns = 0; turns < arr.length - 1; turns++) {
            int minpos = turns;

            for (int j = turns + 1; j < arr.length - 1; j++) {
                if (arr[minpos] < arr[j]) {
                    minpos = j;
                }
            }
            // swap
            int temp = arr[minpos];
            arr[minpos] = arr[turns];
            arr[turns] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // divided into two arrays- sorted & sorted, like cards ,
    // and place the first element of unsorted at right position of sorted array
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i]; // 3
            int prev = i - 1; // 0
            // finding right pos to place element- descending
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }
    }

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        // taking largest value from array
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);// 8
        }
        int count[] = new int[largest + 1]; // 8

        // updating new array with- counting frequency of numbers
        for (int j = 0; j < arr.length; j++) {
            count[arr[j]]++;
            // System.out.println("each count: " + count[arr[j]]);
        }
        // updating elements in the original array- decreasing order
        int j = 0;
        for (int i = count.length-1; i >= 0; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        printArr(arr);
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countingSort(arr);
        printArr(arr);
    }
}
