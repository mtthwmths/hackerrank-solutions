import java.io.*;
import java.util.*;

public class Solution {

    /**
    * printStairs: a method to print right justified hashtag stairs of height
    * numStairsIn.
    * @param int numStairsIn: the height of the "staircase"
    * @return void returns nothing.
    */
    private static void printStairs(int numStairsIn) {
        int numStairs = numStairsIn;

        for(int i = 0; i < numStairs; i++) {
             //print a staircase
             for(int j = i; j < (numStairs - 1); j++) {
                 System.out.print(" ");
             }
             for(int k = 0; k < (i + 1); k++){
                 System.out.print("#");
             }
             System.out.print("\n");
         }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);
        int numStairs = in.nextInt();
        printStairs(numStairs);
    }
}
