
package Loopings;

import java.util.Scanner;
public class Employee_hourlypayrate {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i = 0;
        while(true){
        System.out.println("Input work_hour: ");
        int hr = sc.nextInt();
        System.out.println("Input Pay_ment in an hour: ");
        double pay = sc.nextDouble();
      double  total_0 = hr * pay;
        System.out.println("Your payment is: "+ total_0+"$"+"(without holding tax)");
        if(total_0>=0 & total_0 <= 300.00){
            double tax = total_0*10/100;
            System.out.println("tax: "+tax+"\n next pay with holding tax: "+ (total_0-tax)+"$");
        }else if(total_0>300.00 & total_0<=400.00){
            double tax = total_0*12/100;
            System.out.println("tax: "+tax+"\n next pay with holding tax: "+ (total_0-tax)+"$");
        }else if(total_0>400.00 & total_0<=500.00){
            double tax = total_0*15/100;
          System.out.println("tax: "+tax+"\n next pay with holding tax: "+ (total_0-tax)+"$");
        }else{
            double tax = total_0*20/100;
            System.out.println("tax: "+tax+"\n nxet pay with holding tax: "+ (total_0-tax)+"$");
        }
        i++;
            System.out.println("#######################Page=>("+i+")<#######################");
        }
    }
}     
