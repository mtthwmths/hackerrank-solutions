import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        
        int num = in.nextInt();
        
        BigInteger fact = new BigInteger(String.valueOf(num));
        
        for (int i = 1; i < num; i++) {
            fact = fact.multiply(new BigInteger(String.valueOf(num - i)));
        }
        
        System.out.println(fact.toString());
    }
}
