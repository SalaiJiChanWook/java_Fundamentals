
package javabaasic;

import java.util.Scanner;
public class PayRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your hourly pay rate: ");
        int payRate = sc.nextInt();
        System.out.println("Enter working hour: ");
        int hour = sc.nextInt();
        
        int grossPay = payRate + hour;
        System.out.println("Gross pay: "+ grossPay);
        
        //13% ==> 0.13
        double withholdingTax = grossPay * 0.13;
        System.out.println("With Holding Tax: " +withholdingTax);
        double netPay = grossPay ;
        System.out.println("Net Pay: " + netPay);
        
    }
}
