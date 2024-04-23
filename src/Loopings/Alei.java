
package Loopings;

import java.util.Scanner;
public class Alei {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input a number You want to see: ");
        int x = sc.nextInt();
        int i = 0;
            while(i<=12){
            System.out.println(x+"\tX\t"+i+"\t=\t"+(x*i));
            i++;
            
        }
    }
}
