//https://www.hackerrank.com/contests/perplexed-codefest17/challenges/the-six-thatchers?h_r=feed&h_l=dashboard

import java.io.*;
import java.util.*;

public class Solution {
    
    private static int[] swiggitySwooty(int[] fridgeNoteIn, int removeIn){
        int[] fridgeNote = fridgeNoteIn;
        int noteSize = fridgeNote.length;
        int maxRemoveAmount = removeIn;
        int keyNumber = 2;
        int keyRemainder = 1;
        int actualRemoveAmount = 0;
        String possibru = "NO";
        
        /* can I remove at most removeAmount numbers from fridgeNote such that all the numbers left in fridgenote will
        share a keyRemainder when divided by the keyNumber*/
        for (int i =0; i < noteSize; i++){
            /* for each element get the remainder when modulo'd by keyNumber*/
            if( keyRemainder != (fridgeNote[i] % keyNumber)) {
                actualRemoveAmount++;
            }
        }
        if(actualRemoveAmount <= maxRemoveAmount){
            possibru = "YES";
        }
        
        int[] answerLineTwo = {keyNumber, keyRemainder};
        System.out.println(possibru);
        return answerLineTwo;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        int removeAmount = in.nextInt();
        int[] fridgeNote = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            fridgeNote[i] = in.nextInt();
        }
        int[] lineTwoAnswer = swiggitySwooty(fridgeNote, removeAmount);
        for ( int i = 0; i < lineTwoAnswer.length; i++) {
            System.out.printf("%d ", lineTwoAnswer[i]);
        }
    }
}
