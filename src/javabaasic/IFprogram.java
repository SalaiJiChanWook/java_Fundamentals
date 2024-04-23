
package javabaasic;
import java.util.Scanner;
public class IFprogram {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
        System.out.println("Enter your mark: ");
        int mark = sc.nextInt();
        // if (condition){ 
        // statement}
        if(mark >= 40){
            System.out.println("Pass");
        }
        if(mark < 40){
            System.out.println("Fail");
        }
    }
}
