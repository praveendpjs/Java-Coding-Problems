// Given an unsorted array to find continues pair largest sum value.

// Example: A = {0,5,6,0,9,0,1,4} output = 11 (coz 5 + 6 not 9 + 6 because not continuous)
public class LargestSumPair {
    public static void main(String[] args) {
        int[] arr = { 0, 5, 6, 0, 9, 0, 1, 4 };
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] + arr[i + 1] > max) {
                max = arr[i] + arr[i + 1];

            }
        }
        System.out.println(max);
    }
}
