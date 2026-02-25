package SLA;
// 9875 → 9+8+7+5 = 29
// 29 → 2+9 = 11
// 11 → 1+1 = 2
public class ReduceSingleDigit {
    public static int reduceToSingleDigit(int num) {
        num = Math.abs(num); // handle negative numbers safely
        
        while (num >= 10) {  // repeat until single digit
            int sum = 0;
            
            while (num > 0) {
                sum += num % 10; // extract last digit
                num /= 10;       // remove last digit
            }
            
            num = sum;
        }
        
        return num;
    }
public static void main(String[] args) {
        int n = 9875;
        System.out.println(reduceToSingleDigit(n)); // Output: 2
    }
}

// Iteration 1

// Initial state:

// num = 9875

// We enter outer loop because 9875 >= 10

// Inner loop extracts digits one by one:

// Step	num	num % 10	sum	num after num/=10
// 1	9875	5	5	987
// 2	987	7	12	98
// 3	98	8	20	9
// 4	9	9	29	0

// Inner loop ends.

// Now:

// sum = 29
// num = 29
// Iteration 2
// num = 29

// Still ≥ 10, so repeat.

// Step	num	num % 10	sum	num after num/=10
// 1	29	9	9	2
// 2	2	2	11	0

// Now:

// sum = 11
// num = 11
// Iteration 3
// num = 11

// Still ≥ 10.

// Step	num	num % 10	sum	num after num/=10
// 1	11	1	1	1
// 2	1	1	2	0

// Now:

// sum = 2
// num = 2
// Iteration 4
// num = 2

// Now 2 < 10, so outer loop stops.

// Final answer:

// 2