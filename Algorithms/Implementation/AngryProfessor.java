import java.io.*;
import java.util.*;

public class Solution {

    private static String haveClass(int[] timesIn, int quotaIn) {
        int[] times = timesIn;
        int quota = quotaIn;
        int numberStudents = times.length;
        int met = 0;

        for (int i = 0; i < numberStudents; i++) {
            if (times[i] <= 0){
                met++;
            }
        }

        return quota>met?"YES":"NO";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int numTestCases = in.nextInt();
        //For each test case, print whether class will continue or not.
        for (int i = 0; i < numTestCases; i++) {
            int numStudents = in.nextInt();
            int studentsNeeded = in.nextInt();
            int[] arrivalTimes = new int[numStudents];
            //Load all the student times into arrivalTimes.
            for (int j = 0; j < numStudents; j++) {
                arrivalTimes[j] = in.nextInt();
            }
            System.out.println(haveClass(arrivalTimes, studentsNeeded));
        }
    }
}