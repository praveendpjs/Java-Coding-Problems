// Sort an array using insertion sort
package Humworld;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int key = arr[i];

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 8, 3, 5, 2, 9, 1 };

        insertionSort(arr);

        for (int n : arr) {
            System.out.print(n + " ");
        }

    }
}
