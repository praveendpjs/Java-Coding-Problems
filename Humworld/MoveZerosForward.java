// Move all zero to first of the list (without using additional aray)
// Input: 1 0 5 6 0 3 0 0
// Output: 0 0 0 0 1 5 6 3

package Humworld;

public class MoveZerosForward {
    public static int[] moveZeros(int[] arr) {
        int j = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j--;
            }
        }

        while (j >= 0) {
            arr[j] = 0;
            j--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 5, 6, 0, 3, 0, 0 };
        moveZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
