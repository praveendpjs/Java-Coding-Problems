// Given two arrays find their intersection (common elements). Without using predefined methods
// Input: [1,2,3,4],[3,4,5,6]
// Output: [3,4]
package Humworld;

public class Intersectionelements {
    public static int[] intersection(int[] a, int[] b) {

        int[] temp = new int[a.length];
        int index = 0;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

                if (a[i] == b[j]) {

                    // check duplicates in result
                    boolean already = false;

                    for (int k = 0; k < index; k++) {
                        if (temp[k] == a[i]) {
                            already = true;
                            break;
                        }
                    }

                    if (!already) {
                        temp[index++] = a[i];
                    }
                }
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 3, 4, 5, 6 };

        int[] res = intersection(a, b);

        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
