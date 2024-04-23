
package Sorting;

import java.util.Arrays;


public class BubbleSort {
    public static void main(String[] args) {
        int [] array ={34,52,23,75,6,13,64};
        System.out.println("Before Sorting: " + Arrays.toString(array));
        
        //Solution sort
        //outer loop
        for (int i = 0; i < array.length; i++){
            //inner loop
            for(int j = 1; j < array.length; j++){
                if(array[j=1] > array[j]){//array[i]
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
            
        }
        System.out.println("\nAfter Solution: " + Arrays.toString(array));
    }
}
