import java.util.Scanner;

public class MatrixMultip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and col for matrix: A");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		System.out.println("Enter rows and col for matrix: B");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		if(c1 != r2) {
			System.out.println("Matrix multiplication is not possible");
			
        }
		int[][] A = new int[r1][c1];
		int[][] B = new int[r2][c2];
//		Matrix multiplication array
		int[][] C = new int[r1][c2];
		
		System.out.println("Enter matrix A");
		
		for(int i = 0; i < r1; i++) {
			for(int j = 0; j < c1; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter matrix B");
		
		for(int i = 0; i < r2; i++) {
			for(int j = 0; j < c2; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < r1; i++) {
			for(int j = 0; j < c2; j++) {
				for(int k = 0; k < c1; k++) {
					C[i][j] += A[i][k] * B[k][j]; 
				}
			}
		}
		System.out.println("Multiplication result");
		for(int i = 0; i < r1; i++) {
			for(int j = 0; j < c2; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
        sc.close();
    }
}
