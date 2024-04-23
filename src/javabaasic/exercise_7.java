
package javabaasic;

import java.util.Scanner;

public class exercise_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the length in: ");
        int length = input.nextInt();
        System.out.println("Input the width: ");
        int width = input.nextInt();
        System.out.println("Your area is : "+ length*width);
        
    }
}
