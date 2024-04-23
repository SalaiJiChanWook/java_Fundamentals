
package javabaasic;
import java.util.Scanner;
public class ThreeDigitsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("INput three digits: ");
        int number = sc.nextInt();
        int first = number/100;
        int second = (number%100)/10;
        int third = (number%100)%10;
        System.out.println("The first is: "+ first+ " The second is: "+second+" Third digit: "+third);
        
    }
}
