public class Pattern4 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j] + " ");
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
