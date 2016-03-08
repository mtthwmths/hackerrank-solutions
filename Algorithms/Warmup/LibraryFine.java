import java.io.*;
import java.util.*;

public class Solution {

    /**
     * libraryFine: function for computing library fine given two dates
     */
    public static int libraryFine(int[] expDate, int[] retDate) {
        int day = 0, month = 1, year = 2, fine = 0;
        final int YEARFINE = 10000, MONTHFINE = 500, DAYFINE = 15;
        int monthDiff = retDate[month] - expDate[month];
        int dayDiff = retDate[day] - expDate[day];

        // 4. If the book is not returned in the same year, the fine is fixed at 10000 Hackos.
        if(retDate[year] > expDate[year]){
            fine = YEARFINE;
        }
        else if(retDate[year] == expDate[year]) {

            // 3. If the book is not returned in the same month but in the same year as the expected return date,
            //    Fine = 500 Hackos    Number of late months
            if (retDate[month] > expDate[month]) {
                fine = monthDiff * MONTHFINE;
            }
            else if (retDate[month] == expDate[month]){

                // 2. If the book is returned in the same month as the expected return date,
                //    Fine = 15 Hackos × Number of late days
                if (retDate[day] > expDate[day]) {
                    fine = dayDiff * DAYFINE;
                }
            }
        }

        // 1. If the book is returned on or before the expected return date, no fine will be charged, 
        //    in other words fine is 0.
        return fine;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);

        final int NUMDATEFIELDS = 3; // 1.month 2.day 3.year

        int[] expDate = new int[NUMDATEFIELDS];
        int[] retDate = new int[NUMDATEFIELDS];

        //get the expected return date
        for (int i = 0; i < NUMDATEFIELDS; i++) {
            retDate[i] = in.nextInt();
        }
        //get the actual return date
        for (int i = 0; i < NUMDATEFIELDS; i++) {
            expDate[i] = in.nextInt();
        }
        System.out.println(libraryFine(expDate, retDate));

    }
}