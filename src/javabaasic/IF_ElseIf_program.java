
package javabaasic;

import java.util.Scanner;
public class IF_ElseIf_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the mark: ");
       int mark = sc.nextInt();
       if (mark >= 80 && mark<=100){
           System.out.println("You passed with distinction...!");
       }
       else if(mark >= 60 && mark <= 80 ){
        System.out.println("You passed the exam..with Merit!");
    }
       else if(mark >= 40 && mark <= 60){
           System.out.println("You passed the exam");
       }
       else{
           System.out.println("You failed....");
       }
    }
}
