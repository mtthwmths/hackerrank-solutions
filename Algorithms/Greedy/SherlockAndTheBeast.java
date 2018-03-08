import java.io.*;
import java.util.*;
import java.lang.StringBuilder;

public class Solution {

    private static int decentNumber(int digitsIn) {
        int digits = digitsIn;
        int fives = 0;
        int result = 0;
        StringBuilder decent = new StringBuilder();

        while (digits > 0) {
            if ((digits%3) == 0) {
                fives += digits;
                digits = 0;
            }
            else {
                digits = digits - 5;
            }
        }
        if (digits == 0) {
            for (int i = 0; i < digitsIn; i++) {
                if (fives > 0) {
                    decent.append(5);
                    fives--;
                }
                else {
                    decent.append(3);
                }
            }
            System.out.println(decent);
        }
        else {
            System.out.println(-1);
        }

        return 0;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numberDecents = in.nextInt();
        for (int i = 0; i < numberDecents; i++) {
            decentNumber(in.nextInt());
        }
    }
}
