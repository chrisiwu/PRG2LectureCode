package at.ac.fhcampuswien.block02.examples.example01;

public class Example01 {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) { // start from the second element
            int key = arr[i];
            int j = i - 1;

            // shift elements to the right to make space for the key
            for (; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }

            // insert the key at the right position
            arr[j + 1] = key;
        }
    }
}