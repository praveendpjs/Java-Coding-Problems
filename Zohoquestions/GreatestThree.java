public class GreatestThree {
    public static void main(String[] args) {
        int num1 = 10, num2 = 25, num3 = 15; // Example numbers

        // Use a nested ternary operator to find the greatest number
        int greatest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

        // Print the result
        System.out.println("The greatest of the three numbers is: " + greatest);
    }
}
