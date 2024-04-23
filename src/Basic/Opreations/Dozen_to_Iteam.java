
package Basic.Opreations;

import java.util.Scanner;
public class Dozen_to_Iteam {
    public static void main(String[] args) {
        int dozen,iteam, totalIteams;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Input Dozen: ");
        dozen = input.nextInt();
        System.out.println("Input Iteam ammout: ");
        iteam = input.nextInt();
        
        totalIteams = (dozen*12)+ iteam;
        System.out.println("Total Iteam is: "+ totalIteams);
    }
}
