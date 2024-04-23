
package Programflow;

import java.io.IOException;
import java.util.Scanner;

public class Calculator_mini {
    public static void main(String[] args)throws IOException {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter an Integer: ");
        int x = input.nextInt();
        System.out.println("Enter another Integer: ");
        int y = input.nextInt();
        System.out.println("Enter opreator(*,/,+,-,%");
        char opreators = (char)System.in.read();
        if (opreators == '+'){
            System.out.println("Addition: "+ (x + y));
        }else if(opreators == '-'){
            System.out.println("Substraction: "+ (x - y));
        }
        else if(opreators == '*'){
            System.out.println("Multiplication: "+ (x*y));
        }else if(opreators == '/'){
            System.out.println("Division: "+ (x/y));
        }else if(opreators == '&'){
            System.out.println("Remainder: "+ (x%y));
        }else{
            System.out.println("Invalid_Value");
        }
    }
}
