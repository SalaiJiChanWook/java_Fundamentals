
package javabaasic;
import java.util.Scanner;
public class TotalSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input Hour: ");
        int hour = sc.nextInt();
        
        System.out.println("Input minutes: ");
        int minute = sc.nextInt();
        
        System.out.println("Input seconds: ");
        int second = sc.nextInt();
        
        System.out.println("Total Seconds: "+ (((hour*60)+minute)*60)+ second);
    }
}
