import java.io.*;
import java.util.*;

public class Solution {

    private static double[] plusMinusRatio(int[] numbersIn) {
        int[] numbers = numbersIn;
        int count = numbers.length;
        double denom = count;
        int plus = 0, minus = 0, zero = 0;
        for (int i = 0; i < count; i++) {
            int currNum = numbers[i];
            if (currNum < 0) {
                minus++;
            }
            else if (currNum > 0) {
                plus++;
            }
            else {
                zero++;
            }
        }
        double[] ratios = {plus/denom, minus/denom, zero/denom};
        return ratios;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = in.nextInt();
        }

        double[] ratios = plusMinusRatio(numbers);
        for (int i = 0; i < ratios.length; i++) {
            System.out.printf("%f\n", ratios[i]);
        }
    }
}
