package GeeksForGeeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLeaders {
    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> result = new ArrayList<>();

        int maxRight = Integer.MIN_VALUE;

        // Traverse from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                result.add(arr[i]);
                maxRight = arr[i];
            }
        }

        // We collected in reverse order, fix it
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        System.out.println(findLeaders(arr));
    }
}
