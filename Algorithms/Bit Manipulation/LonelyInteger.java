import java.io.*;
import java.util.*;

public class Solution {

    static int lonelyinteger(int[] a) {
        // Complete this function
        Arrays.sort(a);
        int[] aSorted = a;
        int lonely = 0;
        int flag = 0;
        for(int i=0; i < aSorted.length; i++) {
            if (flag == 0) {
                lonely = aSorted[i];
            }
            if(i < (aSorted.length -1)) {
                if(lonely == aSorted[i+1]) {
                    i++;
                }
                else {
                    flag = 1;
                }
            }                
        }
        return lonely;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = lonelyinteger(a);
        System.out.println(result);
    }
}
