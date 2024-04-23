
package javabaasic;

import java.util.Scanner;
public class KmToMConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the Miles: ");
       int miles = input.nextInt();
       float kelometer = (float) (miles * 1.60934);
        System.out.println("There are: "+kelometer+"Km");
        
        
    }
}
