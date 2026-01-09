import java.util.Scanner;

public class MultiDimArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of column:");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        // Input
        for(int i = 0; i <rows; i++ ){
            for(int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // Display
        for(int i = 0; i <rows; i++ ){
            for(int j = 0; j < cols; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
        sc.close();


        }
    }

