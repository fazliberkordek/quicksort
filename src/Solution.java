/**
 * @author fazliberkordek
 */
//quicksort algorithm:
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import static java.util.Collections.swap;

public class Solution {
    public static void quicksort(int[] array) {
        quicksort(array,0,array.length-1);
    }

    public static void quicksort(int[] array, int left, int right) {

        if(left >= right){
            return;
        }
        int pivot = array[(left+right)/2];
        int index = partition(array,left,right,pivot);
        quicksort(array,left,index-1);
        quicksort(array,index,right);
    }

    public static int partition(int[] array, int left, int right, int pivot) {
        while (left<=right){
            while (array[left]<right){
                left++;
            }
            while (array[right]>pivot){
                right--;
            }
            if(left<=right){
                swap(array,left,right);
                left++;
                right--;

            }
        }return left;
    }

}