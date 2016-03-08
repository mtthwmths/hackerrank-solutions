import java.io.*;
import java.util.*;

public class Solution {

    private static int matrixDiagDiff(int[] matrixIn, int dimensionIn) {
        int[] matrix = matrixIn;
        int dimension = dimensionIn;
        int leftDiff = 0;
        int rightDiff = 0;

        for (int i = 0; i < dimension; i++) {
            leftDiff += matrix[(i * dimension) + i];
            rightDiff += matrix[(i * dimension) + dimension - 1 - i];
        }
        return Math.abs(rightDiff - leftDiff);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);
        int dimension = in.nextInt();
        int[] matrix = new int[dimension * dimension];
        int diagDiff;

        //read in a dimension x dimension square matrix of ints
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrix[(dimension * i) + j] = in.nextInt();
            }
        }

        diagDiff = matrixDiagDiff(matrix, dimension);

        System.out.println(diagDiff);
    }
}
