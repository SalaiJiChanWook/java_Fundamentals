
package Basic.Opreations;

import java.util.Scanner;
public class Boolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter your name: ");
        String name = sc.next();
        
        sc.nextLine();
        System.out.println("Enter Your email: ");
        String email = sc.nextLine();
        
        //Next => index 0, nextLine => all
        //Jack AA => Jack (next)
        //Jack AA=> Jack AA (nextLine)
        System.out.println("Enter your name ha: ");
        String name1 = sc.next();
        System.out.println(name1);
        
        System.out.println("Enter your name haha: ");
        String name2 = sc.nextLine();
        System.out.println(name2);
    }
}
