import java.util.Scanner;

public class RemovingElementFromArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7};
		int[] newArr = new int[arr.length - 1];
		int target = scan.nextInt();
		for(int i = 0, k = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				continue;
			}
			newArr[k] = arr[i];
			k++;
		}
		for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		scan.close(); 
    }
}
