import java.util.Scanner;

public class ReplacingNewArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array");
        for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

        System.out.println("Enter the value to replace: ");
        int oldValue = sc.nextInt();

        System.out.println("Enter the new value: ");
        int newValue = sc.nextInt();

        for(int i = 0; i < size; i++){
            if(arr[i] == oldValue){
                arr[i] = newValue;
            }
        }
        System.out.println("Updated array: ");
        for(int i = 0; i < size; i++){
            System.out.print(" "+ arr[i]);
        }
        sc.close();
    }
}
