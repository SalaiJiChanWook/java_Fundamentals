
package javabaasic;
import java.util.Scanner;
public class TotalSecondsTimeRate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total seconds: ");
        int totalSeconds = input.nextInt();
        
        int hours = totalSeconds/3600;
        int minute = (totalSeconds%3600)/60;
        int second = (totalSeconds%3600)%60;
        System.out.println("Time: "+ hours +"hours"+minute+"minutes"+second+"seconds");
    }
}
