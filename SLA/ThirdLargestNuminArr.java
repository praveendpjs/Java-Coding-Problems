import java.util.Scanner;

public class ThirdLargestNuminArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] a  = new int[size];
        for(int i = 0; i < size; i++){
            a[i] = sc.nextInt();
        }
        int first = a[0];
        int second = a[0];
        int third = a[0];
        for(int i = 1; i < size; i++){
            if(a[i] > first){
            	third = second;
            	second = first;
                first = a[i];
            }
            else if(a[i] < first && (second == first || a[i] > second)) {
            	third = second;
            	second = a[i];
            }
            else if(a[i] < second && (third == second || a[i] > third)) {
            	third = a[i];
            }
            
        }
        System.out.println("The largest number is: " + first);
        System.out.println("The second largest number is: " + second);
        System.out.println("The third largest number is: " + third);
        sc.close();
    }
}

// Using selection sort
// public class SecondThirdLargest {
//     public static void main(String[] args) {
//         int[] arr = {10, 5, 20, 8, 25, 15};

//         for (int i = 0; i < 3; i++) {
//             int maxIndex = i;

//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] > arr[maxIndex]) {
//                     maxIndex = j;
//                 }
//             }

//             // swap
//             int temp = arr[i];
//             arr[i] = arr[maxIndex];
//             arr[maxIndex] = temp;
//         }

//         System.out.println("Second largest: " + arr[1]);
//         System.out.println("Third largest: " + arr[2]);
//     }
// }