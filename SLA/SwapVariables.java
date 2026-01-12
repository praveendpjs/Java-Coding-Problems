public class SwapVariables {
    public static void main(String[] args) {
        // Using variable
        int a = 10;
        int b = 20;
        System.out.println("Before swapping " + a + " " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping " + a + " " + b);
        // Using array
        int c = 7;
        int d = 8;
        System.out.println("Before swapping " + c + " " + d);
        int[] tempArr = {c , d};
        c = tempArr[1];
        d = tempArr[0];
        System.out.println("After swapping " + c + " " + d);

        // Without third variable(Arithmetic)
        int e = 10;
        int f = 20;

        System.out.println("Before swapping: e = " + e + ", f = " + f);

        // Swapping logic
        e = e + f; // a becomes sum of initial a and b (10 + 20 = 30)
        f = e - f; // b becomes original a (30 - 20 = 10)
        e = e - f; // a becomes original b (30 - 10 = 20)

        System.out.println("After swapping: e = " + e + ", f = " + f);
        // Without third variable(XOR)

         int g = 10; // Binary: 1010
        int h = 20; // Binary: 10100

        System.out.println("Before swapping: g = " + g + ", b = " + h);

        // Swapping logic
        g = g ^ h; // a becomes a ^ b 
        h = g ^ h; // b becomes (a ^ b) ^ b, which is the original a
        g = g ^ h; // a becomes (a ^ b) ^ a, which is the original b

        System.out.println("After swapping: h = " + g + ", b = " + h);

    }
}
