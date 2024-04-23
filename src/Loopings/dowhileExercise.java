package Loopings;

import java.util.Scanner;

public class dowhileExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter second number: ");
            int num2 = sc.nextInt();
            System.out.println("Enter opreator: ");
            char opreator = sc.next().charAt(0);
            switch (opreator) {
                case '+':
                    System.out.println("Addition: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Substraction: " + (num1 - num2));
                    break;
            }
             System.out.println("Do you really want to containue?: Y/N");
        choice = sc.next().charAt(0);
        } 

        while (choice == 'Y');
    }

}
