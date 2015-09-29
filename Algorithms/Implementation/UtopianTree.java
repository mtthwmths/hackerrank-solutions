import java.util.*;

public class Solution{
    private static final int initialHeight = 1;
    
    public static void main(String[] args){
        int numTests;
        Scanner sc = new Scanner(System.in);
        numTests = sc.nextInt();
        int numCycles;
        int height;
        int i = 0;
        while (i < numTests){
            numCycles = sc.nextInt();
            height = initialHeight;
            for(int j =0;j < numCycles;j++){
                if (j%2 == 0){
                    height *= 2;
                }
                else {
                    height += 1;
                }
            }
            System.out.println(height);
            i++;
        }
    }
}
