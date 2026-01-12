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
