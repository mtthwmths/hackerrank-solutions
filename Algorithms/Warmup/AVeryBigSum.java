import java.io.*;
import java.util.*;

public class Solution {

    private static double arraySumBigNumbers(double[] bigNumbersIn) {
        double[] bigNumbers = bigNumbersIn;
        int numbersLength = bigNumbers.length;
        double sum = 0;

        for (int i = 0; i < numbersLength; i++) {
            sum += bigNumbers[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numberOfDoubles = in.nextInt();
        double[] doubles = new double[numberOfDoubles];
        double sum;

        for (int i = 0; i < numberOfDoubles; i++) {
            doubles[i] = in.nextDouble();
        }

        sum = arraySumBigNumbers(doubles);

        long prettySum = (long) sum;
        System.out.println(prettySum);
    }
}
