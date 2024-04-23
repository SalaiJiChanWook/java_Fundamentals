
package Array;

import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int array[] = {2, 5, 8, 8, 12, 45, 92};
        System.out.println("Array: "+ Arrays.toString(array));
        
        System.out.println("Enter element that you want to search: ");
        int element = sc.nextInt();
        
        int firstpoint =0,lastpoint = array.length-1;
        
        while(firstpoint <= lastpoint){
            int midpoint = (firstpoint + lastpoint) /2;
            if(element > array[midpoint]){
                firstpoint = midpoint + 1;
            }
            else if(element < array[midpoint]){
                lastpoint = midpoint - 1;
            }
            else {
                System.out.println("Element  ");
            }
        }
    
    
    }

}
