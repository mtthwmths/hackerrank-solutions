import java.io.*;
import java.util.*;

public class Solution {

    public static String milTime(String timeIn) {

        String time = timeIn;
        int length = time.length();
        String timeOut = "";

        if(length == 10){
            String hours = time.substring(0, 2);
            int hour = Integer.parseInt(hours);
            String minsAndSecs = time.substring(2, 8);
            String modifier = time.substring(8);

            if (modifier.equals("AM")) {
                if (hour < 12 && hour > 0) {
                    timeOut = hours + minsAndSecs;
                }
                else {
                    timeOut = "00" + minsAndSecs;
                }
            }
            else if (modifier.equals("PM")) {
                if (hour < 12 && hour > 0) {
                    timeOut = Integer.toString(hour + 12) + minsAndSecs;
                }
                else {
                    timeOut =  Integer.toString(hour) + minsAndSecs;
                }
            }
            else {
                System.out.println("Please make sure you enter as either \"AM\" or \"PM\" ");
            }
        }
        else {
            System.out.println("please enter a valid time;");
        }
        return timeOut;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String twelveHour = in.nextLine();
        String twentyFour = milTime(twelveHour);
        System.out.println(twentyFour);
    }
}
