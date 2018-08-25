import java.util.*;
	
public class MiniMaxSum {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        long[] minAndMax = miniMaxSum(arr);
       
        long min = minAndMax[0];
        long max = minAndMax[1];
        System.out.print(min + " ");
        System.out.println(max);

        scanner.close();
    }
    
    /**
     * miniMaxSum returns a two element array containing the minimum and 
     * maximum value obtainable from summing four elements from a five element
     * array. It first uses mergeSort to put them in order, and from there the
     * last four elements in the array will be the max and the first four will
     * be the minimum.
     * 
     * @param arrIn
     * @return two element array containing the min and max respectively
     */
    public static long[] miniMaxSum(int[] arrIn) {

        // use merge sort to sort the array first
        int[] sortArr = mergeSort(arrIn);
       
        // for max start at the last element and add the last four
        int maxIndex = sortArr.length - 1;
        long maxSum = 0;
        while(maxIndex > sortArr.length -5){
            maxSum += sortArr[maxIndex];
            maxIndex--;
        }
       
        // for min start at the beginning and add the first four
        int minIndex = 0;
        long minSum = 0;
        while(minIndex < 4){
            minSum += sortArr[minIndex];
            minIndex++;
        }
       
        long[] minAndMax = {minSum, maxSum};
        return minAndMax;
    }
   
    /**
     * mergeSort is a basic implementation that uses System.arraycopy to copy
     * the original array into two arrays recursively and then call merge to
     * accomplish the actual sorting.
     * @param arrToSort
     * @return sorted array of the param given
     */
    public static int[] mergeSort(int[] arrToSort){
       
        // don't try to split empty lists...
        if(arrToSort.length <= 1){
            return arrToSort;
        }
       
        // make some arrays for the halves and the result
        int[] sortedarr = new int[arrToSort.length];
        int[] halfOne = new int[arrToSort.length / 2];
        int[] halfTwo = new int[arrToSort.length - halfOne.length];
       
        // using arrayCopy in case they get huge, copy the contents
        // of array into the halves
        System.arraycopy(arrToSort, 0, halfOne, 0, halfOne.length);
        System.arraycopy(arrToSort, halfOne.length, halfTwo, 0, halfTwo.length);
        
       
        // recursion (noun): see 'recursion'
        halfOne = mergeSort(halfOne);
        halfTwo = mergeSort(halfTwo);
       
        // merge the two halves
        sortedarr = merge(halfOne, halfTwo);
       
        return sortedarr;
    }

    /**
     * merge is used by mergeSort to accomplish the actual sorting on the way back
     * out of recursion.
     * @param first
     * @param second
     * @return a sorted array containing both arrays provided
     */
    private static int[] merge(int[] first, int[] second){
       
        int[] mergedarr = new int[first.length + second.length];
       
        // start the index at the first element in all arrays
        int indexFirst = 0;
        int indexSecond = 0;
        int indexMerged = 0;
       
        // compare the numbers at each index and put the smaller at the index
        // in the merged array.
        while(indexFirst < first.length && indexSecond < second.length){
            if(first[indexFirst] < second[indexSecond]){
                mergedarr[indexMerged] = first[indexFirst];
                indexFirst++;
            }
            else {
                mergedarr[indexMerged] = second[indexSecond];
                indexSecond++;
            }
            indexMerged++;
        }
       
        // copy the leftovers into the result array
        if(indexFirst < first.length){
           System.arraycopy(first, indexFirst, mergedarr, indexMerged,
                         first.length - indexFirst);
        }
        if(indexSecond < second.length){
        System.arraycopy(second, indexSecond, mergedarr, indexMerged,
                         second.length - indexSecond);
        }
       
        return mergedarr;
    }
    
}
