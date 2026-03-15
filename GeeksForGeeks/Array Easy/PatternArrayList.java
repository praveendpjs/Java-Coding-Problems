package GeeksForGeeks;

import java.util.ArrayList;
import java.util.Scanner;

public class PatternArrayList {
    public ArrayList<Integer> printPat(int n) {

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = n; i >= 1; i--) {

            int total = n * i;

            for(int p = 0; p < total; p++) {
                int num = n - (p / i);
                result.add(num);
            }

            result.add(-1);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PatternArrayList sol = new PatternArrayList();
        ArrayList<Integer> ans = sol.printPat(n);

        System.out.println(ans);

        sc.close();
    }
}
