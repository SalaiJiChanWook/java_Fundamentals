package Sorting;

import  java.util.Arrays;
public class sort_0 {
    public static void main(String[] args) {
        int [] array ={34,52,23,75,6,13,64};
        System.out.println("Before Sorting: " + Arrays.toString(array));
        
        //Solution sort
        //outer loop
        for (int i = 0; i < array.length; i++){
            int minimum = i ;
            //inner loop
            for(int j =  i+1; j < array.length; j++){
                if(array[minimum] > array[j]){//array[i]
                    minimum = j;
                }
            }
            int temp = array[minimum];
            array[minimum] = array[i];
            array[i] = temp;
        }
        System.out.println("\nAfter Solution: " + Arrays.toString(array));
    }
}
