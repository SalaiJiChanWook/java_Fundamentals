
package Basic.Opreations;

import java.util.Scanner;
public class Opreator {
    public static void main(String[] args) {
        int firstNum,secondNum;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Your First Number: ");
        firstNum = input.nextInt();
        System.out.println("Enter Your Second Number: ");
        secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("The sun of the two numbers is: "+sum);
        int difference = firstNum - secondNum;
        System.out.println("The difference of the two numbers is: "+difference);
        int product = firstNum * secondNum;
        System.out.println("The product of the two numbers is: "+product);
        int quotient = firstNum / secondNum;
        System.out.println("The quotient of the two numbers is: "+quotient);
        int modulus = firstNum % secondNum;
        System.out.println("The modulus of the two numbers is: "+modulus);
    }
}
