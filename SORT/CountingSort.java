public class CountingSort {
    // this fn is used where quantity can be high but values should be low
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);

        }
        // largest+1= coz, index start from 0, & its +ve value
        int count[] = new int[largest + 1];

        // counting frequency by taking number as index here- iterating on original
        // array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // sorting-
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            // updating elements until count[i]>0
            while (count[i] > 0) {
                arr[j] = i; // storing only the index from count array until count ends to 0
                j++;
                count[i]--;
            }

        }
    }

    public static void main(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // for -ve values= divide +ve and -ve array , sort them and join again
    // check on stackoverflow also
    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 3, 2, 7, 3 };
        countingSort(arr);
        main(arr);

    }
}
