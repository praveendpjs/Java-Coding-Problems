
import java.util.Scanner;

public class ReverseAnInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();

        int reversed = 0;
        while(num!=0){
            int digit = num % 10; //Get the last digit
            reversed = reversed * 10 + digit; //Adds the digit at the end of reversed number
            num = num/10; // Removes the digit, until num becomes 0
        }
        System.out.println("Reversed number is " + reversed);
        scan.close();
    }
}
