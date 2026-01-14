// Print the number in between x and y which is present in the array
// Condition x < y always
// Array = {4,3,7,11,50,1}
// Test case 1: x = 4, y = 10 output = 7
// Test case 1: x = 10, y = 14 output = 11

public class InBetweenNums {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 7, 11, 50, 1 };
        int x = 4;
        int y = 10;
        if (x < y) {
            int i = 0;
            while(i < arr.length){
                if(arr[i] > x && arr[i] < y){
                    System.out.println(arr[i]);
                }
                i++;
            }
        }else{
            System.out.println("Condition is not satisfied");
    }
}
}
// I solved this on my own but too time complexity is too high
// public static int test(int x, int y) {
// int[] arr = { 4, 3, 7, 11, 50, 1 };
// if (x < y) {
// for (int i = 0; i < arr.length; i++) {
// for (int j = x + 1; j < y; j++) {
// if (arr[i] == j) {
// return j;
// }
// }
// }
// }
// return -1;
// }