import java.util.Scanner;

public class SmallestNuminArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] a  = new int[size];
        for(int i = 0; i < size; i++){
            a[i] = sc.nextInt();
        }
        int min = a[0];
        for(int i = 0; i < size; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("The smallest number is: " + min);
        sc.close();
    }
}
