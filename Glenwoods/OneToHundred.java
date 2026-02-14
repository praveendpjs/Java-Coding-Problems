//Print 1 to 100 without using any number

package Glenwoods;

public class OneToHundred {
    public static void main(String[] args) {
        // 'B' - 'A' gives 1
        // 'd' gives 100 (ASCII value)
        for (int i = (int)'B' - (int)'A'; i <= (int)'d'; i++) {
            System.out.println(i);
        }
    }
}
