
package javabaasic;

import java.util.Scanner;
public class IF_Else_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int mark = sc.nextInt();
        
     /**   if (mark >= 40){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }**/
     if (mark >= 40 && mark <= 100){
         System.out.println("Pass");
     }else{
         System.out.println("Fail");
     }
    }
}
