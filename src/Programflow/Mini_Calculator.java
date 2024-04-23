
package Programflow;

import java.io.IOException;
import java.util.Scanner;

public class Mini_Calculator {
    public static void main(String[] args) throws IOException {
        while (true){
        Scanner sc = new Scanner (System.in);
        System.out.println("Input an Integer x: ");
        int x = sc.nextInt();
        System.out.println("Input an Integer y: ");
        int y = sc.nextInt();
        System.out.println("Input an opreator (+,-,*,/,%)");
        char opreator = (char) System.in.read();
        switch (opreator){
            case '+': System.out.println("Addition: "+(x+y));break;
            case '-': System.out.println("Substraction: "+(x-y));break;
            case '*': System.out.println("Multiplication: "+(x*y));break;
            case '/': System.out.println("Division: "+(x/y));break;
            case '%': System.out.println("Remainder: "+(x%y));break;
            default:System.out.println("Invalid_Value");break;
        }}
        
    }
}
