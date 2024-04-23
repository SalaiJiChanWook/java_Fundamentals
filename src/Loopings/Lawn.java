
package Loopings;

import java.util.Scanner;
public class Lawn {
    public static void main(String[] args) {
        int i = 0;
        while(true){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the width in ft unit that you want to: ");
        double width = sc.nextDouble();
        System.out.println("Input the length in ft unit that you want to: ");
        double length = sc.nextDouble();
        double A_sqfeet = length * width;
        System.out.println("Calculating the fee...");
        System.out.println("Please don't turn off your program...");
        double weekly = 0;
        if(A_sqfeet <=400){
            System.out.println("Weekly pay: "+(weekly=25)+"$");
        }else if(A_sqfeet > 400 && A_sqfeet <= 600){
            System.out.println("Weekly pay: "+(weekly=35)+"$");
        }else if(A_sqfeet > 600){
            System.out.println("Weekly pay: "+(weekly=50)+"$");
        }else{
            System.out.println("You are entering with invalid number...");
        }
        System.out.println("Seasonal pay rate is: "+(weekly*20)+"$");
        i++;
            System.out.println("####################Page>>"+i+"<<###################");
    }
    }
}
