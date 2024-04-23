
package javabaasic;

import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter mark: ");
        int mark = sc.nextInt();
        if (mark >= 0 && mark <= 100){
            if(mark < 40){
                System.out.println("Fail..");
            }else if(mark >= 40 && mark <= 60){
                System.out.println("Passed...");
            }else if(mark >= 60 && mark <=80){
                System.out.println("Pass with Merit..");
            }else if(mark >= 80 && mark <= 100){
                System.out.println("Pass with Distinction..");
            }
        }else{
            System.out.println("Invalid_Number");
        }
        
    }
}
