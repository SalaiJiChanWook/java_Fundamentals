
package Array;

import java.util.Arrays;
import java.util.Scanner;
public class intArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int array1[] = {2,3,4,5};
        System.out.println(array1[0]);
        //input array
        int array2[] = new int[3];
        array2[0] = 12;
        array2[1] = 14;
        array2[2] = 10;
        System.out.println(array2[2]);
        int array3[] = new int[10];
        System.out.println("Enter first number: ");
        array3[0] = sc.nextInt();
        System.out.println("Enter second number: ");
        for(int i=0; i<array3.length;i++){
            System.out.println("Enter a number");
            array3[i] = sc.nextInt();
        }
        System.out.println("Array: "+Arrays.toString(array3));
        
        for(int i = 0; i<array3.length;i++){
            System.out.println(array3[i]);
        }
        String array[] = {"AA","BB","CC","DD","EE"};
        for(String i: array){
            System.out.println(i);
        }
        System.out.println("Array length: "+ array.length);
    }
}
