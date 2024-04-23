
package Array;

import java.util.Arrays;
import java.util.Scanner;
public class Linearsearch_int {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Scanner sc = new Scanner (System.in);
        int array[] = {2, 5, 8, 8, 12, 45, 92};
        System.out.println("Array: "+ Arrays.toString(array));
        
        System.out.println("Enter element that you want to search: ");
        int element = sc.nextInt();
        int i;
        for( i=0; i < array.length; i++){
            if(element == array[i]){
                System.out.println("Element found at index: "+i);
                break;
            }
        }
        if(i == array.length) {
            System.out.println("Element not found.");
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total Time: "+ totalTime + "milliseconds");
    }
}
