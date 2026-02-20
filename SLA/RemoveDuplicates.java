import java.util.Scanner;

public class RemoveDuplicates {
    public static void removeDuplicates(int[] arr){
        int n = arr.length;
        boolean[] visited = new boolean[n];
        System.out.println("Array after removing duplicates: ");
        for(int i = 0; i < n; i++){
            if(visited[i]) continue;

            boolean isDuplicate = false;
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    isDuplicate = true;
                }
            }
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter" + n + "elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        removeDuplicates(arr);
        sc.close();
    }
}

// public static int[] removeDuplicatesKeepOrder(int[] arr) {
//         int[] temp = new int[arr.length];
//         int j = 0; // Tracks the number of unique elements added to temp

//         for (int i = 0; i < arr.length; i++) {
//             boolean isDuplicate = false;
            
//             // Check if arr[i] is already in our temp array
//             for (int k = 0; k < j; k++) {
//                 if (arr[i] == temp[k]) {
//                     isDuplicate = true;
//                     break; 
//                 }
//             }
            
//             // If it wasn't found, add it to temp
//             if (!isDuplicate) {
//                 temp[j] = arr[i];
//                 j++;
//             }
//         }

//         // Return a new array trimmed to the correct size
//         return Arrays.copyOf(temp, j);
//     }


// public static int[] removeDuplicates(int[] arr) {
//         if (arr.length == 0) return arr;

//         // Step 1: Sort the array so duplicates are adjacent
//         Arrays.sort(arr);

//         // Step 2: Use a pointer 'j' to track unique elements
//         int j = 0; 
//         for (int i = 0; i < arr.length; i++) {
//             // Include the first element, or any element that differs from the previous one
//             if (i == 0 || arr[i] != arr[i - 1]) {
//                 arr[j] = arr[i];
//                 j++;
//             }
//         }

//         // Step 3: Return a new array trimmed to the number of unique elements
//         return Arrays.copyOf(arr, j); 
//     }