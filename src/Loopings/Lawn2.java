package Loopings;

import java.util.Scanner;

public class Lawn2 {

    public static void main(String[] args) {
        int i = 0;

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input the width in ft unit that you want to: ");
            double width = sc.nextDouble();
            System.out.println("Input the length in ft unit that you want to: ");
            double length = sc.nextDouble();
            double A_sqfeet = length * width;
            System.out.println("Calculating the fee...");
            System.out.println("Please don't turn off your program...");
            double weekly = 0;
            if (A_sqfeet <= 400) {
                System.out.println("Weekly pay: " + (weekly = 25) + "$");
            } else if (A_sqfeet > 400 && A_sqfeet <= 600) {
                System.out.println("Weekly pay: " + (weekly = 35) + "$");
            } else if (A_sqfeet > 600) {
                System.out.println("Weekly pay: " + (weekly = 50) + "$");
            } else {
                System.out.println("You are entering with invalid number...");
            }
            double seasonalfee = weekly * 20;
            System.out.println("Your Seasonal payment: " + seasonalfee);
            System.out.println("You can choice other paments Below...");
            System.out.println("Choice a payment that you want to: \nA for Once\nB for Twice \nC for 20 times per year");
            String payment = sc.next();
            
            if (payment.equalsIgnoreCase("A")) {
                double PaymentAmout = seasonalfee;
                System.out.println("Your Payment Amout: " + PaymentAmout);
            } else if (payment.equalsIgnoreCase("B")) {
                double PaymentAmout = seasonalfee + 10;
                System.out.println("Your Payment Amout: " + PaymentAmout);
            } else if (payment.equalsIgnoreCase("C")) {
                double PaymentAmout = seasonalfee + 60;
                System.out.println("Your Payment Amout: " + PaymentAmout);
            } else {
                System.out.println("Please input under the  right payment flow...");
            }
            i++;
            System.out.println("######################>>" + i + "<<#####################");
        }
    }
}
