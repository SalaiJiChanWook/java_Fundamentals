package Array;

import java.util.Scanner;

public class ThreeSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number: ");
        int a;
        int i = 0;
        int sum = 0;
        while (i < 3) {
            a = sc.nextInt();
            int array_store[] = new int[a];

            array_store[i] = a;
            sum += array_store[i];
            i++;
        }
        System.out.println("The sum of the three number is: "+ sum);

    }
}
