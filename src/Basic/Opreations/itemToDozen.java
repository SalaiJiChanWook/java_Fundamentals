
package Basic.Opreations;

import java.util.Scanner;

public class itemToDozen {
    public static void main(String[] args) {
        int dozen,iteam, totalIteams;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Input Total Iteam ammout: ");
        totalIteams = input.nextInt();
        iteam = totalIteams%12;
        System.out.println("Your Iteam: "+ iteam);
        dozen = totalIteams/12;
        System.out.println("Your Dozen: "+ dozen);
    }
}
