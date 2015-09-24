import java.io.*;
import java.util.*;

public class Solution {

    private static int arraySum(int[] numbersIn) {
        int[] numbers = numbersIn;
        int numbersLength = numbers.length;
        int sum = 0;
        for (int i=0; i < numbersLength; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numberOfInts = in.nextInt();
        int[] numbers = new int[numberOfInts];
        int sum;

        for (int i=0; i < numberOfInts; i++) {
            numbers[i] = in.nextInt();
        }

        sum = arraySum(numbers);
        System.out.println(sum);
    }
}
